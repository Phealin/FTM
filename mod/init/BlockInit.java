package phealin.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import phealin.mod.objects.blocks.BlockBase;
import phealin.mod.objects.blocks.BlockLeaf;
import phealin.mod.objects.blocks.BlockLogs;
import phealin.mod.objects.blocks.BlockOres;
import phealin.mod.objects.blocks.BlockPlank;
import phealin.mod.objects.blocks.BlockSaplings;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Pickaxe Based
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	public static final Block ORE_END = new BlockOres("ore_end", "end");
	public static final Block BLOCK_VIOLIUM = new BlockBase("block_violium", 5.0F, 10.0F);
	public static final Block BLOCK_PURPORIUM = new BlockBase("block_purporium", 5.0F, 15.0F);	
	
	//Axe Based
	public static final Block PLANKS = new BlockPlank("planks", 2.0F, 2.5F);
	public static final Block LOG = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLING = new BlockSaplings("sapling");

	//Fluids
	
	//Others
}