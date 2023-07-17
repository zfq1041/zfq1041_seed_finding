

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.EndBiomeSource;
import com.seedfinding.mcbiome.source.NetherBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.block.Block;
import com.seedfinding.mccore.rand.ChunkRand;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.util.block.BlockBox;
import com.seedfinding.mccore.util.data.Pair;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.util.pos.CPos;
import com.seedfinding.mccore.version.MCVersion;
import com.seedfinding.mcfeature.misc.SlimeChunk;
import com.seedfinding.mcfeature.misc.SpawnPoint;
import com.seedfinding.mcterrain.TerrainGenerator;
import com.seedfinding.mcterrain.terrain.EndTerrainGenerator;
import com.seedfinding.mcterrain.terrain.NetherTerrainGenerator;
import com.seedfinding.mcterrain.terrain.OverworldTerrainGenerator;
import net.minecraft.block.Blocks;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.util.math.Box;
import nl.jellejurre.seedchecker.SeedChecker;
import nl.jellejurre.seedchecker.SeedCheckerDimension;
import nl.jellejurre.seedchecker.TargetState;

import javax.swing.*;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Other_filter {
    MCVersion MCVer;

    Other_filter(MCVersion MCVer) {
        this.MCVer = MCVer;
    }
    /*
    ����Filter
    ����������:MC�汾
     */

    public BPos get_sp(long seed) {
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        return SpawnPoint.getSpawn(otg);
    }
    /*
    ��ȡ������
    ����������:����
     */
    public int get_ow_surface_y(long seed, int x, int z) {
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        OverworldTerrainGenerator otg = new OverworldTerrainGenerator(obs);
        return otg.getHeightOnGround(x, z);
    }
    /*
    ��ȡ������ر�߶�
    ����������:���ӣ�x��z������
     */
    public int get_ne_surface_y(long seed, int x, int z) {
        NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
        NetherTerrainGenerator otg = new NetherTerrainGenerator(obs);
        return otg.getHeightOnGround(x, z);
    }
    /*
    ��ȡ�½�ر�߶�
    ����������:���ӣ�x��z������
     */
    public int get_end_surface_y(long seed, int x, int z) {
        EndBiomeSource obs = new EndBiomeSource(MCVer, seed);
        EndTerrainGenerator otg = new EndTerrainGenerator(obs);
        return otg.getHeightOnGround(x, z);
    }
        /*
    ��ȡĩ�صر�߶�
    ����������:���ӣ�x��z������
     */
    public int seedchecker_en_in_box(long seed_now,TargetState TargetState,SeedCheckerDimension SeedCheckerDimension, Box box,String target){
        SeedChecker checker = new SeedChecker(seed_now, TargetState, SeedCheckerDimension);

        List<NbtCompound> Entities = checker.getEntitiesInBox(box);
        int count = 0;

        for (NbtCompound i : Entities) {
            if(i.toString().contains(target)==true){
                count+=1;
            }
        }

        return count;
    }
    /*
    ��������box�ڵ�ʵ����(seedchecker)
    ����������:���ӣ�TargetState(seedchecker�����������ԣ�����ѡTargetState.FULL)��ά�ȣ�box��ʵ����
     */
}

