

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mcbiome.source.NetherBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.util.pos.RPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.ChestContent;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.LootTable;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.structure.*;
import com.seedfinding.mcfeature.structure.generator.Generator;
import com.seedfinding.mcfeature.structure.generator.Generators;
import com.seedfinding.mcfeature.structure.generator.structure.*;
import com.seedfinding.mcterrain.TerrainGenerator;
import com.seedfinding.mcterrain.terrain.NetherTerrainGenerator;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import nl.jellejurre.seedchecker.SeedChecker;
import nl.jellejurre.seedchecker.SeedCheckerDimension;
import nl.jellejurre.seedchecker.TargetState;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Chest_filter {

    private static void assertTrue(boolean condition) {
        assert condition;
    }
    int count;
    MCVersion MCVer;

    Chest_filter(MCVersion MCVer) {
        this.MCVer = MCVer;
    }
    /*
    箱子Filter
    各参数含义:MC版本
     */
    public CPos check_chest_rp(long seed, ChunkRand rand, CPos chest, String target, int num, String Enchantment, int Enchantment_level) {
        if (chest == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        // 加载箱子
        rand.setDecoratorSeed(seed, chest.getX() * 16, chest.getZ() * 16, 40005, MCVer);
        LootContext a1 = new LootContext(rand.nextLong());
        // 得到战利品
        List<ItemStack> ItemList = MCLootTables.RUINED_PORTAL_CHEST.get().generate(a1);
        boolean is_looted = false;
        for (ItemStack itemStack : ItemList) {
            if (itemStack.getItem().getName().equals(target)) {   // 如果有
                if (itemStack.getCount() >= num) {      // 如果够
                    if (Enchantment == "none") {
                        is_looted = true;
                    } else {
                        Pair<String, Integer> en = itemStack.getItem().getEnchantments().get(0);
                        if (en.getFirst() == Enchantment && en.getSecond() >= Enchantment_level) {
                            is_looted = true;
                        }
                    }
                }
            }
        }
        if (!is_looted) {
            chest = null;
        }
        return chest;
    }
    /*
    检查废弃传送门箱子
    各参数含义:种子，rand，箱子所在的区块，筛的物品，数量要求，附魔类型（不筛填none），附魔等级（不筛填0）
     */
    public CPos loot_chest_sw(long seed,ChunkRand rand,CPos ShipwreckPos, String target, int num) {
        if (ShipwreckPos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        rand.setCarverSeed(seed, ShipwreckPos.getX(), ShipwreckPos.getZ(), MCVer);
        int rotation = rand.nextInt(4);
        int count = 0;
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
        if (rotation == 0) {
            Box box = new Box(ShipwreckPos.toBlockPos().getX(), 0, ShipwreckPos.toBlockPos().getZ(), ShipwreckPos.toBlockPos().getX() + 16, 256, ShipwreckPos.toBlockPos().getZ() + 32);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<net.minecraft.item.ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (net.minecraft.item.ItemStack i : list) {
                if (i.getItem().toString() == target) {
                    count += i.getCount();
                }
            }
        }
        if (rotation == 1) {
            Box box = new Box(ShipwreckPos.toBlockPos().getX() + 16, 0, ShipwreckPos.toBlockPos().getZ(), ShipwreckPos.toBlockPos().getX() - 16, 256, ShipwreckPos.toBlockPos().getZ() + 32);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<net.minecraft.item.ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (net.minecraft.item.ItemStack i : list) {
                if (i.getItem().toString() == target) {
                    count += i.getCount();
                }
            }
        }
        if (rotation == 2) {
            Box box = new Box(ShipwreckPos.toBlockPos().getX(), 0, ShipwreckPos.toBlockPos().getZ(), ShipwreckPos.toBlockPos().getX() + 16, 256, ShipwreckPos.toBlockPos().getZ() + 32);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<net.minecraft.item.ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (net.minecraft.item.ItemStack i : list) {
                if (i.getItem().toString() == target) {
                    count += i.getCount();
                }
            }
        }
        if (rotation == 3) {
            Box box = new Box(ShipwreckPos.toBlockPos().getX() + 16, 0, ShipwreckPos.toBlockPos().getZ(), ShipwreckPos.toBlockPos().getX() - 16, 256, ShipwreckPos.toBlockPos().getZ() + 32);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<net.minecraft.item.ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (net.minecraft.item.ItemStack i : list) {
                if (i.getItem().toString() == target) {
                    count += i.getCount();
                }
            }
        }
        return count >= num?ShipwreckPos:null;
    }
    //施工中
    public CPos loot_chest_bt(long seed, CPos BuriedTreasurePos, String target, int num) {
        if (BuriedTreasurePos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
        Box box = new Box(BuriedTreasurePos.toBlockPos().getX(),0,BuriedTreasurePos.toBlockPos().getZ(),BuriedTreasurePos.toBlockPos().getX()+10,256,BuriedTreasurePos.toBlockPos().getZ()+10);
            Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
            List<net.minecraft.item.ItemStack> list = new ArrayList<>();
            for (BlockPos pos : blockEntities.keySet()) {
                list.addAll(checker.generateChestLoot(pos));
            }
            for (net.minecraft.item.ItemStack i : list) {
                if (i.getItem().toString() == target) {
                    count += i.getCount();
                }
            }
        return count >= num?BuriedTreasurePos:null;
    }
    //施工中
    public CPos loot_chest_dt(long seed, CPos DesertPyramidPos, String target, int num) {
        if (DesertPyramidPos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.OVERWORLD);
        Box box = new Box(DesertPyramidPos.toBlockPos().getX(),0,DesertPyramidPos.toBlockPos().getZ(),DesertPyramidPos.toBlockPos().getX()+16,256,DesertPyramidPos.toBlockPos().getZ()+16);
        Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
        List<net.minecraft.item.ItemStack> list = new ArrayList<>();
        for (BlockPos pos : blockEntities.keySet()) {
            list.addAll(checker.generateChestLoot(pos));
        }
        for (net.minecraft.item.ItemStack i : list) {
            if (i.getItem().toString() == target) {
                count += i.getCount();
            }
        }
        return count >= num?DesertPyramidPos:null;
    }
    //施工中
    public CPos loot_chest_br(long seed, ChunkRand rand,CPos bastionPos, String target, int num) {
        if (bastionPos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        rand.setCarverSeed(seed, bastionPos.getX(), bastionPos.getZ(), MCVer);
        int type = rand.nextInt(4);
        int rotation = rand.nextInt(4);
        int count = 0;
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.NETHER);
        if (type == 0) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-10);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-50,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+10,128,bastionPos.toBlockPos().getZ()-20);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }

            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-50,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+20,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }

            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-10,0,bastionPos.toBlockPos().getZ()+20,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }

            }
        }
        if (type == 1) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-10);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-30,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+20,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-10,0,bastionPos.toBlockPos().getZ()+20,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-30);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
        }
        if (type == 2) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-10,0,bastionPos.toBlockPos().getZ()+40,bastionPos.toBlockPos().getX()+40,128,bastionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-40,0,bastionPos.toBlockPos().getZ()+40,bastionPos.toBlockPos().getX()+40,128,bastionPos.toBlockPos().getZ()-10);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-40,0,bastionPos.toBlockPos().getZ()+40,bastionPos.toBlockPos().getX()+10,128,bastionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-40,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+40,128,bastionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
        }
        if (type == 3) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-30,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-20);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-50,0,bastionPos.toBlockPos().getZ()+30,bastionPos.toBlockPos().getX()+20,128,bastionPos.toBlockPos().getZ()-30);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-30,0,bastionPos.toBlockPos().getZ()+20,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+30,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-30);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
        }
        return count >= num?bastionPos:null;
    }
    //施工中
    public int loot_chest_br_2(long seed, ChunkRand rand,CPos bastionPos, String target) {
        if (bastionPos == null) {
            return 0;
        }
        if (target == "none") {
            return 0;
        }
        rand.setCarverSeed(seed, bastionPos.getX(), bastionPos.getZ(), MCVer);
        int type = rand.nextInt(4);
        int rotation = rand.nextInt(4);
        int count = 0;
        SeedChecker checker = new SeedChecker(seed, TargetState.FULL, SeedCheckerDimension.NETHER);
        if (type == 0) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-10);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-50,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+10,128,bastionPos.toBlockPos().getZ()-20);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }

            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-50,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+20,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }

            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-10,0,bastionPos.toBlockPos().getZ()+20,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }

            }
        }
        if (type == 1) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-10);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-30,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+20,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-10,0,bastionPos.toBlockPos().getZ()+20,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-30);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
        }
        if (type == 2) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-10,0,bastionPos.toBlockPos().getZ()+40,bastionPos.toBlockPos().getX()+40,128,bastionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-40,0,bastionPos.toBlockPos().getZ()+40,bastionPos.toBlockPos().getX()+40,128,bastionPos.toBlockPos().getZ()-10);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-40,0,bastionPos.toBlockPos().getZ()+40,bastionPos.toBlockPos().getX()+10,128,bastionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-40,0,bastionPos.toBlockPos().getZ()+10,bastionPos.toBlockPos().getX()+40,128,bastionPos.toBlockPos().getZ()-40);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
        }
        if (type == 3) {
            if (rotation == 0) {
                Box box = new Box(bastionPos.toBlockPos().getX()-30,0,bastionPos.toBlockPos().getZ()+50,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-20);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 1) {
                Box box = new Box(bastionPos.toBlockPos().getX()-50,0,bastionPos.toBlockPos().getZ()+30,bastionPos.toBlockPos().getX()+20,128,bastionPos.toBlockPos().getZ()-30);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 2) {
                Box box = new Box(bastionPos.toBlockPos().getX()-30,0,bastionPos.toBlockPos().getZ()+20,bastionPos.toBlockPos().getX()+30,128,bastionPos.toBlockPos().getZ()-50);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
            if (rotation == 3) {
                Box box = new Box(bastionPos.toBlockPos().getX()-20,0,bastionPos.toBlockPos().getZ()+30,bastionPos.toBlockPos().getX()+50,128,bastionPos.toBlockPos().getZ()-30);
                Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
                List<net.minecraft.item.ItemStack> list = new ArrayList<>();
                for(BlockPos pos : blockEntities.keySet()){
                    list.addAll(checker.generateChestLoot(pos));
                }
                for (net.minecraft.item.ItemStack i : list) {
                    if (i.getItem().toString() == target) {
                        count += i.getCount();
                    }
                }
            }
        }
        return count;
    }

    public int seedchecker_chest_in_box(long seed_now,TargetState TargetState,SeedCheckerDimension SeedCheckerDimension,  Box box,String target) {
        int count = 0;
        SeedChecker checker = new SeedChecker(seed_now, TargetState, SeedCheckerDimension);
        Map<BlockPos, BlockEntity> blockEntities = checker.getBlockEntitiesInBox(BlockEntityType.CHEST, box);
        List<net.minecraft.item.ItemStack> list = new ArrayList<>();
        for (BlockPos pos : blockEntities.keySet()) {
            list.addAll(checker.generateChestLoot(pos));
        }
        for (net.minecraft.item.ItemStack i : list) {
            if (i.getItem().toString() == target) {
                count += i.getCount();
            }
        }
        return count;
    }
    /*
    返回任意box内的箱子物品(seedchecker)
    各参数含义:种子，TargetState(seedchecker的生成完整性，建议选TargetState.FULL)，维度，box，筛的物品
     */
    public int LootTreasureBottom(long StructureSeed,CPos BottomPos, String target) {
        ChunkRand rand = new ChunkRand();
        LootTable lootTable = MCLootTables.BASTION_TREASURE_CHEST.get();
        lootTable.apply(MCVer);
        int count = 0;
        rand.setDecoratorSeed(StructureSeed,BottomPos.getX()*16,BottomPos.getZ()*16,40012,MCVer);
        for (int i = 0; i < 2; i++) {
            LootContext context = new LootContext(rand.nextLong(), MCVer);
            List<ItemStack> bastionItems = lootTable.generate(context);
            for (ItemStack itemStack : bastionItems) {
                if (itemStack.getItem().getName().equals(target)) {   // 如果有
                    count += itemStack.getCount();
                }
            }
        }
        return count;
    }
    //施工中
    public CPos check_chest_dt(long seed,CPos cpos, String target, int num){
        if (cpos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        ChunkRand rand = new ChunkRand();
        DesertPyramid desertPyramid = new DesertPyramid(MCVer);
        Generator.GeneratorFactory<?> generatorFactory = Generators.get(desertPyramid.getClass());
        assert generatorFactory != null;
        Generator structureGenerator = generatorFactory.create(MCVer);
        assert structureGenerator instanceof DesertPyramidGenerator;
        BiomeSource source = BiomeSource.of(Dimension.OVERWORLD, MCVer, seed);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.OVERWORLD, source);
        RegionStructure.Data<DesertPyramid> data = (RegionStructure.Data<DesertPyramid>)desertPyramid.at(cpos.getX(), cpos.getZ());
        assertTrue(structureGenerator.generate(terrainGenerator, cpos, rand));
        assertTrue(structureGenerator.generate(terrainGenerator, data.chunkX, data.chunkZ, rand));
        assertTrue(structureGenerator.getChestsPos().size() == 4);
        List<ChestContent> chests = desertPyramid.getLoot(seed, structureGenerator, rand, false);
        List<ChestContent> chest1 = chests.stream().filter(e -> e.ofType(DesertPyramidGenerator.LootType.CHEST_1)).collect(Collectors.toList());
        assertTrue(chest1.size() == 1);
        List<ChestContent> chest2 = chests.stream().filter(e -> e.ofType(DesertPyramidGenerator.LootType.CHEST_2)).collect(Collectors.toList());
        assertTrue(chest2.size() == 1);
        List<ChestContent> chest3 = chests.stream().filter(e -> e.ofType(DesertPyramidGenerator.LootType.CHEST_3)).collect(Collectors.toList());
        assertTrue(chest3.size() == 1);
        List<ChestContent> chest4 = chests.stream().filter(e -> e.ofType(DesertPyramidGenerator.LootType.CHEST_4)).collect(Collectors.toList());
        assertTrue(chest4.size() == 1);
        int count = 0;
        for (ChestContent ChestContent1 : chest1) {
            List<ItemStack> itemStacks1 = ChestContent1.getItems();
            for (ItemStack itemStack : itemStacks1) {
                if (itemStack.getItem().getName().equals(target)) {   // 如果有
                    count += itemStack.getCount();
                }
            }
        }
        for (ChestContent ChestContent2 : chest2) {
            List<ItemStack> itemStacks2 = ChestContent2.getItems();
            for (ItemStack itemStack : itemStacks2) {
                if (itemStack.getItem().getName().equals(target)) {   // 如果有
                    count += itemStack.getCount();
                }
            }
        }
        for (ChestContent ChestContent3 : chest3) {
            List<ItemStack> itemStacks3 = ChestContent3.getItems();
            for (ItemStack itemStack : itemStacks3) {
                if (itemStack.getItem().getName().equals(target)) {   // 如果有
                    count += itemStack.getCount();
                }
            }
        }
        for (ChestContent ChestContent4 : chest4) {
            List<ItemStack> itemStacks4 = ChestContent4.getItems();
            for (ItemStack itemStack : itemStacks4) {
                if (itemStack.getItem().getName().equals(target)) {   // 如果有
                    count += itemStack.getCount();
                }
            }
        }
        if(count>=num){
            return cpos;
            //return new CPos(count,count);
        }
        else {
            return null;
        }
    }
    /*
    检查沙漠神殿箱子
    各参数含义:种子，沙漠神殿位置，筛的物品，数量要求
     */
    public CPos check_chest_bt(long seed,CPos cpos, String target, int num){
        if (cpos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        ChunkRand rand = new ChunkRand();
        BuriedTreasure buriedTreasure = new BuriedTreasure(MCVer);
        Generator.GeneratorFactory<?> generatorFactory = Generators.get(buriedTreasure.getClass());
        assert generatorFactory != null;
        Generator structureGenerator = generatorFactory.create(MCVer);
        assert structureGenerator instanceof BuriedTreasureGenerator;
        BiomeSource source = BiomeSource.of(Dimension.OVERWORLD, MCVer, seed);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.OVERWORLD, source);
        RegionStructure.Data<BuriedTreasure> data = buriedTreasure.at(cpos.getX(), cpos.getZ());
        assertTrue(structureGenerator.generate(terrainGenerator, cpos, rand));
        assertTrue(structureGenerator.generate(terrainGenerator, data.chunkX, data.chunkZ, rand));
        assertTrue(structureGenerator.getChestsPos().size() == 1);
        List<ChestContent> chest = buriedTreasure.getLoot(seed, structureGenerator, rand, false);
        int count = 0;
        for (ChestContent ChestContent1 : chest) {
            List<ItemStack> itemStacks1 = ChestContent1.getItems();
            for (ItemStack itemStack : itemStacks1) {
                if (itemStack.getItem().getName().equals(target)) {   // 如果有
                    count += itemStack.getCount();
                }
            }
        }
        if(count>=num){
            return cpos;
            //return new CPos(count,count);
        }
        else {
            return null;
        }
    }
    /*
    检查宝藏箱子
    各参数含义:种子，宝藏位置，筛的物品，数量要求
     */
    public CPos check_chest_sw(long seed,CPos cpos, String target, int num,String type){
        if (cpos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        ChunkRand rand = new ChunkRand();
        Shipwreck shipwreck = new Shipwreck(MCVer);
        Generator.GeneratorFactory<?> generatorFactory = Generators.get(shipwreck.getClass());
        assert generatorFactory != null;
        Generator structureGenerator = generatorFactory.create(MCVer);
        assert structureGenerator instanceof ShipwreckGenerator;
        BiomeSource source = BiomeSource.of(Dimension.OVERWORLD, MCVer, seed);
        TerrainGenerator terrainGenerator = TerrainGenerator.of(Dimension.OVERWORLD, source);
        RegionStructure.Data<Shipwreck> data = (RegionStructure.Data<Shipwreck>)shipwreck.at(-cpos.getX(),cpos.getZ());assertTrue(structureGenerator.generate(terrainGenerator, cpos, rand));
        assertTrue(structureGenerator.generate(terrainGenerator, data.chunkX, data.chunkZ, rand));
        assertTrue(structureGenerator.getChestsPos().size() == 1);
        List<ChestContent> chests = shipwreck.getLoot(seed, structureGenerator, rand, false);
        List<ChestContent> treasureChest = chests.stream().filter(e -> e.ofType(ShipwreckGenerator.LootType.TREASURE_CHEST)).collect(Collectors.toList());
        assertTrue(treasureChest.size() == 1);
        List<ChestContent> mapChest = chests.stream().filter(e -> e.ofType(ShipwreckGenerator.LootType.MAP_CHEST)).collect(Collectors.toList());
        assertTrue(mapChest.size() == 1);
        List<ChestContent> supplyChest = chests.stream().filter(e -> e.ofType(ShipwreckGenerator.LootType.SUPPLY_CHEST)).collect(Collectors.toList());
        assertTrue(supplyChest.size() == 1);

        int count = 0;
        if(type == "none"||type == "teeasure") {
            for (ChestContent ChestContent1 : treasureChest) {
                List<ItemStack> itemStacks1 = ChestContent1.getItems();
                for (ItemStack itemStack : itemStacks1) {
                    if (itemStack.getItem().getName().equals(target)) {   // 如果有
                        count += itemStack.getCount();
                    }
                }
            }
        }
        if(type == "none"||type == "map") {
            for (ChestContent ChestContent2 : mapChest) {
                List<ItemStack> itemStacks2 = ChestContent2.getItems();
                for (ItemStack itemStack : itemStacks2) {
                    if (itemStack.getItem().getName().equals(target)) {   // 如果有
                        count += itemStack.getCount();
                    }
                }
            }
        }
        if(type == "none"||type == "supply") {
            for (ChestContent ChestContent3 : supplyChest) {
                List<ItemStack> itemStacks3 = ChestContent3.getItems();
                for (ItemStack itemStack : itemStacks3) {
                    if (itemStack.getItem().getName().equals(target)) {   // 如果有
                        count += itemStack.getCount();
                    }
                }
            }
        }
        if(count>=num){
            return cpos;
        }
        else {
            return null;
        }
    }//有bug
    /*
    检查沉船箱子
    各参数含义:种子，沉船位置，筛的物品，数量要求，沉船箱子类型
     */
    public CPos check_chest_vi(long seed,CPos cpos, String target, int num,String type){
        if (cpos == null) {
            return null;
        }
        if (target == "none") {
            return null;
        }
        int count = 0;
        ChunkRand rand = new ChunkRand();
        profotoce59.properties.VillageGenerator vg = new profotoce59.properties.VillageGenerator(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        if (vg.generate(otg, cpos, rand)) {
            List<Pair<BPos, List<ItemStack>>> chests = vg.generateLoot(otg, rand);
            for (Pair<BPos, List<ItemStack>> chest : chests) {
                for (ItemStack item : chest.getSecond()) {
                    // If we find obsidian, add that to the total obsidian in this chest.
                    if (item.getItem().getName().equals(target)) {
                        count += item.getCount();
                    }
                }
            }
        }
        if(count>=num){
            return cpos;
        }
        else {
            return null;
        }
    }//有bug
    /*
    检查村庄箱子
    各参数含义:种子，村庄位置，筛的物品，数量要求，沉船箱子类型
     */
    public int return_ow_vi_blacksmith(long seed,CPos cpos){
        if (cpos == null) {
            return -1;
        }
        ChunkRand rand = new ChunkRand();
        profotoce59.properties.VillageGenerator vg = new profotoce59.properties.VillageGenerator(MCVer);
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        vg.generate(otg, cpos, rand);
        return vg.getNumberOfBlackSmith();
    }
    /*
    返回村庄铁匠铺数量
     */
}


