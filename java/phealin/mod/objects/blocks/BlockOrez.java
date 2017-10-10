package phealin.mod.objects.blocks;

import net.minecraft.block.material.Material;
import phealin.mod.util.interfaces.IHasModel;

public class BlockOrez extends BlockBase implements IHasModel 
{
	public BlockOrez(String name, Material material, float hardness, float resistance, int harvestLevel) 
	{
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
}
