import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
//引入类或接口

public class multi_thread extends Thread {
    private Thread threading;
    ChunkRand rand = new ChunkRand();
    boolean debugging = false;          // 调试设置

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

    // 主程序
    public void run() {//多线程中每个线程的程序
        long seed_found_count = 0;
        long max_seed_found = Long.MAX_VALUE;//最大筛出种子限制
        MCVersion mcv = MCVersion.v1_16_5;// MC版本
        Structure_filter sf = new Structure_filter(mcv);// 定义Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// 同理
        Other_filter of = new Other_filter(mcv);// 同理
        Biome_filter bf = new Biome_filter(mcv);// 同理
        CPos cpos1, cpos2, cpos3;// 定义几个空CPos
        BPos bpos1, bpos2, bpos3;// 定义几个空BPos
        int max = 4;
        for (long seed_now = seed_start; seed_now <= seed_end && seed_found_count < max_seed_found; seed_now++) {
            //seed_now即为当前的种子
            /*ChunkRand rand = new ChunkRand(seed_now);
            BPos sp = of.get_sp(seed_now);
            cpos1 = sf.closest_ow_rp(seed_now, rand, sp.getX(), sp.getZ());//示例，这里筛离坐标原点最近的废门
            cpos1 = sf.filter_ow_rp_surface(seed_now,cpos1);
            cpos1 = sf.filter_ow_rp_enter(seed_now,rand,cpos1);
            if (cpos1 != null) {//如果找到了
                //System.out.println("种子：" + seed_now + " 地表可补废门坐标" + cpos1.toBlockPos());
                System.out.println(seed_now);
                seed_found_count++;
            }*/
            ChunkRand rand = new ChunkRand(seed_now);
            cpos1 = sf.closest_ow_vi(seed_now, rand, 0,0);//示例，这里筛离坐标原点最近的废门
            cpos1 = sf.check_ow_vi(seed_now,cpos1);
            if (cpos1 != null) {//如果找到了
                int tmp = cf.return_ow_vi_blacksmith(seed_now,cpos1);
                if(tmp>=max){
                    max = tmp;
                    System.out.println(seed_now+" "+tmp);
                }
            }
        }
        System.out.println("线程ID：" + thread_name +" 筛种已结束！");

    }
}
