package phealin.mod.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import phealin.mod.entity.EntityPurporiumGolem;
import phealin.mod.entity.EntityWarthog;
import phealin.mod.models.ModelWarthog;

@SideOnly(Side.CLIENT)
public class RenderWarthog extends RenderLiving<EntityWarthog>
{
	private static final ResourceLocation WARTHOG_TEXTURES = new ResourceLocation("ftm:textures/entity/warthog.png");
	
	public RenderWarthog(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelWarthog(), 0.5F);
	}
	
	protected ResourceLocation getEntityTexture(EntityWarthog entity)
	{
		return WARTHOG_TEXTURES;
	}
	
	protected void applyRotations(EntityWarthog entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
