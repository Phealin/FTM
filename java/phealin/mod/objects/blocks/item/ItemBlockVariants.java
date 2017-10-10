package phealin.mod.objects.blocks.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import phealin.mod.Main;
import phealin.mod.util.interfaces.IHasModel;
import phealin.mod.util.interfaces.IMetaName;

public class ItemBlockVariants extends ItemBlock implements IHasModel
{
	public ItemBlockVariants(Block block)
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
		
	}
	
	@Override
	public int getMetadata(int damage)
	{
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return super.getUnlocalizedName() + "_" + ((IMetaName)this.block).getSpecialName(stack);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
