package phealin.mod.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import phealin.mod.entity.EntityVioliumGolem;
import phealin.mod.models.ModelVioliumGolem;
import phealin.mod.render.layers.LayerGolemFlower;

@SideOnly(Side.CLIENT)
public class RenderVioliumGolem extends RenderLiving<EntityVioliumGolem> 
{
	private static final ResourceLocation IRON_GOLEM_TEXTURES = new ResourceLocation("ftm:textures/entity/violium_golem.png");

	public RenderVioliumGolem(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelVioliumGolem(), 0.5F);
		//this.addLayer(new LayerGolemFlower(this));
	}
	
	protected ResourceLocation getEntityTexture(EntityVioliumGolem entity)
	{
		return IRON_GOLEM_TEXTURES;
	}
	
	protected void applyRotations(EntityVioliumGolem entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
		
		if ((double)entityLiving.limbSwingAmount >= 0.01D)
		{
			float f = 13.0F;
			float f1 = entityLiving.limbSwing - entityLiving.limbSwingAmount * (1.0F - partialTicks) + 6.0F;
			float f2 = (Math.abs(f1 % 13.0F - 6.5F) - 3.25F) / 3.25F;
			GlStateManager.rotate(6.5F * f2, 0.0F, 0.0F, 1.0F);
		}
	}
}
