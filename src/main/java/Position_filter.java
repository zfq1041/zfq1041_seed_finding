

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.biome.Biomes;
import com.seedfinding.mcbiome.source.NetherBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.block.Blocks;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.math.DistanceMetric;
import com.seedfinding.mccore.util.math.Vec3i;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.loot.LootContext;
import com.seedfinding.mcfeature.loot.MCLootTables;
import com.seedfinding.mcfeature.loot.enchantment.Enchantment;
import com.seedfinding.mcfeature.loot.item.ItemStack;
import com.seedfinding.mcfeature.misc.SpawnPoint;
import com.seedfinding.mcfeature.structure.*;
import com.seedfinding.mcfeature.structure.generator.structure.RuinedPortalGenerator;
import com.seedfinding.mcterrain.TerrainGenerator;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Math.sqrt;

public class Position_filter {

	MCVersion MCVer;

    Position_filter(long seed,MCVersion MCVer,ChunkRand rand) {
	this.MCVer = MCVer;
    }

    // 筛距离
    public static boolean dist(int x1, int z1, int x2, int z2, int max_x_dist, int max_z_dist) {
        int x_dist = x1 > x2 ? x1 - x2 : x2 - x1;
        int z_dist = z1 > z2 ? z1 - z2 : z2 - z1;
        x_dist = x_dist < 0 ? -x_dist : x_dist;
        z_dist = z_dist < 0 ? -z_dist : z_dist;
        if (x_dist <= max_x_dist && z_dist <= max_z_dist) {
            return true;
        } else {
            return false;
        }
    }
    public double distanceTo_no_y(BPos b1,BPos b2, DistanceMetric distance) {
        return distance.getDistance(b1.getX() - b2.getX(),0, b1.getZ() - b2.getZ());
    }
        /*
    长方形范围
    各参数含义:x和z轴的坐标中心，待筛的x和z轴的坐标，x和z轴的误差值（例如x1=0，max_x_dist=32则表示-32≤x≤32）
     */
}

