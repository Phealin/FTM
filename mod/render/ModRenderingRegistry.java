package phealin.mod.render;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import phealin.mod.entity.EntityCentaur;
import phealin.mod.entity.EntityPurporiumGolem;
import phealin.mod.entity.EntityVioliumGolem;
import phealin.mod.entity.EntityWarthog;

public class ModRenderingRegistry {
	public static void registerEntityRenders()
	{
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityPurporiumGolem.class, new IRenderFactory<EntityPurporiumGolem>()
		{
			@Override
			public Render<? super EntityPurporiumGolem> createRenderFor(RenderManager manager) {
				return new RenderPurporiumGolem(manager);
			}
			
		});
		
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityVioliumGolem.class, new IRenderFactory<EntityVioliumGolem>()
		{
			@Override
			public Render<? super EntityVioliumGolem> createRenderFor(RenderManager manager) {
				return new RenderVioliumGolem(manager);
			}
			
		});
		
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityWarthog.class, new IRenderFactory<EntityWarthog>()
		{
			@Override
			public Render<? super EntityWarthog> createRenderFor(RenderManager manager) {
				return new RenderWarthog(manager);
			}
		});
		
		net.minecraftforge.fml.client.registry.RenderingRegistry.registerEntityRenderingHandler(EntityCentaur.class, new IRenderFactory<EntityCentaur>()
		{
			@Override
			public Render<? super EntityCentaur> createRenderFor(RenderManager manager)
			{
				return new RenderCentaur(manager);
			}
		});
	}
}
