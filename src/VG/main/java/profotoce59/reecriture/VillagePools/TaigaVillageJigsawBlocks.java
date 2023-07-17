package profotoce59.reecriture.VillagePools;


import profotoce59.enumType.PoolType;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.util.block.BlockDirection;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.data.Quad;
import com.seedfinding.mccore.util.pos.BPos;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TaigaVillageJigsawBlocks {

    public static final HashMap<String, List<Pair<Quad<PoolType, String, Pair<BlockDirection,BlockDirection>, Block>, BPos>>> JIGSAW_BLOCKS = new HashMap<>() {{
        this.putAll(CommonVillageJigsawBlocks.JIGSAW_BLOCKS);
        this.put("taiga/taiga_decoration_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(1,1,3))
        ));
        this.put("taiga/taiga_decoration_2", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(1,0,1))
        ));
        this.put("taiga/taiga_decoration_3", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_4", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_5", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.CAMPFIRE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_6", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.HAY_BLOCK), new BPos(1,0,1))
        ));
        this.put("taiga/taiga_lamp_post_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE_WALL), new BPos(0,0,0))
        ));
        this.put("taiga/houses/taiga_animal_pen_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.ANIMALS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.SPRUCE_STAIRS), new BPos(6,0,7)),
                new Pair<>(new Quad<>(PoolType.ANIMALS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,3))
        ));
        this.put("taiga/houses/taiga_armorer_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_armorer_house_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_butcher_shop_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(4,0,8)),
                new Pair<>(new Quad<>(PoolType.BUTCHER_ANIMAL, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6))
        ));
        this.put("taiga/houses/taiga_cartographer_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_fisher_cottage_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,1,11)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,11))
        ));
        this.put("taiga/houses/taiga_fletcher_house_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,0,5))
        ));
        this.put("taiga/houses/taiga_large_farm_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,1)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_large_farm_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,8))
        ));
        this.put("taiga/houses/taiga_library_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0))
        ));
        this.put("taiga/houses/taiga_masons_house_1", Arrays.asList(
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(1,1,2)),*/
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,1,4))
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(1,1,6))*/
        ));
        this.put("taiga/houses/taiga_medium_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,3,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,5,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,5,3))
        ));
        this.put("taiga/houses/taiga_medium_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,4,5))
        ));
        this.put("taiga/houses/taiga_medium_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,6)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(4,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(4,0,8)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,6))
        ));
        this.put("taiga/houses/taiga_medium_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,8))
        ));
        this.put("taiga/houses/taiga_shepherds_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,5)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", null, Blocks.STRUCTURE_VOID), new BPos(1,1,6)),*/
                new Pair<>(new Quad<>(PoolType.SHEEPS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,6))
        ));
        this.put("taiga/houses/taiga_small_farm_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(6,1,0))
        ));
        this.put("taiga/houses/taiga_small_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_small_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,3))
        ));
        this.put("taiga/houses/taiga_small_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(3,0,3))
        ));
        this.put("taiga/houses/taiga_small_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,7))
        ));
        this.put("taiga/houses/taiga_small_house_5", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(4,0,3))
        ));
        this.put("taiga/houses/taiga_tannery_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE), new BPos(1,0,5))
        ));
        this.put("taiga/houses/taiga_temple_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,10))
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(11,1,1))*/
        ));
        this.put("taiga/houses/taiga_tool_smith_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,7))
        ));
        this.put("taiga/houses/taiga_weaponsmith_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_weaponsmith_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0))
        ));
        this.put("taiga/streets/corner_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(10,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,6))
        ));
        this.put("taiga/streets/corner_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,14))
        ));
        this.put("taiga/streets/corner_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,1))
        ));
        this.put("taiga/streets/crossroad_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/streets/crossroad_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(14,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/streets/crossroad_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/streets/crossroad_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/crossroad_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/streets/crossroad_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/streets/straight_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(4,0,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(12,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,15))
        ));
        this.put("taiga/streets/straight_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8))
        ));
        this.put("taiga/streets/straight_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7))
        ));
        this.put("taiga/streets/straight_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/straight_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,16)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,10))
        ));
        this.put("taiga/streets/straight_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,17)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,15))
        ));
        this.put("taiga/streets/turn_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4))
        ));
        this.put("taiga/town_centers/taiga_meeting_point_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,3)),
                new Pair<>(new Quad<>(PoolType.IRON_GOLEM, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(7,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(9,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,6))
        ));
        this.put("taiga/town_centers/taiga_meeting_point_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(1,1,1)),
                new Pair<>(new Quad<>(PoolType.IRON_GOLEM, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(8,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,2,4))
        ));
        this.put("taiga/villagers/baby", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/villagers/nitwit", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/villagers/unemployed", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/zombie/houses/taiga_cartographer_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_fisher_cottage_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,1,11)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,11))
        ));
        this.put("taiga/zombie/houses/taiga_large_farm_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,8))
        ));
        this.put("taiga/zombie/houses/taiga_library_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,3,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,5,3))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,4,5))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,6)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,6))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_4", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,8))
        ));
        this.put("taiga/zombie/houses/taiga_shepherds_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,5)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", null, Blocks.STRUCTURE_VOID), new BPos(1,1,6)),*/
                new Pair<>(new Quad<>(PoolType.SHEEPS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,6))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(3,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,7))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_5", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(4,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_temple_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,10))
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(11,1,1))*/
        ));
        this.put("taiga/zombie/houses/taiga_tool_smith_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,7))
        ));
        this.put("taiga/zombie/houses/taiga_weaponsmith_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0))
        ));
        this.put("taiga/zombie/streets/corner_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(10,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,6))
        ));
        this.put("taiga/zombie/streets/corner_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,14))
        ));
        this.put("taiga/zombie/streets/corner_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,1))
        ));
        this.put("taiga/zombie/streets/crossroad_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/zombie/streets/crossroad_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(14,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/zombie/streets/crossroad_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/zombie/streets/crossroad_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/crossroad_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/zombie/streets/crossroad_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/zombie/streets/straight_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(4,0,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(12,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,15))
        ));
        this.put("taiga/zombie/streets/straight_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8))
        ));
        this.put("taiga/zombie/streets/straight_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7))
        ));
        this.put("taiga/zombie/streets/straight_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/straight_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,16)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,10))
        ));
        this.put("taiga/zombie/streets/straight_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(8,1,4)),*/
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,17)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,15))
        ));
        this.put("taiga/zombie/streets/turn_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4))
        ));
        this.put("taiga/zombie/town_centers/taiga_meeting_point_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,6)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(4,1,3)),*/
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,6))
        ));
        this.put("taiga/zombie/town_centers/taiga_meeting_point_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,2,4))
        ));
        this.put("taiga/zombie/villagers/nitwit", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/zombie/villagers/unemployed", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/pine", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/patch_taiga_grass", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/pile_pumpkin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/patch_berry_bush", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/spruce", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));


    }};
    public static final HashMap<String, List<Pair<Quad<PoolType, String, Pair<BlockDirection,BlockDirection>, Block>, BPos>>> JIGSAW_BLOCKS15 = new HashMap<>() {{
        this.putAll(CommonVillageJigsawBlocks.JIGSAW_BLOCKS15);
        this.put("taiga/houses/taiga_animal_pen_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.ANIMALS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.ANIMALS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.SPRUCE_STAIRS), new BPos(6,0,7))
        ));
        this.put("taiga/houses/taiga_armorer_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_armorer_house_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_butcher_shop_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.BUTCHER_ANIMAL, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(4,0,8))
        ));
        this.put("taiga/houses/taiga_cartographer_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_fisher_cottage_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,1,11)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,11))
        ));
        this.put("taiga/houses/taiga_fletcher_house_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,0,5))
        ));
        this.put("taiga/houses/taiga_large_farm_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,1)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_large_farm_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,8))
        ));
        this.put("taiga/houses/taiga_library_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0))
        ));
        this.put("taiga/houses/taiga_masons_house_1", Arrays.asList(
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(1,1,2)),*/
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,1,4))
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(1,1,6))*/
        ));
        this.put("taiga/houses/taiga_medium_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,3,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,5,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,5,3))
        ));
        this.put("taiga/houses/taiga_medium_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,4,5))
        ));
        this.put("taiga/houses/taiga_medium_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(4,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(4,0,8)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,6))
        ));
        this.put("taiga/houses/taiga_medium_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,8))
        ));
        this.put("taiga/houses/taiga_shepherds_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,5)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", null, Blocks.STRUCTURE_VOID), new BPos(1,1,6)),*/
                new Pair<>(new Quad<>(PoolType.SHEEPS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,6))
        ));
        this.put("taiga/houses/taiga_small_farm_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(6,1,0))
        ));
        this.put("taiga/houses/taiga_small_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,1,3))
        ));
        this.put("taiga/houses/taiga_small_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,3))
        ));
        this.put("taiga/houses/taiga_small_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(3,0,3))
        ));
        this.put("taiga/houses/taiga_small_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,7))
        ));
        this.put("taiga/houses/taiga_small_house_5", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(4,0,3))
        ));
        this.put("taiga/houses/taiga_tannery_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE), new BPos(1,0,5))
        ));
        this.put("taiga/houses/taiga_temple_1", Arrays.asList(
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(11,1,1)),*/
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,10))
        ));
        this.put("taiga/houses/taiga_tool_smith_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,7))
        ));
        this.put("taiga/houses/taiga_weaponsmith_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_weaponsmith_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0))
        ));
        this.put("taiga/streets/corner_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(10,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8))
        ));
        this.put("taiga/streets/corner_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,14))
        ));
        this.put("taiga/streets/corner_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,3))
        ));
        this.put("taiga/streets/crossroad_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15))
        ));
        this.put("taiga/streets/crossroad_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(14,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15))
        ));
        this.put("taiga/streets/crossroad_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,15))
        ));
        this.put("taiga/streets/crossroad_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/crossroad_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/crossroad_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/straight_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(12,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(4,0,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,15))
        ));
        this.put("taiga/streets/straight_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,15))
        ));
        this.put("taiga/streets/straight_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,10))
        ));
        this.put("taiga/streets/straight_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,8))
        ));
        this.put("taiga/streets/straight_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,16))
        ));
        this.put("taiga/streets/straight_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(8,1,4)),*/
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,17))
        ));
        this.put("taiga/streets/turn_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,7))
        ));
        this.put("taiga/taiga_decoration_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(1,1,3))
        ));
        this.put("taiga/taiga_decoration_2", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(1,0,1))
        ));
        this.put("taiga/taiga_decoration_3", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_4", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_5", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.CAMPFIRE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_6", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.HAY_BLOCK), new BPos(1,0,1))
        ));
        this.put("taiga/taiga_lamp_post_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE_WALL), new BPos(0,0,0))
        ));
        this.put("taiga/town_centers/taiga_meeting_point_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(7,0,2)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.IRON_GOLEM, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(9,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,6))
        ));
        this.put("taiga/town_centers/taiga_meeting_point_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(1,1,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_PATH), new BPos(8,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.IRON_GOLEM, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,8))
        ));
        this.put("taiga/villagers/baby", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/villagers/nitwit", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/villagers/unemployed", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/zombie/houses/taiga_cartographer_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_fisher_cottage_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,1,11)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,11))
        ));
        this.put("taiga/zombie/houses/taiga_large_farm_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,8))
        ));
        this.put("taiga/zombie/houses/taiga_library_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,3,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,5,3))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,4,5))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,6))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_4", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,8))
        ));
        this.put("taiga/zombie/houses/taiga_shepherds_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,5)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", null, Blocks.STRUCTURE_VOID), new BPos(1,1,6)),*/
                new Pair<>(new Quad<>(PoolType.SHEEPS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,6))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,1,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(3,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,7))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_5", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(4,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_temple_1", Arrays.asList(
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(11,1,1)),*/
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,10))
        ));
        this.put("taiga/zombie/houses/taiga_tool_smith_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,7))
        ));
        this.put("taiga/zombie/houses/taiga_weaponsmith_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0))
        ));
        this.put("taiga/zombie/streets/corner_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(10,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8))
        ));
        this.put("taiga/zombie/streets/corner_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,14))
        ));
        this.put("taiga/zombie/streets/corner_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,3))
        ));
        this.put("taiga/zombie/streets/crossroad_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15))
        ));
        this.put("taiga/zombie/streets/crossroad_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(14,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15))
        ));
        this.put("taiga/zombie/streets/crossroad_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,15))
        ));
        this.put("taiga/zombie/streets/crossroad_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/crossroad_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/crossroad_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/straight_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(12,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(4,0,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,15))
        ));
        this.put("taiga/zombie/streets/straight_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,15))
        ));
        this.put("taiga/zombie/streets/straight_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,10))
        ));
        this.put("taiga/zombie/streets/straight_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,8))
        ));
        this.put("taiga/zombie/streets/straight_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,16))
        ));
        this.put("taiga/zombie/streets/straight_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(8,1,4)),*/
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,17))
        ));
        this.put("taiga/zombie/streets/turn_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,7))
        ));
        this.put("taiga/zombie/town_centers/taiga_meeting_point_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3)),
                /*new Pair<>(new Quad<>(PoolType.EMPTY, PoolType.EMPTY, null, Blocks.STRUCTURE_VOID), new BPos(4,1,3)),*/
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,6))
        ));
        this.put("taiga/zombie/town_centers/taiga_meeting_point_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,8))
        ));
        this.put("taiga/zombie/villagers/nitwit", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/zombie/villagers/unemployed", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/pine", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/patch_taiga_grass", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/pile_pumpkin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/patch_berry_bush", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/spruce", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
    }};
    public static final HashMap<String, List<Pair<Quad<PoolType, String, Pair<BlockDirection,BlockDirection>, Block>, BPos>>> JIGSAW_BLOCKS17 = new HashMap<>() {{
        this.putAll(CommonVillageJigsawBlocks.JIGSAW_BLOCKS);
        this.put("taiga/houses/taiga_animal_pen_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.ANIMALS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.SPRUCE_STAIRS), new BPos(6,0,7)),
                new Pair<>(new Quad<>(PoolType.ANIMALS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,3))
        ));
        this.put("taiga/houses/taiga_armorer_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_armorer_house_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_butcher_shop_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(4,0,8)),
                new Pair<>(new Quad<>(PoolType.BUTCHER_ANIMAL, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6))
        ));
        this.put("taiga/houses/taiga_cartographer_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_fisher_cottage_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,1,11)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,11))
        ));
        this.put("taiga/houses/taiga_fletcher_house_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,0,5))
        ));
        this.put("taiga/houses/taiga_large_farm_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,1)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3))
        ));
        this.put("taiga/houses/taiga_large_farm_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,8))
        ));
        this.put("taiga/houses/taiga_library_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0))
        ));
        this.put("taiga/houses/taiga_masons_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "empty",  new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.STRUCTURE_VOID), new BPos(1,1,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,1,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "empty",  new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.STRUCTURE_VOID), new BPos(1,1,6))
        ));
        this.put("taiga/houses/taiga_medium_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,3,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,5,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,5,3))
        ));
        this.put("taiga/houses/taiga_medium_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,4,5))
        ));
        this.put("taiga/houses/taiga_medium_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,6)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(4,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(4,0,8)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.AIR), new BPos(0,1,6))
        ));
        this.put("taiga/houses/taiga_medium_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.AIR), new BPos(5,1,8))
        ));
        this.put("taiga/houses/taiga_shepherds_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.SHEEPS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,6))
        ));
        this.put("taiga/houses/taiga_small_farm_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(6,1,0))
        ));
        this.put("taiga/houses/taiga_small_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_small_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,3))
        ));
        this.put("taiga/houses/taiga_small_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(3,0,3))
        ));
        this.put("taiga/houses/taiga_small_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,7))
        ));
        this.put("taiga/houses/taiga_small_house_5", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(4,0,3))
        ));
        this.put("taiga/houses/taiga_tannery_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE), new BPos(1,0,5))
        ));
        this.put("taiga/houses/taiga_temple_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,10)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "empty",  new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.STRUCTURE_VOID), new BPos(11,1,1))
        ));
        this.put("taiga/houses/taiga_tool_smith_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,7))
        ));
        this.put("taiga/houses/taiga_weaponsmith_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/houses/taiga_weaponsmith_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0))
        ));
        this.put("taiga/streets/corner_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(10,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,6))
        ));
        this.put("taiga/streets/corner_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,14))
        ));
        this.put("taiga/streets/corner_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,1))
        ));
        this.put("taiga/streets/crossroad_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/streets/crossroad_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(14,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/streets/crossroad_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/streets/crossroad_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/crossroad_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/streets/crossroad_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/streets/straight_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(4,0,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(12,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,15))
        ));
        this.put("taiga/streets/straight_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8))
        ));
        this.put("taiga/streets/straight_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7))
        ));
        this.put("taiga/streets/straight_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/streets/straight_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,16)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,10))
        ));
        this.put("taiga/streets/straight_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,17)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,15))
        ));
        this.put("taiga/streets/turn_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4))
        ));
        this.put("taiga/taiga_decoration_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(1,1,3))
        ));
        this.put("taiga/taiga_decoration_2", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(1,0,1))
        ));
        this.put("taiga/taiga_decoration_3", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_4", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_5", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.CAMPFIRE), new BPos(0,0,0))
        ));
        this.put("taiga/taiga_decoration_6", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.HAY_BLOCK), new BPos(1,0,1))
        ));
        this.put("taiga/taiga_lamp_post_1", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.COBBLESTONE_WALL), new BPos(0,0,0))
        ));
        this.put("taiga/town_centers/taiga_meeting_point_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,3)),
                new Pair<>(new Quad<>(PoolType.IRON_GOLEM, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(6,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(7,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(9,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_HOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,6))
        ));
        this.put("taiga/town_centers/taiga_meeting_point_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(1,1,1)),
                new Pair<>(new Quad<>(PoolType.IRON_GOLEM, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_VILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT_PATH), new BPos(8,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_DECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_STREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,2,4))
        ));
        this.put("taiga/villagers/baby", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/villagers/nitwit", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/villagers/unemployed", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/zombie/houses/taiga_cartographer_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_fisher_cottage_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,1,11)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,11))
        ));
        this.put("taiga/zombie/houses/taiga_large_farm_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(7,0,6)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,8))
        ));
        this.put("taiga/zombie/houses/taiga_library_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,3,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,5,3))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,4)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,4,5))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,6)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,6))
        ));
        this.put("taiga/zombie/houses/taiga_medium_house_4", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,8))
        ));
        this.put("taiga/zombie/houses/taiga_shepherds_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,0)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,5)),
                new Pair<>(new Quad<>(PoolType.SHEEPS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,6))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,0))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(3,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_3", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(3,0,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(3,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_4", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.COBBLESTONE), new BPos(2,0,3)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,7))
        ));
        this.put("taiga/zombie/houses/taiga_small_house_5", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.COBBLESTONE_STAIRS), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZVILLAGER, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.SPRUCE_PLANKS), new BPos(4,0,3))
        ));
        this.put("taiga/zombie/houses/taiga_temple_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,10)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "empty",  new Pair<>(BlockDirection.UP,BlockDirection.WEST), Blocks.STRUCTURE_VOID), new BPos(11,1,1))
        ));
        this.put("taiga/zombie/houses/taiga_tool_smith_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,7)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,7)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,7))
        ));
        this.put("taiga/zombie/houses/taiga_weaponsmith_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,2)),
                new Pair<>(new Quad<>(PoolType.EMPTY, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0))
        ));
        this.put("taiga/zombie/streets/corner_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(10,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,6))
        ));
        this.put("taiga/zombie/streets/corner_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,14))
        ));
        this.put("taiga/zombie/streets/corner_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,1))
        ));
        this.put("taiga/zombie/streets/crossroad_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/zombie/streets/crossroad_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,1)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(13,0,12)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(14,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/zombie/streets/crossroad_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,0,11)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(15,1,8))
        ));
        this.put("taiga/zombie/streets/crossroad_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/crossroad_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/zombie/streets/crossroad_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,2))
        ));
        this.put("taiga/zombie/streets/straight_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(4,0,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(11,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(12,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,15))
        ));
        this.put("taiga/zombie/streets/straight_02", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8))
        ));
        this.put("taiga/zombie/streets/straight_03", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7))
        ));
        this.put("taiga/zombie/streets/straight_04", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,0,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,4))
        ));
        this.put("taiga/zombie/streets/straight_05", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(1,0,13)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(1,1,16)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,10))
        ));
        this.put("taiga/zombie/streets/straight_06", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.DIRT), new BPos(8,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(9,0,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,15)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,2)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,17)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,9)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,10)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,14)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(10,1,15))
        ));
        this.put("taiga/zombie/streets/turn_01", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(9,1,4))
        ));
        this.put("taiga/zombie/town_centers/taiga_meeting_point_1", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(3,0,3)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(5,0,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(2,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(3,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(5,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(6,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(7,1,6)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,3)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,5)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZHOUSES, "building_entrance", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(11,1,6))
        ));
        this.put("taiga/zombie/town_centers/taiga_meeting_point_2", Arrays.asList(
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,0)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(0,1,6)),
                new Pair<>(new Quad<>(PoolType.CATS, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(2,1,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZDECOR, "bottom", new Pair<>(BlockDirection.UP,BlockDirection.NORTH), Blocks.GRASS_BLOCK), new BPos(8,1,7)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.WEST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(0,2,4)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.NORTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,0)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.SOUTH,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(4,2,8)),
                new Pair<>(new Quad<>(PoolType.TAIGA_ZSTREET, "street", new Pair<>(BlockDirection.EAST,BlockDirection.UP), Blocks.STRUCTURE_VOID), new BPos(8,2,4))
        ));
        this.put("taiga/zombie/villagers/nitwit", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/zombie/villagers/unemployed", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH), Blocks.STRUCTURE_VOID), new BPos(0,0,0))
        ));
        this.put("taiga/pine", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/patch_taiga_grass", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/pile_pumpkin", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/patch_berry_bush", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
        this.put("taiga/spruce", Collections.singletonList(
                new Pair<>(new Quad<>(PoolType.EMPTY, "bottom", new Pair<>(BlockDirection.DOWN,BlockDirection.SOUTH) ,Blocks.STRUCTURE_VOID),new BPos(0,0,0))
        ));
    }};

}

