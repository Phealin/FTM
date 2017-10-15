package phealin.mod.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import phealin.mod.util.Reference;

public class LootTablesInit extends LootTableList
{
	public static final ResourceLocation ENTITIES_PURPORIUM_GOLEM = register("entities/purporium_golem");
	public static final ResourceLocation ENTITIES_VIOLIUM_GOLEM = register("entities/violium_golem");
	public static final ResourceLocation ENTITIES_WARTHOG = register("entities/Warthog");
	
	private static ResourceLocation register(String id)
	{
		return register(new ResourceLocation(Reference.MODID, id));
	}
}
