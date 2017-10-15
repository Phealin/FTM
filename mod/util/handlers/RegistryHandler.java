package phealin.mod.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import phealin.mod.entity.EntityPurporiumGolem;
import phealin.mod.entity.EntityRegistry;
import phealin.mod.init.BlockInit;
import phealin.mod.init.FluidAmburiusInit;
import phealin.mod.init.FluidCitiriusInit;
import phealin.mod.init.ItemInit;
import phealin.mod.render.ModRenderingRegistry;
import phealin.mod.util.Reference;
import phealin.mod.util.interfaces.IHasModel;
import phealin.mod.world.gen.WorldGenCustomOres;

@EventBusSubscriber
public class RegistryHandler 
{
	
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void otherRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		FluidCitiriusInit.register();
		FluidAmburiusInit.register();
		ModRenderingRegistry.registerEntityRenders();
		EntityRegistry.registerEntities();
	}
}
