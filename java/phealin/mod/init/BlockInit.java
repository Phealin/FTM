package phealin.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import phealin.mod.objects.blocks.BlockBase;
import phealin.mod.objects.blocks.BlockLeaf;
import phealin.mod.objects.blocks.BlockLogs;
import phealin.mod.objects.blocks.BlockOres;
import phealin.mod.objects.blocks.BlockOrez;
import phealin.mod.objects.blocks.BlockPlank;
import phealin.mod.objects.blocks.BlockSaplings;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Pickaxe Based
	public static final Block ORE_END = new BlockOres("ore_end", "end", 0, 0, 0);
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld", 0, 0, 0);
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether", 0, 0, 0);
	
	public static final Block ORE_OVERWORLD_VIOLIUM = new BlockOrez("ore_overworld_violium", null, 3.0F, 5.0F, 2);
	public static final Block ORE_END_VIOLIUM = new BlockOrez("ore_end_violium", null, 3.0F, 5.0F, 2);
	public static final Block ORE_NETHER_VIOLIUM = new BlockOrez("ore_nether_violium", null, 3.0F, 5.0F, 2);
	public static final Block BLOCK_VIOLIUM = new BlockBase("block_violium", 5.0F, 10.0F);
	public static final Block ORE_OVERWORLD_PURPORIUM = new BlockOrez("ore_overworld_purporium", null, 5.0F, 7.0F, 4);
	public static final Block ORE_END_PURPORIUM = new BlockOrez("ore_end_purporium", null, 5.0F, 7.0F, 4);
	public static final Block ORE_NETHER_PURPORIUM = new BlockOrez("ore_nether_purporium", null, 7.0F, 5.0F, 4);
	public static final Block BLOCK_PURPORIUM = new BlockBase("block_purporium", 5.0F, 15.0F);
	
	//Axe Based
	public static final Block PLANKS = new BlockPlank("planks", 2.0F, 2.5F);
	public static final Block LOG = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLING = new BlockSaplings("sapling");
	
	
	//Fluids
	//public static final Block FLUID_BLOCK_CITIRIUS = new FluidBlockCitirius();
	
	//Others
}