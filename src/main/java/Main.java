import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.BuriedTreasure;
import com.seedfinding.mcfeature.structure.DesertPyramid;
import com.seedfinding.mcfeature.structure.RegionStructure;
import com.seedfinding.mcfeature.structure.Village;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.Generators;
import com.seedfinding.mcfeature.structure.generator.structure.DesertPyramidGenerator;
import com.seedfinding.mcterrain.TerrainGenerator;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.loot.item.Items;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import nl.jellejurre.seedchecker.SeedChecker;
import nl.jellejurre.seedchecker.SeedCheckerDimension;
import nl.jellejurre.seedchecker.TargetState;
import profotoce59.properties.VillageGenerator;


public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(
                "\n" +
                "zfq1041's_seed_finding �汾��a0.5.0\n" +
                "��Ҫ��д��(��A-Z����ĸ����):Harold_HC,Xinyuuu7,zfq1041\n" +
                "\n" +
                "���£�\n" +
                "��bug����filter��֤���������̲���\n" +
                "ע�⣺\n" +
                "��Щfilter�����Ŀ���ǰ�������ѧϰɸ�֣�" +
                "��Щfilter����һ����������õģ�" +
                "�������˽��˸���filter��ɸ��ԭ���ʹ���Լ��ķ�ʽɸ�֣�" +
                "�Ͼ������ұ���û��������֪��filter�������;��������zfq1041\n" +
                "Very strong ɸ�� man!\n\n");//������
        long seed_found_count = 0;
        BPos b1 = new BPos(0,0,0);
        BPos b2 = new BPos(6,100,8);
        System.out.println(b1.distanceTo(b2,DistanceMetric.EUCLIDEAN));
        long max_seed_found = Long.MAX_VALUE;//���ɸ����������
        long seed_start;// ���Ŀ�ʼ�������ӣ�����ɸ��ģʽ��
        long seed_end;// ���Ľ����������ӣ�����ɸ��ģʽ��
        MCVersion mcv = MCVersion.v1_16_1;// MC�汾
        Structure_filter sf = new Structure_filter(mcv);// ����Structure_filter
        Chest_filter cf = new Chest_filter(mcv);// ͬ��
        Other_filter of = new Other_filter(mcv);// ͬ��
        Biome_filter bf = new Biome_filter(mcv);// ͬ��
        CPos cpos1, cpos2, cpos3;// ���弸����CPos
        BPos bpos1, bpos2, bpos3;// ���弸����BPos

        System.out.println("��ѡ��ɸ��ģʽ(ʾ��ɸ�Ķ��������������ķ��������ŵر�ɲ�,�汾1.16.1)\n���߳�ɸlistʾ��(0)\n���̵߳���ɸ��ʾ��(1)\n���߳�ɸlistʾ��(2)\n���̵߳���ɸ��ʾ��(3)");
        System.out.println("���ʹ��ɸlist���뽫list(seedonly)����D:\\seedfinding\\seedlist.txt,���÷���D:\\seedfinding\\option.txt�����õ�һ��Ϊ��ʼ�������ڶ���Ϊ����������������һ��Ϊ0���ڶ���Ϊ1���Դ����ƣ�������Ϊ�߳�����(���߳���Ч)");
        System.out.println("���ʹ�õ���ɸ�֣��뽫���÷���D:\\seedfinding\\option.txt�����õ�һ��Ϊ��ʼ���ӣ��ڶ���Ϊ��������(����>��ʼ)��������Ϊ�߳�����(���߳���Ч)");
        int mode = System.in.read();
        if (mode == 48) {//ascii��0->48
            System.out.println("��ѡ�񣺵��߳�ɸlist");
            String seed_list_path = "D:\\seedfinding\\seedlist.txt";//seedlist���ļ�λ�ã�ֻ֧��seedonly
            String option_path = "D:\\seedfinding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> seed_list = read_seed_list(seed_list_path);
            List<String> option_text = read_seed_list(option_path);
            String option = option_text.get(0);
            int index_start = Integer.parseInt(String.valueOf(get_int(option)));
            option = option_text.get(1);
            int index_end = Integer.parseInt(String.valueOf(get_int(option)));
            System.out.println("�����б�λ��"+seed_list_path);
            System.out.println("����λ��"+option_path);
            System.out.println("��ʼ�ڵ�"+index_start +"�У��������ڵ�" + index_end+"�У���"+(index_end-index_start+1)+"�����ӡ�");
            for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
                String line = seed_list.get(index_now);
                long seed_now = get_int(line);//seed_now��Ϊ��ǰ�е�����
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
            System.out.println("ɸ���ѽ�����");
        }
        if (mode == 49) {//ascii��1->49
            System.out.println("��ѡ�񣺵��̵߳���ɸ��");
            String option_path = "D:\\seedfinding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> option_text = read_seed_list(option_path);
            seed_start = Long.parseLong(option_text.get(0));
            seed_end = Long.parseLong(option_text.get(1));
            System.out.println("��ʼ��"+seed_start +"����������" + seed_end);
            for (long seed_now = seed_start; seed_now <= seed_end && seed_found_count<max_seed_found; seed_now++) {
            //seed_now��Ϊ��ǰ������
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
            System.out.println("ɸ���ѽ�����");
        }
        if (mode == 50) {//ascii��2->50
            System.out.println("��ѡ�񣺶��߳�ɸlist");

            String seed_list_path = "D:\\seedfinding\\seedlist.txt";//seedlist���ļ�λ�ã�ֻ֧��seedonly
            String option_path = "D:\\seedfinding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> option_text = read_seed_list(option_path);
            String option = option_text.get(0);
            int index_start = Integer.parseInt(String.valueOf(get_int(option)));
            option = option_text.get(1);
            int index_end = Integer.parseInt(String.valueOf(get_int(option)));
            int thread_num= Integer.parseInt(option_text.get(2));
            System.out.println("�����б�λ��"+seed_list_path);
            System.out.println("����λ��"+option_path);
            System.out.println("��ʼ�ڵ�"+index_start +"�У��������ڵ�" + index_end+"��"+",�߳���"+thread_num+"����");
            int thread_now = 1;
            int seed_thread = (index_end-index_start)/thread_num;
            int index_start_now = index_start;
            int index_end_now;
            while(thread_now <= thread_num){
                index_start_now++;
                index_end_now = index_start_now+seed_thread;  // �ı�ѭ������
                if(index_end_now>index_end){
                    index_end_now=index_end;
                }
                multi_thread_seedlist runner = new multi_thread_seedlist(index_start_now, index_end_now, String.valueOf(thread_now),seed_list_path);
                runner.start();
                index_start_now += seed_thread;
                thread_now ++;
            }
        }
        if (mode == 51) {//ascii��3->51
            System.out.println("��ѡ�񣺶��̵߳���ɸ��");
            String option_path = "D:\\seedfinding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> option_text = read_seed_list(option_path);
            seed_start = Long.parseLong(option_text.get(0));
            seed_end = Long.parseLong(option_text.get(1));
            int thread_num= Integer.parseInt(option_text.get(2));
            long seed_thread = ((seed_end-seed_start)/thread_num);  // ÿ���߳�ɸ��������
            System.out.println("��ʼ��"+seed_start +"����������" + seed_end+",�߳���"+thread_num+"����");
            int thread_now = 1;
            long seed_start_now = seed_start;
            long seed_end_now;
            while(thread_now <= thread_num){
                seed_end_now = seed_start_now+seed_thread;  // �ı�ѭ������
                if(seed_end_now>seed_end){
                    seed_end_now=seed_end;
                }
                multi_thread runner = new multi_thread(seed_start_now, seed_end_now, String.valueOf(thread_now));
                runner.start();
                seed_start_now += seed_thread;
                thread_now ++;
            }
        }
/*
        if (mode == 52) {//ascii��2->50
            System.out.println("��ѡ�񣺶��߳�ɸlist");
            int thread_num=6;//Ĭ��6�߳�
            String seed_list_path = "E:\\Server_Files\\Seed_finding\\ne.txt";//seedlist���ļ�λ�ã�ֻ֧��seedonly
            String option_path = "E:\\Server_Files\\Seed_finding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> option_text = read_seed_list(option_path);
            String option = option_text.get(0);
            int index_start = Integer.parseInt(String.valueOf(get_int(option)));
            option = option_text.get(1);
            int index_end = Integer.parseInt(String.valueOf(get_int(option)));
            System.out.println("�����б�λ��"+seed_list_path);
            System.out.println("����λ��"+option_path);
            System.out.println("��ʼ�ڵ�"+index_start +"�У��������ڵ�" + index_end+"�У���"+(index_end-index_start+1)+"�����ӡ�");
            int thread_now = 1;
            int seed_thread = (index_end-index_start)/thread_num;
            int index_start_now = index_start;
            int index_end_now;
            while(thread_now <= thread_num){
                index_start_now++;
                index_end_now = index_start_now+seed_thread;  // �ı�ѭ������
                multi_thread_seedlist runner = new multi_thread_seedlist(index_start_now, index_end_now, String.valueOf(thread_now),seed_list_path);
                runner.start();
                index_start_now += seed_thread;
                thread_now ++;
            }
        }//��Ҫ����

        if (mode == 57) {//ascii��9->57
            System.out.println("Debugģʽ");
            System.out.println("��ѡ�񣺵��߳�ɸlist");
            String seed_list_path = "E:\\Server_Files\\Seed_finding\\ne.txt";//seedlist���ļ�λ�ã�ֻ֧��seedonly
            String option_path = "E:\\Server_Files\\Seed_finding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> seed_list = read_seed_list(seed_list_path);
            List<String> option_text = read_seed_list(option_path);
            String option = option_text.get(0);
            int index_start = Integer.parseInt(String.valueOf(get_int(option)));
            option = option_text.get(1);
            int index_end = Integer.parseInt(String.valueOf(get_int(option)));
            System.out.println("�����б�λ��" + seed_list_path);
            System.out.println("����λ��" + option_path);
            System.out.println("��ʼ�ڵ�" + index_start + "�У��������ڵ�" + index_end + "�У���" + (index_end - index_start + 1) + "�����ӡ�");
            for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
                String line = seed_list.get(index_now);
                long seed_now = get_int(line);//seed_now��Ϊ��ǰ�е�����
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

                System.out.println("#"+index_now+ " ���ӣ�" + seed_now);

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
                    System.out.println("���ӣ�" + seed_now);
                    System.out.println("�½�Ͻ�" + netherite_ingot + " ��Ƭ��" + netherite_scrap + " �к���" + netherite_de6ris);

                    for (int a = 0; a < 4; a++) {
                        if (br_position_list[a] != null) {
                            BPos button = sf.return_ne_br_special_pos(br_position_list[a], "treasure", "button", sf.return_ne_br_face(seed_now, rand, br_position_list[a]));
                            System.out.println("#" + a + " �ײ������꣺" + button);
                        }
                }
                System.out.println("");
            }
        }

            System.out.println("ɸ���ѽ�����");
        }//��Ҫ����

        if (mode == 56) {//ascii��9->57
            System.out.println("Debugģʽ");
            System.out.println("��ѡ�񣺵��߳�ɸlist");
            String seed_list_path = "E:\\new 1-1-1.txt";//seedlist���ļ�λ�ã�ֻ֧��seedonly
            String option_path = "E:\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> seed_list = read_seed_list(seed_list_path);
            List<String> option_text = read_seed_list(option_path);
            String option = option_text.get(0);
            int index_start = Integer.parseInt(String.valueOf(get_int(option)));
            option = option_text.get(1);
            int index_end = Integer.parseInt(String.valueOf(get_int(option)));
            index_start = 0;
            index_end = 159;
            System.out.println("�����б�λ��" + seed_list_path);
            System.out.println("����λ��" + option_path);
            System.out.println("��ʼ�ڵ�" + index_start + "�У��������ڵ�" + index_end + "�У���" + (index_end - index_start + 1) + "�����ӡ�");
            for (int index_now = index_start; index_now <= index_end && seed_found_count < max_seed_found; index_now++) {
                String line = seed_list.get(index_now);
                long seed_now = get_int(line);//seed_now��Ϊ��ǰ�е�����

                SeedChecker checker = new SeedChecker(seed_now, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
                int count = checker.getBlockCountInBox(Blocks.SPAWNER,new Box(70,0,310,90,80,330));
                System.out.println("���ӣ�" + seed_now);
                if (count>0) {
                    System.out.println("Find! ���ӣ�" + seed_now);
                }
            }

            System.out.println("ɸ���ѽ�����");
        }//��Ҫ����

        if (mode == 55) {//ascii��2->50
            System.out.println("��ѡ�񣺶��߳�ɸlist");
            int thread_num=6;//Ĭ��6�߳�
            String seed_list_path = "E:\\Server_Files\\Seed_finding\\4.txt";//seedlist���ļ�λ�ã�ֻ֧��seedonly
            String option_path = "E:\\Server_Files\\Seed_finding\\option.txt";//���õ��ļ�λ�ã���һ��д��ʼ�������ڶ���д������������0��ʼ��
            List<String> option_text = read_seed_list(option_path);
            String option = option_text.get(0);
            int index_start = Integer.parseInt(String.valueOf(get_int(option)));
            option = option_text.get(1);
            int index_end = Integer.parseInt(String.valueOf(get_int(option)));
            System.out.println("�����б�λ��"+seed_list_path);
            System.out.println("����λ��"+option_path);
            System.out.println("��ʼ�ڵ�"+index_start +"�У��������ڵ�" + index_end+"�У���"+(index_end-index_start+1)+"�����ӡ�");
            int thread_now = 1;
            int seed_thread = (index_end-index_start)/thread_num;
            int index_start_now = index_start;
            int index_end_now;
            while(thread_now <= thread_num){
                index_start_now++;
                index_end_now = index_start_now+seed_thread;  // �ı�ѭ������
                multi_thread_seedlist runner = new multi_thread_seedlist(index_start_now, index_end_now, String.valueOf(thread_now),seed_list_path);
                runner.start();
                index_start_now += seed_thread;
                thread_now ++;
            }
        }//��Ҫ����
*/
        if (mode == 52) {//ascii��0->48
            mcv=MCVersion.v1_15_2;
            String seed_list_path = "E:\\op.txt";
            List<String> seed_list = read_seed_list(seed_list_path);
            int index_start = 0;
            int index_end = 2132;
                for (int index_now = index_start; index_now <= index_end; index_now++) {
                    String line = seed_list.get(index_now);
                    long seed_now = get_int(line);//seed_now��Ϊ��ǰ�е�����
                    ChunkRand rand = new ChunkRand(seed_now);
                    BPos sp = of.get_sp(seed_now);
                    int tmp = 0;
                    cpos1 = sf.closest_ow_vi(seed_now, rand, sp.getX(), sp.getZ());
                    if (cpos1 != null) {
                        profotoce59.properties.VillageGenerator vg = new profotoce59.properties.VillageGenerator(mcv);
                        OverworldBiomeSource obs = new OverworldBiomeSource(mcv, seed_now);
                        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
                        vg.generate(otg, cpos1, rand);
                        List<VillageGenerator.Piece> pieces = vg.getPieces();
                        Boolean Blacksmith = false;
                        Boolean House = false;
                        if (pieces != null) {
                            for (VillageGenerator.Piece piece : pieces) {
                                if ((piece.getName().equals("taiga/houses/taiga_weaponsmith_1"))&&(piece.pos.distanceTo(sp, DistanceMetric.EUCLIDEAN)<=16)) {
                                Blacksmith = true;
                                }
                                if ((piece.getName().equals("taiga/houses/taiga_small_house_3"))&&(piece.pos.distanceTo(sp, DistanceMetric.EUCLIDEAN)<=16)) {
                                    House = true;
                                }
                                if ((piece.getName().equals("taiga/houses/taiga_small_house_5"))&&(piece.pos.distanceTo(sp, DistanceMetric.EUCLIDEAN)<=16)) {
                                    House = true;
                                }
                            }
                            if ((Blacksmith==true)&&(House==true)){
                                System.out.println(seed_now);
                            }
                        }
                    }
                }
                }
        if (mode == 53) {//ascii��2->50
            System.out.println("��ѡ�񣺶��߳�ɸlist");
            mcv=MCVersion.v1_16_1;
            String seed_list_path = "C:\\Users\\Administrator\\Desktop\\taiga village.txt";
            List<String> seed_list = read_seed_list(seed_list_path);
            int index_start = 0;
            int index_end = 188745;
            int thread_num=6;
            System.out.println("�����б�λ��"+seed_list_path);
            System.out.println("��ʼ�ڵ�"+index_start +"�У��������ڵ�" + index_end+"��"+",�߳���"+thread_num+"����");
            int thread_now = 1;
            int seed_thread = (index_end-index_start)/thread_num;
            int index_start_now = index_start;
            int index_end_now;
            while(thread_now <= thread_num){
                index_start_now++;
                index_end_now = index_start_now+seed_thread;  // �ı�ѭ������
                if(index_end_now>index_end){
                    index_end_now=index_end;
                }
                multi_thread_seedlist runner = new multi_thread_seedlist(index_start_now, index_end_now, String.valueOf(thread_now),seed_list_path);
                runner.start();
                index_start_now += seed_thread;
                thread_now ++;
            }
        }
        }
    public static List<String> read_seed_list(String file_dir){
        Path path = Paths.get(file_dir);
        List<String> text = null;
        try {
            text = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
    //���ļ��õı�ܼ���
    public static long get_int(String str){
        if(str.charAt(0)!='-'){
            return Long.parseLong(str);
        }else {
            String first_num = String.valueOf(str.charAt(1));
            String str_int_only = str.replace("-"+first_num, first_num);
            long int_1 = Long.parseLong(str_int_only);
            return -int_1;
        }
    }
    //���ļ��õı�ܼ���
}