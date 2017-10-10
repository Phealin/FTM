package phealin.mod.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import phealin.mod.Main;
import phealin.mod.init.BlockInit;
import phealin.mod.init.ItemInit;
import phealin.mod.util.interfaces.IHasModel;

public class BlockWood extends Block implements IHasModel {

	public BlockWood(String name, float hardness, float resistance) {
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(hardness);
		setResistance(resistance);
		setCreativeTab(Main.firsttab);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	
}
