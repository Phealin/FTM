package phealin.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import phealin.mod.init.FluidAmburiusInit;
import phealin.mod.init.FluidCitiriusInit;
import phealin.mod.init.SmeltingInit;
import phealin.mod.proxy.CommonProxy;
import phealin.mod.render.ModRenderingRegistry;
import phealin.mod.tabs.FirstTab;
import phealin.mod.util.Reference;
import phealin.mod.util.handlers.RegistryHandler;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{
	
	static {
		FluidRegistry.enableUniversalBucket();
	}
	
	public static final CreativeTabs firsttab = new FirstTab("firsttab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {RegistryHandler.otherRegistries();}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {SmeltingInit.register();}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {}
	
}
