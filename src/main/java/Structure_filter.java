

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.EndBiomeSource;
import com.seedfinding.mcbiome.source.NetherBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.rand.seed.WorldSeed;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.misc.SpawnPoint;
import com.seedfinding.mcfeature.structure.*;
import com.seedfinding.mcfeature.structure.generator.structure.RuinedPortalGenerator;
import com.seedfinding.mcseed.rand.JRand;
import com.seedfinding.mcterrain.TerrainGenerator;
import com.seedfinding.mcterrain.terrain.NetherTerrainGenerator;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import net.minecraft.client.render.SkyProperties;
import nl.jellejurre.seedchecker.SeedChecker;
import nl.jellejurre.seedchecker.SeedCheckerDimension;
import nl.jellejurre.seedchecker.TargetState;
import profotoce59.properties.VillageGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Structure_filter {

    MCVersion MCVer;

    Structure_filter(MCVersion MCVer) {
        this.MCVer = MCVer;
    }
    /*
    �ṹFilter
    ����������:MC�汾

    closest...  ��ȡ����ṹ
    check...    ���ṹ�ܷ�����
    return...   ����һЩֵ
    filter...   �ṹ����
     */
    public CPos closest_ow_vi(long seed,ChunkRand rand,int x1, int z1) {
        Village vi = new Village(MCVer);
        CPos vi_1 = vi.getInRegion(seed, 0, 0, rand);
        CPos vi_2 = vi.getInRegion(seed, -1, 0, rand);
        CPos vi_3 = vi.getInRegion(seed, -1, -1, rand);
        CPos vi_4 = vi.getInRegion(seed, 0, -1, rand);
        List<CPos> vi_position_list = new ArrayList<>(Arrays.asList(vi_1, vi_2, vi_3, vi_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_vi = new CPos(0, 0);
        for (CPos vi_now : vi_position_list) {
            double dist_now = vi_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
            if (dist_now < closest_dist) {
                closest_dist = dist_now;
                closest_vi = vi_now;
            }
        }
        return closest_vi;
    }
    /*
    ��ȡ����������ׯ
    ����������:���ӣ�rand������ԭ��
     */
    public CPos check_ow_vi(long seed,CPos vi_pos,ChunkRand rand,String biome_name, String zombie) {
        if (vi_pos == null) {
            return null;
        }
        Village vi = new Village(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator tr = new OverworldTerrainGenerator(obs);
        Village.Data<Village> data = (RegionStructure.Data<Village>)vi.at(vi_pos.getX(), vi_pos.getZ());
        if (vi.canGenerate(vi_pos, tr) && vi.canSpawn(vi_pos, tr.getBiomeSource())&&vi.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            if (biome_name != "none") {
                Biome biome = obs.getBiome(vi_pos.getX() * 16, 255, vi_pos.getZ() * 16);
                switch (biome_name) {
                    case "plains":
                        if (biome != Biomes.PLAINS) {
                            return null;
                        }
                        break;
                    case "desert":
                        if (biome != Biomes.DESERT) {
                            return null;
                        }
                        break;
                    case "taiga":
                        if (biome != Biomes.TAIGA) {
                            return null;
                        }
                        break;
                    case "savanna":
                        if (biome != Biomes.SAVANNA) {
                            return null;
                        }
                        break;
                    case "snowy":
                        if (biome != Biomes.SNOWY_TUNDRA) {
                            return null;
                        }
                        break;
                }
            }
            if (zombie != "none") {
                if (vi.isZombieVillage(seed, vi_pos, rand)) {
                    if (zombie == "false") {
                        return null;
                    }
                } else {
                    if (zombie == "true") {
                        return null;
                    }
                }
            }
            return vi_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    ����������ׯ�ܷ�����
    ����������:���ӣ������������飬rand����ׯ����(Ⱥϵ�ͽ�ʬ��ׯ)
     */
    public CPos check_ow_vi(long seed,CPos vi_pos) {
        if (vi_pos == null) {
            return null;
        }
        Village vi = new Village(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator tr = new OverworldTerrainGenerator(obs);
        Village.Data<Village> data = (RegionStructure.Data<Village>)vi.at(vi_pos.getX(), vi_pos.getZ());
        if (vi.canGenerate(vi_pos, tr) && vi.canSpawn(vi_pos, tr.getBiomeSource())&&vi.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return vi_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    ����������ׯ�ܷ�����
    ����������:���ӣ�������������
     */
    public CPos closest_ow_bt(long seed,ChunkRand rand,int x1, int z1) {
        BuriedTreasure bt = new BuriedTreasure(MCVer);
        CPos bt_1 = bt.getInRegion(seed, 0, 0, rand);
        CPos bt_2 = bt.getInRegion(seed, -1, 0, rand);
        CPos bt_3 = bt.getInRegion(seed, -1, -1, rand);
        CPos bt_4 = bt.getInRegion(seed, 0, -1, rand);
        List<CPos> br_position_list = new ArrayList<>(Arrays.asList(bt_1, bt_2, bt_3, bt_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_br = null;
        for (int a = 0; a < 4; a++) {
            if (br_position_list.get(a) != null) {
                CPos br_now = br_position_list.get(a);
                double dist_now = br_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
                if (dist_now < closest_dist) {
                    closest_dist = dist_now;
                    closest_br = br_now;
                }
            }
        }
        // filter the position
        if (closest_br == null){
            return null;
        }
        return closest_br;
    }
    /*
    ��ȡ��������籦��
    ����������:���ӣ�rand������ԭ��
     */
    public CPos check_ow_bt(long seed,CPos bt_pos) {
        if (bt_pos == null) {
            return null;
        }
        BuriedTreasure bt = new BuriedTreasure(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator tr = new OverworldTerrainGenerator(obs);
        RegionStructure.Data<BuriedTreasure> data = (RegionStructure.Data<BuriedTreasure>)bt.at(bt_pos.getX(), bt_pos.getZ());
        if (bt.canGenerate(bt_pos, tr) && bt.canSpawn(bt_pos, tr.getBiomeSource())&&bt.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return bt_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    ��������籦���ܷ�����
    ����������:���ӣ�������������
     */
    public CPos closest_ow_sw(long seed,ChunkRand rand,int x1, int z1) {
        Shipwreck sw = new Shipwreck(MCVer);
        CPos sw_1 = sw.getInRegion(seed, 0, 0, rand);
        CPos sw_2 = sw.getInRegion(seed, -1, 0, rand);
        CPos sw_3 = sw.getInRegion(seed, -1, -1, rand);
        CPos sw_4 = sw.getInRegion(seed, 0, -1, rand);
        List<CPos> sw_position_list = new ArrayList<>(Arrays.asList(sw_1, sw_2, sw_3, sw_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_sw = new CPos(0, 0);
        for (CPos sw_now : sw_position_list) {
            double dist_now = sw_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
            if (dist_now < closest_dist) {
                closest_dist = dist_now;
                closest_sw = sw_now;
            }
        }
        return closest_sw;
    }
    /*
    ��ȡ������������
    ����������:���ӣ�rand������ԭ��
     */
    public CPos check_ow_sw(long seed,CPos sw_pos) {
        if (sw_pos == null) {
            return null;
        }
        Shipwreck sw = new Shipwreck(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator tr = new OverworldTerrainGenerator(obs);
        RegionStructure.Data<Shipwreck> data = (RegionStructure.Data<Shipwreck>)sw.at(sw_pos.getX(), sw_pos.getZ());
        if (sw.canGenerate(sw_pos, tr) && sw.canSpawn(sw_pos, tr.getBiomeSource())&&sw.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return sw_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    �������������ܷ�����
    ����������:���ӣ�������������
     */
    public CPos closest_ow_rp(long seed,ChunkRand rand,int x1, int z1) {

        RuinedPortal rp = new RuinedPortal(Dimension.OVERWORLD, MCVer);//����һ��������������
        CPos rp_1 = rp.getInRegion(seed, 0, 0, rand);
        CPos rp_2 = rp.getInRegion(seed, -1, 0, rand);
        CPos rp_3 = rp.getInRegion(seed, -1, -1, rand);
        CPos rp_4 = rp.getInRegion(seed, 0, -1, rand);//��ȡ�ĸ����޵��������������
        List<CPos> rp_position_list = new ArrayList<>(Arrays.asList(rp_1, rp_2, rp_3, rp_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_rp = new CPos(0, 0);
        for (CPos rp_now : rp_position_list) {
            double dist_now = rp_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
            if (dist_now < closest_dist) {
                closest_dist = dist_now;
                closest_rp = rp_now;
            }
        }
        return closest_rp;
    }
    /*
    ��ȡ������������
    ����������:���ӣ�rand������ԭ��
     */
    public CPos check_ow_rp(long seed,CPos rp_pos) {
        if (rp_pos == null) {
            return null;
        }
        RuinedPortal rp = new RuinedPortal(Dimension.OVERWORLD, MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator tr = new OverworldTerrainGenerator(obs);
        RegionStructure.Data<RuinedPortal> data = (RegionStructure.Data<RuinedPortal>)rp.at(rp_pos.getX(), rp_pos.getZ());
        if (rp.canGenerate(rp_pos, tr) && rp.canSpawn(rp_pos, tr.getBiomeSource())&&rp.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return rp_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    �������������ܷ�����
    ����������:���ӣ�������������
     */
    public CPos closest_ow_dt(long seed,ChunkRand rand,int x1, int z1) {
        DesertPyramid dt = new DesertPyramid(MCVer);
        CPos dt_1 = dt.getInRegion(seed, 0, 0, rand);
        CPos dt_2 = dt.getInRegion(seed, -1, 0, rand);
        CPos dt_3 = dt.getInRegion(seed, -1, -1, rand);
        CPos dt_4 = dt.getInRegion(seed, 0, -1, rand);
        List<CPos> dt_position_list = new ArrayList<>(Arrays.asList(dt_1, dt_2, dt_3, dt_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_dt = new CPos(0, 0);
        for (CPos dt_now : dt_position_list) {
            double dist_now = dt_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
            if (dist_now < closest_dist) {
                closest_dist = dist_now;
                closest_dt = dt_now;
            }
        }
        return closest_dt;
    }
    /*
    ��ȡ���������ɳĮ���
    ����������:���ӣ�rand������ԭ��
     */
    public CPos check_ow_dt(long seed,CPos dt_pos) {
        if (dt_pos == null) {
            return null;
        }
        DesertPyramid dt = new DesertPyramid(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator tr = new OverworldTerrainGenerator(obs);
        RegionStructure.Data<DesertPyramid> data = (RegionStructure.Data<DesertPyramid>)dt.at(dt_pos.getX(), dt_pos.getZ());
        if (dt.canGenerate(dt_pos, tr) && dt.canSpawn(dt_pos, tr.getBiomeSource())&&dt.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return dt_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    ���������ɳĮ����ܷ�����
    ����������:���ӣ�ɳĮ�����������
     */
    public CPos filter_ow_rp_surface(long seed, CPos rp) {
        if (rp == null) {
            return null;
        }
        RuinedPortalGenerator rpg = new RuinedPortalGenerator(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        rpg.generate(otg, rp);
        return rpg.getLocation()==RuinedPortalGenerator.Location.ON_LAND_SURFACE ? rp : null;
    }
    /*
    �������������Ƿ��ڵر�����
    ����������:���ӣ�������������
     */
    public int return_ow_rp_y(long seed, CPos rp) {
        if (rp == null) {
            return 0;
        }
        RuinedPortalGenerator rpg = new RuinedPortalGenerator(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        rpg.generate(otg, rp);
        List<Pair<Block, BPos>> blocks = rpg.getMinimalPortal();
        for (Pair<Block, BPos> block : blocks) {
            return block.getSecond().getY();
        }
        return 0;
    }
    /*
    ��ȡ��������ŵ�yֵ�����ƣ�
    ����������:���ӣ�������������
    */
    public CPos filter_ow_rp_enter(long seed,ChunkRand rand,CPos portalPos) {
        if (portalPos == null) {
            return null;
        }
        rand.setDecoratorSeed(seed, portalPos.getX() * 16, portalPos.getZ() * 16, 40005, MCVer);
        LootContext chest = new LootContext(rand.nextLong());
        List<ItemStack> ItemList = MCLootTables.RUINED_PORTAL_CHEST.get().generate(chest);
        int chestObby = 0;
        boolean flint_and_steel = false;
        boolean fire_charge = false;
        for (ItemStack itemStack : ItemList) {
            if (itemStack.getItem().getName().equals("obsidian")) {
                chestObby += itemStack.getCount();
            }
            if (itemStack.getItem().getName().equals("flint_and_steel")) {
                flint_and_steel = true;
            }
            if (itemStack.getItem().getName().equals("fire_charge")) {
                fire_charge = true;
            }
        }
        if(!(flint_and_steel||fire_charge) || chestObby<1) {
            return null;
        }
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer,seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        RuinedPortalGenerator portalGen = new RuinedPortalGenerator(MCVer);
        portalGen.generate(otg, portalPos);
        if(chestObby < return_rp_getMissingObsidian(portalGen.getType())) {
            return null;
        }
        List<Pair<Block, BPos>> blocks = portalGen.getMinimalPortal();
        boolean crying_obsidian = false;
        for (Pair<Block, BPos> block : blocks) {
            if (block.getFirst() == Blocks.CRYING_OBSIDIAN) {
                crying_obsidian = true;
            }
        }
        if(crying_obsidian) {
            return null;
        }
        return portalPos;
    }
    /*
    �������������Ƿ�ɲ�
    ����������:���ӣ�rand��������������
     */
    public String return_ow_rp_type(long seed,ChunkRand rand,CPos rp) {
        if (rp == null) {
            return null;
        }
        RuinedPortalGenerator rpg = new RuinedPortalGenerator(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        rpg.generate(otg, rp);
        return rpg.getType();
    }
    /*
    �����������������
    ����������:���ӣ�rand��������������
     */
    public CPos closest_ne_rp(long seed,ChunkRand rand,int x1, int z1) {
        RuinedPortal rp = new RuinedPortal(Dimension.NETHER, MCVer);
        CPos rp_1 = rp.getInRegion(seed, 0, 0, rand);
        CPos rp_2 = rp.getInRegion(seed, -1, 0, rand);
        CPos rp_3 = rp.getInRegion(seed, -1, -1, rand);
        CPos rp_4 = rp.getInRegion(seed, 0, -1, rand);
        List<CPos> rp_position_list = new ArrayList<>(Arrays.asList(rp_1, rp_2, rp_3, rp_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_rp = new CPos(0, 0);
        for (CPos rp_now : rp_position_list) {
            double dist_now = rp_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
            if (dist_now < closest_dist) {
                closest_dist = dist_now;
                closest_rp = rp_now;
            }
        }
        return closest_rp;
    }
    /*
    ��ȡ����½����
    ����������:���ӣ�rand������ԭ��
     */
    public CPos check_ne_rp(long seed,CPos rp_pos) {
        RuinedPortal rp = new RuinedPortal(Dimension.NETHER, MCVer);
        NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator tr = new NetherTerrainGenerator(obs);
        if (rp.canGenerate(rp_pos, tr) && rp.canSpawn(rp_pos, tr.getBiomeSource())){
            return rp_pos;
        }
        else
        {
            return null;
        }
    }
    /*
    ����½�����ܷ�����
    ����������:���ӣ�������������
     */
    public CPos filter_ne_rp_surface(long seed, CPos rp) {
        if (rp == null) {
            return null;
        }
        RuinedPortalGenerator rpg = new RuinedPortalGenerator(MCVer);
        NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator otg = new NetherTerrainGenerator(obs);
        rpg.generate(otg, rp);
        return rpg.getLocation()==RuinedPortalGenerator.Location.ON_LAND_SURFACE ? rp : null;
    }
    /*
    ����½�����Ƿ��ڵر����ɣ�������bug���ã�
    ����������:���ӣ�������������
     */
    public int return_ne_rp_y(long seed, CPos rp) {
        if (rp == null) {
            return 0;
        }
        RuinedPortalGenerator rpg = new RuinedPortalGenerator(MCVer);
        NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator otg = new NetherTerrainGenerator(obs);
        rpg.generate(otg, rp);
        List<Pair<Block, BPos>> blocks = rpg.getMinimalPortal();
        for (Pair<Block, BPos> block : blocks) {
            return block.getSecond().getY();
        }
        return 0;
    }
    /*
    ��ȡ�½���ŵ�yֵ�����ƣ�
    ����������:���ӣ�������������
    */
    public CPos filter_ne_rp_enter(long seed,ChunkRand rand,CPos portalPos) {
        if (portalPos == null) {
            return null;
        }
        rand.setDecoratorSeed(seed, portalPos.getX() * 16, portalPos.getZ() * 16, 40005, MCVer);
        LootContext chest = new LootContext(rand.nextLong());
        List<ItemStack> ItemList = MCLootTables.RUINED_PORTAL_CHEST.get().generate(chest);
        int chestObby = 0;
        boolean flint_and_steel = false;
        boolean fire_charge = false;
        for (ItemStack itemStack : ItemList) {
            if (itemStack.getItem().getName().equals("obsidian")) {
                chestObby += itemStack.getCount();
            }
            if (itemStack.getItem().getName().equals("flint_and_steel")) {
                flint_and_steel = true;
            }
            if (itemStack.getItem().getName().equals("fire_charge")) {
                fire_charge = true;
            }
        }
        if(!(flint_and_steel||fire_charge) || chestObby<1) {
            return null;
        }
        NetherBiomeSource obs = new NetherBiomeSource(MCVer,seed);
        NetherTerrainGenerator otg = new NetherTerrainGenerator(obs);
        RuinedPortalGenerator portalGen = new RuinedPortalGenerator(MCVer);
        portalGen.generate(otg, portalPos);
        if(chestObby < return_rp_getMissingObsidian(portalGen.getType())) {
            return null;
        }
        List<Pair<Block, BPos>> blocks = portalGen.getMinimalPortal();
        boolean crying_obsidian = false;
        for (Pair<Block, BPos> block : blocks) {
            if (block.getFirst() == Blocks.CRYING_OBSIDIAN) {
                crying_obsidian = true;
            }
        }
        if(crying_obsidian) {
            return null;
        }
        return portalPos;
    }
    /*
    ����½�����Ƿ�ɲ�
    ����������:���ӣ�rand��������������
     */
    public String return_ne_rp_type(long seed,ChunkRand rand,CPos rp) {
        if (rp == null) {
            return null;
        }
        RuinedPortalGenerator rpg = new RuinedPortalGenerator(MCVer);
        NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator otg = new NetherTerrainGenerator(obs);
        rpg.generate(otg, rp);
        return rpg.getType();
    }
    /*
    �����½��������
    ����������:���ӣ�rand��������������
     */
    public static int return_rp_getMissingObsidian(String portalType) {
        int missingObsidian = 10;

        if(portalType.equals("portal_9") || portalType.equals("portal_1")) {
            missingObsidian = 2;
        } else if(portalType.equals("portal_2") || portalType.equals("portal_3")) {
            missingObsidian = 4;
        } else if(portalType.equals("portal_4") || portalType.equals("portal_8")) {
            missingObsidian = 3;
        } else if(portalType.equals("portal_5")) {
            missingObsidian = 5;
        } else if(portalType.equals("portal_6") || portalType.equals("portal_7")) {
            missingObsidian = 1;
        } else if(portalType.equals("portal_10")) {
            missingObsidian = 7;
        } else {
            missingObsidian = 5; // big portals
        }

        return missingObsidian;
    }
    /*
    ���ط����������貹�ĺ���ʯ��
    ����������:��������
    */
    public CPos closest_ne_br(long seed,ChunkRand rand,int x1, int z1) {
        BastionRemnant br = new BastionRemnant(MCVer);
        CPos br_1 = br.getInRegion(seed, 0, 0, rand);
        CPos br_2 = br.getInRegion(seed, -1, 0, rand);
        CPos br_3 = br.getInRegion(seed, -1, -1, rand);
        CPos br_4 = br.getInRegion(seed, 0, -1, rand);
        List<CPos> br_position_list = new ArrayList<>(Arrays.asList(br_1, br_2, br_3, br_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_br = null;
        for (int a = 0; a < 4; a++) {
            if (br_position_list.get(a) != null) {
                CPos br_now = br_position_list.get(a);
                double dist_now = br_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
                if (dist_now < closest_dist) {
                    closest_dist = dist_now;
                    closest_br = br_now;
                }
            }
        }
        // filter the position
        if (closest_br == null){
            return null;
        }
        return closest_br;
    }
    /*
    ��ȡ�����
    ����������:���ӣ�rand������ԭ��
    */
    public CPos check_ne_br(long seed,CPos br_pos) {
        if(br_pos==null)
            return null;
        BastionRemnant br = new BastionRemnant(MCVer);
        NetherBiomeSource nbs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator tr = new NetherTerrainGenerator(nbs);
        RegionStructure.Data<BastionRemnant> data = (RegionStructure.Data<BastionRemnant>)br.at(br_pos.getX(), br_pos.getZ());
        if (br.canGenerate(br_pos, tr) && br.canSpawn(br_pos, tr.getBiomeSource())&&br.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return br_pos;
        }
        return null;
    }
    /*
    ������ܷ�����
    ����������:���ӣ�����������
     */
    public String return_ne_br_type(long seed,ChunkRand rand,CPos br_pos) {
        if(br_pos==null)
            return null;
        rand.setCarverSeed(seed, br_pos.getX(), br_pos.getZ(), MCVer);
        int br_type = rand.nextInt(4);
        br_type = rand.nextInt(4);
        switch (br_type){
            case 0:
                return "housing";
            case 1:
                return "stable";
            case 2:
                return "treasure";
            case 3:
                return "bridge";
        }
        return null;
    }
    /*
    ��ȡ������
    ����������:���ӣ�rand������������
     */
    public CPos filter_ne_br_type(long seed,ChunkRand rand,CPos br_pos,String type) {
        if(br_pos==null)
            return null;
        rand.setCarverSeed(seed, br_pos.getX(), br_pos.getZ(), MCVer);
        int br_type = rand.nextInt(4);
        br_type = rand.nextInt(4);
        switch (type){
            case "housing":if(br_type != 0) {
                return null;
            };break;
            case "stable":if(br_type != 1) {
                return null;
            };break;
            case "treasure":if(br_type != 2) {
                return null;
            };break;
            case "bridge":if(br_type != 3) {
                return null;
            };break;
        }
        return br_pos;
    }
    /*
    ���������
    ����������:���ӣ�rand�����������飬������
     */
    public int return_ne_br_face(long seed,ChunkRand rand,CPos br_pos) {
        if(br_pos==null)
            return -1;
        rand.setCarverSeed(seed, br_pos.getX(), br_pos.getZ(), MCVer);
            int br_face = rand.nextInt(4);
        return br_face;
    }
    /*
    ����������
    ����������:���ӣ�rand������������
    */
    public BPos return_ne_br_special_pos(CPos br_pos,String br_type,String place,int face) {
        if (br_pos == null)
            return null;
        switch (br_type) {
            case "housing":
                return null;
            case "stable":
                return null;
            case "treasure":
                switch (place) {
                    case "button"://�ײ�
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() +18, 0, br_pos.toBlockPos().getZ() +18);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() -18, 0, br_pos.toBlockPos().getZ() +18);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() -18, 0, br_pos.toBlockPos().getZ() -18);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() +18, 0, br_pos.toBlockPos().getZ() -18);
                        }
                    case "middle"://�в����
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() +18, 0, br_pos.toBlockPos().getZ() -4);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() +4, 0, br_pos.toBlockPos().getZ() +18);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() -18, 0, br_pos.toBlockPos().getZ() +4);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() -4, 0, br_pos.toBlockPos().getZ() -18);
                        }
                    case "tower"://��
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() +8, 0, br_pos.toBlockPos().getZ() -26);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() +26, 0, br_pos.toBlockPos().getZ() +8);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() -8, 0, br_pos.toBlockPos().getZ() +26);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() -26, 0, br_pos.toBlockPos().getZ() -8);
                        }
                }
            case "bridge":
                switch (place) {
                    case "chalice"://ʥ��
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() - 24, 0, br_pos.toBlockPos().getZ() + 9);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() - 9, 0, br_pos.toBlockPos().getZ() - 24);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() + 24, 0, br_pos.toBlockPos().getZ() - 9);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() + 9, 0, br_pos.toBlockPos().getZ() + 24);
                        }
                    case "top_chest"://������ʯ��
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() + 9, 0, br_pos.toBlockPos().getZ() + 4);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() - 4, 0, br_pos.toBlockPos().getZ() + 9);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() - 9, 0, br_pos.toBlockPos().getZ() - 4);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() + 4, 0, br_pos.toBlockPos().getZ() - 9);
                        }
                    case "left_tower"://�����
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() + 9, 0, br_pos.toBlockPos().getZ() - 8);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() + 8, 0, br_pos.toBlockPos().getZ() + 9);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() - 9, 0, br_pos.toBlockPos().getZ() + 8);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() - 8, 0, br_pos.toBlockPos().getZ() - 9);
                        }
                    case "right_tower"://�Ҳ���
                        switch (face) {
                            case 0:
                                return new BPos(br_pos.toBlockPos().getX() + 9, 0, br_pos.toBlockPos().getZ() + 39);
                            case 1:
                                return new BPos(br_pos.toBlockPos().getX() - 39, 0, br_pos.toBlockPos().getZ() + 9);
                            case 2:
                                return new BPos(br_pos.toBlockPos().getX() - 9, 0, br_pos.toBlockPos().getZ() - 39);
                            case 3:
                                return new BPos(br_pos.toBlockPos().getX() + 39, 0, br_pos.toBlockPos().getZ() - 9);
                        }
                }
        }
        /*
        ��Face:0
        ʥ�� -24 +9
        ������ʯ�� +9  +4
        ����� +9 -8
        �Ҳ��� +9 +39
        Face:1
        �ڶ����෴�����Ե�
        Face:2
        ��һ�����෴��
        Face:3
        ��һ���෴�����Ե�
        */
        /*
        �ر���Face:0
        �ײ� +18 +18
        �в���� +18 -4
        �� +8 -26
        Face:1
        �ڶ����෴�����Ե�
        Face:2
        ��һ�����෴��
        Face:3
        ��һ���෴�����Ե�
        */
        return null;
    }
    /*
    ��������һЩ����λ�õ�����
    ����������:���������飬�����ͣ�ɸ��λ�ã�����
     */
    public CPos closest_ne_fo(long seed,ChunkRand rand,int x1, int z1) {
        Fortress fo = new Fortress(MCVer);
        CPos fo_1 = fo.getInRegion(seed, 0, 0, rand);
        CPos fo_2 = fo.getInRegion(seed, -1, 0, rand);
        CPos fo_3 = fo.getInRegion(seed, -1, -1, rand);
        CPos fo_4 = fo.getInRegion(seed, 0, -1, rand);
        List<CPos> fo_position_list = new ArrayList<>(Arrays.asList(fo_1, fo_2, fo_3, fo_4));
        double closest_dist = Integer.MAX_VALUE;
        CPos closest_fo = null;
        for (int a = 0; a < 4; a++) {
            if (fo_position_list.get(a) != null) {
                CPos fo_now = fo_position_list.get(a);
                double dist_now = fo_now.toBlockPos().distanceTo(new BPos(x1, 0, z1), DistanceMetric.EUCLIDEAN);
                if (dist_now < closest_dist) {
                    closest_dist = dist_now;
                    closest_fo = fo_now;
                }
            }
        }
        // filter the position
        if (closest_fo == null){
            return null;
        }
        return closest_fo;
    }
    /*
    ��ȡ����½�Ҫ��
    ����������:���ӣ�rand������ԭ��
    */
    public CPos check_ne_fo(long seed,CPos fo_pos) {
        if(fo_pos==null)
            return null;
        Fortress fo = new Fortress(MCVer);
        NetherBiomeSource nbs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator tr = new NetherTerrainGenerator(nbs);
        RegionStructure.Data<Fortress> data = (RegionStructure.Data<Fortress>)fo.at(fo_pos.getX(), fo_pos.getZ());
        if (fo.canGenerate(fo_pos, tr) && fo.canSpawn(fo_pos, tr.getBiomeSource())&&fo.canStart(data, WorldSeed.toStructureSeed(seed),new ChunkRand())){
            return fo_pos;
        }
        return null;
    }
    /*
    ����½�Ҫ���ܷ�����
    ����������:���ӣ�����������
     */
    public CPos closest_ow_sh_first(long seed,int x1, int z1) {
        Stronghold stronghold = new Stronghold(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer,seed);
        CPos[] strongholdPos = stronghold.getStarts(obs,3,new JRand(seed));
        List<CPos> strongholdPositions = new ArrayList<>(Arrays.asList(strongholdPos[0],strongholdPos[1],strongholdPos[2]));
        double smallestDistance = Integer.MAX_VALUE;
        CPos closestStronghold = new CPos(0,0);
        for(CPos strongholdPosition : strongholdPositions){
            double distance = new BPos(x1,0,z1).distanceTo(strongholdPosition.toBlockPos(), DistanceMetric.EUCLIDEAN);
            if(distance<smallestDistance){
                smallestDistance = distance;
                closestStronghold = strongholdPosition;
            }
        }
        return closestStronghold;
    }
    /*
    ��ȡ�����һ����Ҫ��
    ����������:���ӣ�����ԭ��
    */
    public CPos closest_ow_sh_second(long seed,int x1, int z1) {
        Stronghold stronghold = new Stronghold(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer,seed);
        CPos[] strongholdPos = stronghold.getStarts(obs,9,new JRand(seed));
        List<CPos> strongholdPositions = new ArrayList<>(Arrays.asList(strongholdPos[0],strongholdPos[1],strongholdPos[2],strongholdPos[3],strongholdPos[4],strongholdPos[5],strongholdPos[6],strongholdPos[7],strongholdPos[8]));
        double smallestDistance = Integer.MAX_VALUE;
        CPos closestStronghold = new CPos(0,0);
        for(CPos strongholdPosition : strongholdPositions){
            double distance = new BPos(x1,0,z1).distanceTo(strongholdPosition.toBlockPos(), DistanceMetric.EUCLIDEAN);
            if(distance<smallestDistance){
                smallestDistance = distance;
                closestStronghold = strongholdPosition;
            }
        }
        return closestStronghold;
    }
    /*
    ��ȡ����Ķ�����Ҫ��������һ����
    ����������:���ӣ�����ԭ��
    */
    public CPos closest_ow_sh_all(long seed,int x1, int z1) {
        Stronghold stronghold = new Stronghold(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer,seed);
        CPos[] strongholdPos = stronghold.getStarts(obs,128,new JRand(seed));
        List<CPos> strongholdPositions = new ArrayList<>(Arrays.asList(strongholdPos[0],strongholdPos[1],strongholdPos[2],strongholdPos[3],strongholdPos[4],strongholdPos[5],strongholdPos[6],strongholdPos[7],strongholdPos[8],strongholdPos[9],strongholdPos[10],strongholdPos[11],strongholdPos[12],strongholdPos[13],strongholdPos[14],strongholdPos[15],strongholdPos[16],strongholdPos[17],strongholdPos[18],strongholdPos[19],strongholdPos[20],strongholdPos[21],strongholdPos[22],strongholdPos[23],strongholdPos[24],strongholdPos[25],strongholdPos[26],strongholdPos[27],strongholdPos[28],strongholdPos[29],strongholdPos[30],strongholdPos[31],strongholdPos[32],strongholdPos[33],strongholdPos[34],strongholdPos[35],strongholdPos[36],strongholdPos[37],strongholdPos[38],strongholdPos[39],strongholdPos[40],strongholdPos[41],strongholdPos[42],strongholdPos[43],strongholdPos[44],strongholdPos[45],strongholdPos[46],strongholdPos[47],strongholdPos[48],strongholdPos[49],strongholdPos[50],strongholdPos[51],strongholdPos[52],strongholdPos[53],strongholdPos[54],strongholdPos[55],strongholdPos[56],strongholdPos[57],strongholdPos[58],strongholdPos[59],strongholdPos[60],strongholdPos[61],strongholdPos[62],strongholdPos[63],strongholdPos[64],strongholdPos[65],strongholdPos[66],strongholdPos[67],strongholdPos[68],strongholdPos[69],strongholdPos[70],strongholdPos[71],strongholdPos[72],strongholdPos[73],strongholdPos[74],strongholdPos[75],strongholdPos[76],strongholdPos[77],strongholdPos[78],strongholdPos[79],strongholdPos[80],strongholdPos[81],strongholdPos[82],strongholdPos[83],strongholdPos[84],strongholdPos[85],strongholdPos[86],strongholdPos[87],strongholdPos[88],strongholdPos[89],strongholdPos[90],strongholdPos[91],strongholdPos[92],strongholdPos[93],strongholdPos[94],strongholdPos[95],strongholdPos[96],strongholdPos[97],strongholdPos[98],strongholdPos[99],strongholdPos[100],strongholdPos[101],strongholdPos[102],strongholdPos[103],strongholdPos[104],strongholdPos[105],strongholdPos[106],strongholdPos[107],strongholdPos[108],strongholdPos[109],strongholdPos[110],strongholdPos[111],strongholdPos[112],strongholdPos[113],strongholdPos[114],strongholdPos[115],strongholdPos[116],strongholdPos[117],strongholdPos[118],strongholdPos[119],strongholdPos[120],strongholdPos[121],strongholdPos[122],strongholdPos[123],strongholdPos[124],strongholdPos[125],strongholdPos[126],strongholdPos[127]));
        double smallestDistance = Integer.MAX_VALUE;
        CPos closestStronghold = new CPos(0,0);
        for(CPos strongholdPosition : strongholdPositions){
            double distance = new BPos(x1,0,z1).distanceTo(strongholdPosition.toBlockPos(), DistanceMetric.EUCLIDEAN);
            if(distance<smallestDistance){
                smallestDistance = distance;
                closestStronghold = strongholdPosition;
            }
        }
        return closestStronghold;
    }
    /*
    ��ȡ�����Ҫ�������⻷��
    ����������:���ӣ�����ԭ��
    */
    public BPos return_ow_sh_pr(long seed,CPos strongholdPos) {
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
        for(int y=1;y<=255;y++) {
            for (int x = strongholdPos.toBlockPos().getX() - 112; x < strongholdPos.toBlockPos().getX() + 112; x += 1) {
                for (int z = strongholdPos.toBlockPos().getZ() - 112; z < strongholdPos.toBlockPos().getZ() + 112; z += 5) {
                    if (checker.getBlock(x, y, z) == net.minecraft.block.Blocks.END_PORTAL_FRAME) {
                        return new BPos(x, y, z);
                    }
                }
            }
        }
        return null;
    }
    /*
    ��ȡҪ��pr�����ָ꣨������һ�������ſ�ܣ�
    ����������:���ӣ�����ԭ��
    */
    public int return_ow_sh_eyes(long seed,BPos PortalPos) {
        int Eyes = 0;
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
        for (int x = PortalPos.getX()-5;x < PortalPos.getX()+5; x++) {
            for (int z = PortalPos.getZ()-5;z < PortalPos.getZ()+5; z++) {
                    if (checker.getBlock(x,PortalPos.getY(),z)== net.minecraft.block.Blocks.END_PORTAL_FRAME) {
                        if (checker.getBlockState(x,PortalPos.getY(),z).toString().contains("true")) {
                            Eyes = Eyes+1;
                        }
                    }
            }
        }
        return Eyes;
    }
    /*
    ����Ҫ�������ŵ��۾���
    ����������:���ӣ�pr�����ָ꣨������һ�������ſ�ܣ�
    */
    public CPos filter_ow_vi_pieces(long seed,CPos cpos1,ChunkRand rand,String piece_name,BPos center,int r,int num) {
        int count = 0;
        if (cpos1 != null) {
            profotoce59.properties.VillageGenerator vg = new profotoce59.properties.VillageGenerator(MCVer);
            OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
            OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
            vg.generate(otg, cpos1,rand);
            List<profotoce59.properties.VillageGenerator.Piece> pieces = vg.getPieces();
            if (pieces != null) {

                for (VillageGenerator.Piece piece : pieces) {
                    if ((piece.getName().equals(piece_name)) && (piece.pos.distanceTo(center, DistanceMetric.EUCLIDEAN) <= r)) {
                        count++;
                    }
                }
            }
        }
        return count>=num?cpos1:null;
    }
    /*
    ɸѡ�������ׯ�ľ���piece���ɡ�
    �����������ɸѡ�����̣�����Ҷ�������̵�piece_name��taiga/houses/taiga_weaponsmith_1��
    ���������壺���ӡ���ׯ���꣬rand��piece���֣����꣬���������ΪԲ����Բ�İ뾶�����Բ��piece������
    */
    public CPos filter_ow_vi_pieces(long seed,CPos cpos1,ChunkRand rand,String piece_name,int num) {
        int count = 0;
        if (cpos1 != null) {
            profotoce59.properties.VillageGenerator vg = new profotoce59.properties.VillageGenerator(MCVer);
            OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
            OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
            vg.generate(otg, cpos1,rand);
            List<profotoce59.properties.VillageGenerator.Piece> pieces = vg.getPieces();
            if (pieces != null) {

                for (VillageGenerator.Piece piece : pieces) {
                    if (piece.getName().equals(piece_name)) {
                        count++;
                    }
                }
            }
        }
        return count>=num?cpos1:null;
    }
    /*
    ɸѡ�������ׯ�ľ���piece���ɡ�
    �����������ɸѡ�����̣�����Ҷ�������̵�piece_name��taiga/houses/taiga_weaponsmith_1��
    ���������壺���ӡ���ׯ���꣬rand��piece���֣�������ׯ��piece������
    */
}

