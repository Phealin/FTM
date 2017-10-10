package phealin.mod.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemShears;
import phealin.mod.Main;
import phealin.mod.init.ItemInit;
import phealin.mod.util.interfaces.IHasModel;

public class ToolShears extends ItemShears implements IHasModel
{
	public ToolShears(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.firsttab);
		
		ItemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
