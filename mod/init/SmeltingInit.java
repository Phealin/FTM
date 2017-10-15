package phealin.mod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingInit {
	
	public static void register()
	{
		
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 0), new ItemStack(ItemInit.INGOT_VIOLIUM), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_NETHER, 1, 0), new ItemStack(ItemInit.INGOT_VIOLIUM), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_END, 1, 0), new ItemStack(ItemInit.INGOT_VIOLIUM), 1.0F);
		
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 1), new ItemStack(ItemInit.INGOT_PURPORIUM), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_NETHER, 1, 1), new ItemStack(ItemInit.INGOT_PURPORIUM), 1.0F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_END, 1, 1), new ItemStack(ItemInit.INGOT_PURPORIUM), 1.0F);
	}
}
