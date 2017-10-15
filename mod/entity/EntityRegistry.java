package phealin.mod.entity;

import net.minecraft.util.ResourceLocation;
import phealin.mod.Main;
import phealin.mod.util.Reference;

public class EntityRegistry 
{	
	public static void registerEntities() {
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":Purporium_Golem"), EntityPurporiumGolem.class, "Purporium Golem", -2, Main.instance, 64, 1, true, 0x4800FF, 0x21007F);
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":Violium_Golem"), EntityVioliumGolem.class, "Violium Golem", -1, Main.instance, 64, 1, true, 0xB200FF, 0x57007F);
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":warthog"), EntityWarthog.class, "Warthog", 0, Main.instance, 64, 1, true, 0x874E28, 0x855A26);
		net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":centaur"), EntityCentaur.class, "Centaur", 1, Main.instance, 64, 1, true, 0x874E28, 0x855A26);
	}
}