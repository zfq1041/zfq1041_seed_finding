

import com.seedfinding.mcbiome.biome.Biome;
import com.seedfinding.mcbiome.source.EndBiomeSource;
import com.seedfinding.mcbiome.source.NetherBiomeSource;
import com.seedfinding.mcbiome.source.OverworldBiomeSource;
import com.seedfinding.mccore.util.pos.BPos;
import com.seedfinding.mccore.version.MCVersion;

public class Biome_filter {

	MCVersion MCVer;

    Biome_filter(MCVersion MCVer) {
	this.MCVer = MCVer;
    }
    /*
    群系Filter
    各参数含义:MC版本
     */
    public Biome return_biome_ow(long seed, int x1, int z1, int y) {
        OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
        Biome biome = obs.getBiome(x1,y,z1);
        return biome;
    }
    /*
    返回坐标处主世界群系
    各参数含义:种子，xyz（y轴高度一般情况下255即可）
     */
    public Biome return_biome_ne(long seed, int x1, int z1, int y) {
        NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
        Biome biome = obs.getBiome(x1,y,z1);
        return biome;
    }
    /*
    返回坐标处下界群系
    各参数含义:种子，xyz（y轴高度一般情况下255即可）
     */
    public Biome return_biome_end(long seed, int x1, int z1, int y) {
        EndBiomeSource obs = new EndBiomeSource(MCVer, seed);
        Biome biome = obs.getBiome(x1,y,z1);
        return biome;
    }
    /*
    返回坐标处末地群系
    各参数含义:种子，xyz（y轴高度一般情况下255即可）
     */
    public BPos check_biome_ow(long seed, int x1, int z1, int max_x_dist, int max_z_dist, int y, String bi_name, int spiral) {
        int x,z;
        x=x1-max_x_dist;
        z=z1-max_z_dist;
        for(int i=x;i-x1<=max_x_dist;i+=spiral){
            for(int j=x;j-z1<=max_z_dist;j+=spiral){
                OverworldBiomeSource obs = new OverworldBiomeSource(MCVer, seed);
                Biome biome = obs.getBiome(i, y, j);
                if(biome.getName()==bi_name){
                    Other_filter of = new Other_filter(MCVer);
                    return new BPos(i,of.get_ow_surface_y(seed,i,j),j);
                }
            }
        }
        return null;
    }
    /*
    主世界群系
    各参数含义:种子，x和z轴的坐标中心，x和z轴的误差值（例如x1=0，max_x_dist=32则表示-32≤x≤32），y轴高度（一般情况下255即可），群系名，spiral（相当于cubiomes-viewer的1:x）
     */
    public BPos check_biome_ne(long seed, int x1, int z1, int max_x_dist, int max_z_dist, int y, String bi_name, int spiral) {
        int x,z;
        x=x1-max_x_dist;
        z=z1-max_z_dist;
        for(int i=x;i-x1<=max_x_dist;i+=spiral){
            for(int j=x;j-z1<=max_z_dist;j+=spiral){
                NetherBiomeSource obs = new NetherBiomeSource(MCVer, seed);
                Biome biome = obs.getBiome(i, y, j);
                if(biome.getName()==bi_name){
                    Other_filter of = new Other_filter(MCVer);
                    return new BPos(i,of.get_ne_surface_y(seed,i,j),j);
                }
            }
        }
        return null;
    }
    /*
    下界群系
    各参数含义:种子，x和z轴的坐标中心，x和z轴的误差值（例如x1=0，max_x_dist=32则表示-32≤x≤32），y轴高度（一般情况下255即可），群系名，spiral（相当于cubiomes-viewer的1:x）
     */
    public BPos check_biome_end(long seed, int x1, int z1, int max_x_dist, int max_z_dist, int y, String bi_name, int spiral) {
        int x,z;
        x=x1-max_x_dist;
        z=z1-max_z_dist;
        for(int i=x;i-x1<=max_x_dist;i+=spiral){
            for(int j=x;j-z1<=max_z_dist;j+=spiral){
                EndBiomeSource obs = new EndBiomeSource(MCVer, seed);
                Biome biome = obs.getBiome(i, y, j);
                if(biome.getName()==bi_name){
                    Other_filter of = new Other_filter(MCVer);
                    return new BPos(i,of.get_ne_surface_y(seed,i,j),j);
                }
            }
        }
        return null;
    }
    /*
    末地群系
    各参数含义:种子，x和z轴的坐标中心，x和z轴的误差值（例如x1=0，max_x_dist=32则表示-32≤x≤32），y轴高度（一般情况下255即可），群系名，spiral（相当于cubiomes-viewer的1:x）
     */
}

