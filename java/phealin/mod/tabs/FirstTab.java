package phealin.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import phealin.mod.init.BlockInit;
import phealin.mod.init.ItemInit;

public class FirstTab extends CreativeTabs 
{
	public FirstTab(String label)
	{
		super("firsttab");
		this.setBackgroundImageName("first.png");
	}

	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ItemInit.PICKAXE_VIOLIUM);
	}
}
