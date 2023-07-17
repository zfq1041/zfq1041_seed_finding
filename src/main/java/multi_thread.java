import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
//�������ӿ�

public class multi_thread extends Thread {
    private Thread threading;
    ChunkRand rand = new ChunkRand();
    boolean debugging = false;          // ��������

    boolean basic_output = true;

    long seed_start;
    long seed_end;
    String thread_name;

    multi_thread(long seed_start, long seed_end, String thread_name) {
        this.seed_start = seed_start;
        this.seed_end = seed_end;
        this.thread_name = thread_name;
    }

    public void start() {
        if (threading == null) {
            threading = new Thread(this, thread_name);
            threading.start();
        }
    }

    // ������
    public void run() {//���߳���ÿ���̵߳ĳ���
        long seed_found_count = 0;
        long max_seed_found = Long.MAX_VALUE;//���ɸ����������
        MCVersion mcv = MCVersion.v1_16_5;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos
        int max = 4;
        for (long seed_now = seed_start; seed_now <= seed_end && seed_found_count < max_seed_found; seed_now++) {
            //seed_now��Ϊ��ǰ������
            /*ChunkRand rand = new ChunkRand(seed_now);
            BPos sp = of.get_sp(seed_now);
            cpos1 = sf.closest_ow_rp(seed_now, rand, sp.getX(), sp.getZ());//ʾ��������ɸ������ԭ������ķ���
            cpos1 = sf.filter_ow_rp_surface(seed_now,cpos1);
            cpos1 = sf.filter_ow_rp_enter(seed_now,rand,cpos1);
            if (cpos1 != null) {//����ҵ���
                //System.out.println("���ӣ�" + seed_now + " �ر�ɲ���������" + cpos1.toBlockPos());
                System.out.println(seed_now);
                seed_found_count++;
            }*/
            ChunkRand rand = new ChunkRand(seed_now);
            cpos1 = sf.closest_ow_vi(seed_now, rand, 0,0);//ʾ��������ɸ������ԭ������ķ���
            cpos1 = sf.check_ow_vi(seed_now,cpos1);
            if (cpos1 != null) {//����ҵ���
                int tmp = cf.return_ow_vi_blacksmith(seed_now,cpos1);
                if(tmp>=max){
                    max = tmp;
                    System.out.println(seed_now+" "+tmp);
                }
            }
        }
        System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");

    }
}
