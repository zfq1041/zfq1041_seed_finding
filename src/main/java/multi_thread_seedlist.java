import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.BastionRemnant;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import nl.jellejurre.seedchecker.SeedChecker;
import nl.jellejurre.seedchecker.SeedCheckerDimension;
import nl.jellejurre.seedchecker.TargetState;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//�������ӿ�

public class multi_thread_seedlist extends Thread {
    private Thread threading;
    ChunkRand rand = new ChunkRand();
    boolean debugging = false;          // ��������

    boolean basic_output = true;

    int index_start;
    int index_end;
    String thread_name;
    String seed_list_path;
    multi_thread_seedlist(int index_start, int index_end, String thread_name, String seed_list_path) {
        this.index_start = index_start;
        this.index_end = index_end;
        this.thread_name = thread_name;
        this.seed_list_path = seed_list_path;
    }

    public void start() {
        if (threading == null) {
            threading = new Thread(this, thread_name);
            threading.start();
        }
    }

    // ������
    /*public void run() {//���߳���ÿ���̵߳ĳ���
        List<String> seed_list = Main.read_seed_list(seed_list_path);
        long seed_found_count = 0;
        long max_seed_found = 65535;//���ɸ����������
        MCVersion mcv = MCVersion.v1_16_1;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos
        String option_path = "E:\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
        List<String> option_text = Main.read_seed_list(option_path);
        String option = option_text.get(1);
        int index_end_max = Integer.parseInt(String.valueOf(Main.get_int(option)));
        if(index_end>index_end_max){
            System.out.println("�߳�ID��" + thread_name +" ���յ���index��������"+index_end+"������Ԥ���趨�Ľ�����"+index_end_max+"�����Զ����������������Ϊintȡ�������⡣");
            index_end=index_end_max;
        }
        System.out.println("�߳�ID��" + thread_name +" ��ʼ�ڵ�"+index_start+"�У��������ڵ�"+index_end+"��");

        for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
            String line = seed_list.get(index_now);
            long seed_now = Main.get_int(line);//seed_now��Ϊ��ǰ�е�����
            ChunkRand rand = new ChunkRand(seed_now);
            cpos1 = sf.closest_ow_rp(seed_now, rand,0, 0);//ʾ��������ɸ������ԭ������ķ���
            if (cpos1 != null) {//����ҵ��ˣ������������һ�����ҵ���
                System.out.println("�߳�ID��" + thread_name +" ���ӣ�" + seed_now + " ��������" + cpos1.toBlockPos());
                seed_found_count++;
            }
        }
        System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");
    }*/

        /*public void run() {//���߳���ÿ���̵߳ĳ���
        List<String> seed_list = Main.read_seed_list(seed_list_path);
        long seed_found_count = 0;
        long max_seed_found = 65535;//���ɸ����������
        MCVersion mcv = MCVersion.v1_16_1;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos
        String option_path = "E:\\Server_Files\\Seed_finding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
        List<String> option_text = Main.read_seed_list(option_path);
        String option = option_text.get(1);
        int index_end_max = Integer.parseInt(String.valueOf(Main.get_int(option)));
        if(index_end>index_end_max){
            System.out.println("�߳�ID��" + thread_name +" ���յ���index��������"+index_end+"������Ԥ���趨�Ľ�����"+index_end_max+"�����Զ����������������Ϊintȡ�������⡣");
            index_end=index_end_max;
        }
        System.out.println("�߳�ID��" + thread_name +" ��ʼ�ڵ�"+index_start+"�У��������ڵ�"+index_end+"��");

        for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
            String line = seed_list.get(index_now);
            long seed_now = Main.get_int(line);//seed_now��Ϊ��ǰ�е�����
            ChunkRand rand = new ChunkRand(seed_now);
            BastionRemnant br = new BastionRemnant(MCVersion.v1_16_5);
            CPos br_1 = br.getInRegion(seed_now, 0, 0, rand);
            CPos br_2 = br.getInRegion(seed_now, -1, 0, rand);
            CPos br_3 = br.getInRegion(seed_now, -1, -1, rand);
            CPos br_4 = br.getInRegion(seed_now, 0, -1, rand);
            CPos[] br_position_list = {br_1, br_2, br_3, br_4};

            int netherite_ingot = 0;
            int netherite_scrap = 0;
            int netherite_de6ris = 0;
            System.out.println("�߳�ID��" + thread_name +" #"+index_now+ " ���ӣ�" + seed_now);

                for (int a = 0; a < 4; a++) {
                    if (br_position_list[a] != null) {
                        if (
                                (Position_filter.dist(br_position_list[a].toBlockPos().getX(), br_position_list[a].toBlockPos().getZ(), -32, -32, 64, 64))
                                        && (sf.filter_ne_br_type(seed_now, rand, br_position_list[a], "treasure") != null)
                                        && (sf.check_ne_br(seed_now, br_position_list[a]) != null)
                        ) {
                            CPos bottom = null;
                            int rotation = sf.return_ne_br_face(seed_now, rand, br_position_list[a]);
                            // ͨ������ȷ���ײ�����
                            if (rotation == 0) {
                                bottom = new CPos(br_position_list[a].getX() + 1, br_position_list[a].getZ() + 1);
                            }
                            if (rotation == 1) {
                                bottom = new CPos(br_position_list[a].getX() - 2, br_position_list[a].getZ() + 1);
                            }
                            if (rotation == 2) {
                                bottom = new CPos(br_position_list[a].getX() - 2, br_position_list[a].getZ() - 2);
                            }
                            if (rotation == 3) {
                                bottom = new CPos(br_position_list[a].getX() + 1, br_position_list[a].getZ() - 2);
                            }
                            netherite_ingot = cf.LootTreasureBottom(seed_now,bottom,"netherite_ingot");
                            netherite_scrap = cf.LootTreasureBottom(seed_now,bottom,"netherite_scrap");
                            netherite_de6ris = cf.LootTreasureBottom(seed_now,bottom,"ancient_debris");
                            System.out.println("#" + a + " �ײ������꣺" + bottom);
                            System.out.println("�½�Ͻ�" + netherite_ingot + " ��Ƭ��" + netherite_scrap + " �к���" + netherite_de6ris);

                        } else {
                            br_position_list[a] = null;
                        }
                    }
                }
                //System.out.println("���ӣ�" + seed_now);
                //System.out.println("�½�Ͻ�" + netherite_ingot + " ��Ƭ��" + netherite_scrap + " �к���" + netherite_de6ris);
                if (netherite_ingot*4 + netherite_scrap+netherite_de6ris>=36) {
            netherite_ingot = 0;
            netherite_scrap = 0;
            netherite_de6ris = 0;

            for (int a = 0; a < 4; a++) {
                if (br_position_list[a] != null) {
                    if (
                            (Position_filter.dist(br_position_list[a].toBlockPos().getX(), br_position_list[a].toBlockPos().getZ(), -32, -32, 64, 64))
                                    && (sf.filter_ne_br_type(seed_now, rand, br_position_list[a], "treasure") != null)
                                    && (sf.check_ne_br(seed_now, br_position_list[a]) != null)
                    ) {
                        BPos button = sf.return_ne_br_special_pos(br_position_list[a], "treasure", "button", sf.return_ne_br_face(seed_now, rand, br_position_list[a]));

                        SeedChecker checker = new SeedChecker(seed_now, TargetState.FULL, SeedCheckerDimension.NETHER);
                        Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, new Box(button.getX() - 16, 0, button.getZ() - 16, button.getX() + 16, 127, button.getZ() + 16));
                        List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                        for (BlockPos pos : blockEntities.keySet()) {
                            list.addAll(checker.generateChestLoot(pos));
                        }
                        for (net.minecraft.item.ItemStack i : list) {
                            if (i.getItem().toString() == "netherite_ingot") {
                                netherite_ingot += i.getCount();
                            }
                            if (i.getItem().toString() == "netherite_scrap") {
                                netherite_scrap += i.getCount();
                            }
                            if (i.getItem().toString() == "ancient_debris") {
                                netherite_de6ris += i.getCount();
                            }
                        }

                    } else {
                        br_position_list[a] = null;
                    }
                }
            }

            if (netherite_ingot*4+netherite_scrap+netherite_de6ris>=20) {
                System.out.println("");
                System.out.println("�߳�ID��" + thread_name +" ���ӣ�" + seed_now);
                System.out.println("�߳�ID��" + thread_name +" �½�Ͻ�" + netherite_ingot + " ��Ƭ��" + netherite_scrap + " �к���" + netherite_de6ris);

                for (int a = 0; a < 4; a++) {
                    if (br_position_list[a] != null) {
                        BPos button = sf.return_ne_br_special_pos(br_position_list[a], "treasure", "button", sf.return_ne_br_face(seed_now, rand, br_position_list[a]));
                        System.out.println("#" + a + " �ײ������꣺" + button);
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");
    }*/

   public void run() {//���߳���ÿ���̵߳ĳ���
        List<String> seed_list = Main.read_seed_list(seed_list_path);
        long seed_found_count = 0;
        long max_seed_found = Long.MAX_VALUE;//���ɸ����������
        MCVersion mcv = MCVersion.v1_16_1;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos

        System.out.println("�߳�ID��" + thread_name +" ��ʼ�ڵ�"+index_start+"�У��������ڵ�"+index_end+"��");

       /* for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
            String line = seed_list.get(index_now);
            long seed_now = Main.get_int(line);//seed_now��Ϊ��ǰ�е�����
            ChunkRand rand = new ChunkRand(seed_now);
            BPos sp = of.get_sp(seed_now);
            cpos1 = sf.closest_ow_rp(seed_now, rand, sp.getX(), sp.getZ());//ʾ��������ɸ������ԭ������ķ���
            cpos1 = sf.filter_ow_rp_surface(seed_now,cpos1);
            cpos1 = sf.filter_ow_rp_enter(seed_now,rand,cpos1);
            if (cpos1 != null) {//����ҵ���
                //System.out.println("���ӣ�" + seed_now + " �ر�ɲ���������" + cpos1.toBlockPos());
                System.out.println(seed_now);
                seed_found_count++;
            }
        }
        System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");
    }*/

       for (int index_now = index_start; index_now <= index_end; index_now++) {
           String line = seed_list.get(index_now);
           long seed_now = Main.get_int(line);//seed_now��Ϊ��ǰ�е�����
           ChunkRand rand = new ChunkRand(seed_now);
           BPos sp = of.get_sp(seed_now);
           cpos1 = sf.closest_ow_vi(seed_now, rand, sp.getX(), sp.getZ());
           cpos1 = sf.check_ow_vi(seed_now,cpos1,rand,"taiga","none");
           if (cpos1 != null) {
               int count = 0;
               profotoce59.properties.VillageGenerator vg = new profotoce59.properties.VillageGenerator(mcv);
               OverworldBiomeSource obs = new OverworldBiomeSource(mcv, seed_now);
               OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
               if (vg.generate(otg, cpos1, new ChunkRand())) {
                   List<Pair<BPos, List<ItemStack>>> chests = vg.generateLoot(otg, rand);
                   for (Pair<BPos, List<ItemStack>> chest : chests) {
                       for (ItemStack item : chest.getSecond()) {
                           if (item.getItem().getName().equals("iron_ingot")) {
                               count += item.getCount();
                           }
                       }
                   }
               }
               if(count>=36){
                   SeedChecker checker = new SeedChecker(seed_now,TargetState.FULL,SeedCheckerDimension.OVERWORLD);
                   Box box = new Box(sp.getX()-48,0,sp.getZ()-48,sp.getX()+48,127,sp.getZ()+48);
                   boolean cut = (checker.getBlockCountInBox(Blocks.CARVED_PUMPKIN,box)>0)?true:false;
                   boolean lantern = (checker.getBlockCountInBox(Blocks.JACK_O_LANTERN,box)>0)?true:false;
                   boolean pumpkin = (checker.getBlockCountInBox(Blocks.PUMPKIN,box)>0)?true:false;
                   if(cut||lantern||pumpkin) {
                       int iron = 0;
                       Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                       List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                       for (BlockPos pos : blockEntities.keySet()) {
                           list.addAll(checker.generateChestLoot(pos));
                       }
                       for (net.minecraft.item.ItemStack i : list) {
                           if (i.getItem().toString() == "iron_ingot") {
                               iron += i.getCount();
                           }
                       }
                       if (count >= 36) {
                           System.out.println("------");
                           System.out.println("#" + index_now + " " + seed_now + " iron:" + iron + (cut ? " cut" : "") + (lantern ? " lantern" : "") + (pumpkin ? " pumpkin" : ""));
                           System.out.println("------");
                       }
                   }
               }
           }
       }
       System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");
    }

        /*public void run() {//���߳���ÿ���̵߳ĳ���
        List<String> seed_list = Main.read_seed_list(seed_list_path);
        long seed_found_count = 0;
        long max_seed_found = 65535;//���ɸ����������
        MCVersion mcv = MCVersion.v1_16_1;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos
        String option_path = "E:\\Server_Files\\Seed_finding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
        List<String> option_text = Main.read_seed_list(option_path);
        String option = option_text.get(1);
        int index_end_max = Integer.parseInt(String.valueOf(Main.get_int(option)));
        if(index_end>index_end_max){
            System.out.println("�߳�ID��" + thread_name +" ���յ���index��������"+index_end+"������Ԥ���趨�Ľ�����"+index_end_max+"�����Զ����������������Ϊintȡ�������⡣");
            index_end=index_end_max;
        }
        System.out.println("�߳�ID��" + thread_name +" ��ʼ�ڵ�"+index_start+"�У��������ڵ�"+index_end+"��");

        for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
            String line = seed_list.get(index_now);
            long seed_now = Main.get_int(line);//seed_now��Ϊ��ǰ�е�����

            SeedChecker checker = new SeedChecker(seed_now, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
            BPos sp = of.get_sp(seed_now);
            BPos button = sf.closest_ow_rp(seed_now, rand, sp.getX(), sp.getZ()).toBlockPos();//ʾ��������ɸ������ԭ������ķ���

            List<NbtCompound> Entities = checker.getEntitiesInBox(new Box(button.getX() - 32, 0, button.getZ() - 32, button.getX() + 32, 127, button.getZ() + 32));
            int count = 0;

            for (NbtCompound i : Entities) {
                if(i.toString().contains("sheep")==true){
                    count+=1;
                }
            }

            if (count>0) {
                System.out.println(count +" "+ seed_now);
            }
            }
        System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");
    }*/

    /*public void run() {//���߳���ÿ���̵߳ĳ���
        List<String> seed_list = Main.read_seed_list(seed_list_path);
        long seed_found_count = 0;
        long max_seed_found = 65535;//���ɸ����������
        MCVersion mcv = MCVersion.v1_16_1;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos
        String option_path = "E:\\Server_Files\\Seed_finding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
        List<String> option_text = Main.read_seed_list(option_path);
        String option = option_text.get(1);
        int index_end_max = Integer.parseInt(String.valueOf(Main.get_int(option)));
        if(index_end>index_end_max){
            System.out.println("�߳�ID��" + thread_name +" ���յ���index��������"+index_end+"������Ԥ���趨�Ľ�����"+index_end_max+"�����Զ����������������Ϊintȡ�������⡣");
            index_end=index_end_max;
        }
        System.out.println("�߳�ID��" + thread_name +" ��ʼ�ڵ�"+index_start+"�У��������ڵ�"+index_end+"��");

        for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
            String line = seed_list.get(index_now);
            long seed_now = Main.get_int(line);//seed_now��Ϊ��ǰ�е�����
            ChunkRand rand = new ChunkRand(seed_now);
            BPos sp = of.get_sp(seed_now);
            cpos1 = sf.closest_ow_rp(seed_now, rand, sp.getX(), sp.getZ());//ʾ��������ɸ������ԭ������ķ���
            cpos1 = sf.filter_ow_rp_surface(seed_now,cpos1);
            //cpos1 = sf.filter_ow_rp_enter(seed_now,rand,cpos1);
            cpos1 = cf.check_chest_rp(seed_now,rand,cpos1,"iron_nugget",18,"none",0);

            if (cpos1 != null) {//����ҵ���
                //System.out.println("���ӣ�" + seed_now + " �ر�ɲ���������" + cpos1.toBlockPos());
                System.out.println(seed_now);
                seed_found_count++;
            }
        }
        System.out.println("�߳�ID��" + thread_name +" ɸ���ѽ�����");
    }*/
}
