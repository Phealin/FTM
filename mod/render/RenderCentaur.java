package phealin.mod.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import phealin.mod.entity.EntityCentaur;
import phealin.mod.models.ModelCentaur;

public class RenderCentaur extends RenderLiving<EntityCentaur> 
{
private static final ResourceLocation CENTAUR_TEXTURES = new ResourceLocation("ftm:textures/entity/centaur.png");
	
	public RenderCentaur(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelCentaur(), 0.5F);
	}
	
	protected ResourceLocation getEntityTexture(EntityCentaur entity)
	{
		return CENTAUR_TEXTURES;
	}
	
	protected void applyRotations(EntityCentaur entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
