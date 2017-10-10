package phealin.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.world.storage.loot.functions.Smelt;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingInit {
	
	public static void register()
	{
		
		
		GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD_VIOLIUM, new ItemStack(ItemInit.INGOT_VIOLIUM), 1.0F);
		GameRegistry.addSmelting(BlockInit.ORE_END_VIOLIUM, new ItemStack(ItemInit.INGOT_VIOLIUM), 1.0F);
		GameRegistry.addSmelting(BlockInit.ORE_NETHER_VIOLIUM, new ItemStack(ItemInit.INGOT_VIOLIUM), 1.0F);
		
		GameRegistry.addSmelting(BlockInit.ORE_OVERWORLD_PURPORIUM, new ItemStack(ItemInit.INGOT_PURPORIUM), 1.0F);
		GameRegistry.addSmelting(BlockInit.ORE_END_PURPORIUM, new ItemStack(ItemInit.INGOT_PURPORIUM), 1.0F);
		GameRegistry.addSmelting(BlockInit.ORE_NETHER_PURPORIUM, new ItemStack(ItemInit.INGOT_PURPORIUM), 1.0F);
	}
}
