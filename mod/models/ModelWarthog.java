package phealin.mod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPig - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelWarthog extends ModelBase {
    public ModelRenderer head0;
    public ModelRenderer head1;
    public ModelRenderer leg1;
    public ModelRenderer leg4;
    public ModelRenderer leg2;
    public ModelRenderer leg3;
    public ModelRenderer body;
    public ModelRenderer tusk1;
    public ModelRenderer tusk3;
    public ModelRenderer tusk2;
    public ModelRenderer tusk4;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;
    
    public ModelWarthog() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.setRotationPoint(-3.0F, 18.0F, -5.0F);
        this.leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.setRotationPoint(3.0F, 18.0F, 7.0F);
        this.leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.tusk2 = new ModelRenderer(this, 0, 0);
        this.tusk2.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.tusk2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.tusk4 = new ModelRenderer(this, 0, 0);
        this.tusk4.setRotationPoint(1.0F, 0.0F, -1.0F);
        this.tusk4.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
        this.head0 = new ModelRenderer(this, 0, 0);
        this.head0.setRotationPoint(0.0F, 12.0F, -6.0F);
        this.head0.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.body = new ModelRenderer(this, 28, 8);
        this.body.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.body.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, 0.0F);
        this.setRotateAngle(body, 1.5707963705062866F, 0.0F, 0.0F);
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.setRotationPoint(-3.0F, 18.0F, 7.0F);
        this.leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.tusk1 = new ModelRenderer(this, 0, 0);
        this.tusk1.setRotationPoint(1.5F, 1.9F, -8.5F);
        this.tusk1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.head1 = new ModelRenderer(this, 16, 16);
        this.head1.setRotationPoint(0.0F, 12.0F, -6.0F);
        this.head1.addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, 0.0F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.setRotationPoint(3.0F, 18.0F, -5.0F);
        this.leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.tusk3 = new ModelRenderer(this, 0, 0);
        this.tusk3.setRotationPoint(-1.5F, 2.9F, -8.5F);
        this.tusk3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(tusk3, 0.005235987755982988F, 0.0F, 3.141592653589793F);
        this.tusk1.addChild(this.tusk2);
        this.tusk3.addChild(this.tusk4);
        this.head1.addChild(this.tusk1);
        this.head1.addChild(this.tusk3);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
    	this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);

        if (this.isChild)
        {
            float f = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0F, this.childZOffset * scale, this.childZOffset * scale);
            this.head0.render(scale);
            this.head1.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            this.body.render(scale);
            this.leg1.render(scale);
            this.leg2.render(scale);
            this.leg3.render(scale);
            this.leg4.render(scale);
            GlStateManager.popMatrix();
        }
        else
        {
            this.head0.render(scale);
            this.head1.render(scale);
            this.body.render(scale);
            this.leg1.render(scale);
            this.leg2.render(scale);
            this.leg3.render(scale);
            this.leg4.render(scale);
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {    	
        this.head0.rotateAngleX = headPitch * 0.017453292F;
        this.head0.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head1.rotateAngleX = headPitch * 0.017453292F;
        this.head1.rotateAngleY = netHeadYaw * 0.017453292F;
        //this.tusk1.rotateAngleX = headPitch * 0.017453292F;
        //this.tusk1.rotateAngleY = netHeadYaw * 0.017453292F;
        //this.tusk3.rotateAngleX = headPitch * 0.017453292F;
        //this.tusk3.rotateAngleY = netHeadYaw * 0.017453292F;
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.leg4.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    }
}
