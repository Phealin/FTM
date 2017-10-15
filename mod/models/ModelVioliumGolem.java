package phealin.mod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelIronGolem - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelVioliumGolem extends ModelBase {
    public ModelRenderer ironGolemLeftArm;
    public ModelRenderer ironGolemRightLeg;
    public ModelRenderer ironGolemRightArm;
    public ModelRenderer ironGolemLeftLeg;
    public ModelRenderer ironGolemBody0;
    public ModelRenderer ironGolemBody1;
    public ModelRenderer ironGolemHead0;
    public ModelRenderer ironGolemHead1;

    public ModelVioliumGolem() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.ironGolemBody0 = new ModelRenderer(this, 0, 40);
        this.ironGolemBody0.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.ironGolemBody0.addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F);
        this.ironGolemHead0 = new ModelRenderer(this, 0, 0);
        this.ironGolemHead0.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.ironGolemHead0.addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, 0.0F);
        this.ironGolemLeftLeg = new ModelRenderer(this, 37, 0);
        this.ironGolemLeftLeg.setRotationPoint(-4.0F, 11.0F, 0.0F);
        this.ironGolemLeftLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.ironGolemLeftArm = new ModelRenderer(this, 60, 58);
        this.ironGolemLeftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.ironGolemLeftArm.addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.ironGolemHead1 = new ModelRenderer(this, 24, 0);
        this.ironGolemHead1.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.ironGolemHead1.addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, 0.0F);
        this.ironGolemRightLeg = new ModelRenderer(this, 60, 0);
        this.ironGolemRightLeg.mirror = true;
        this.ironGolemRightLeg.setRotationPoint(5.0F, 11.0F, 0.0F);
        this.ironGolemRightLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F);
        this.ironGolemRightArm = new ModelRenderer(this, 60, 21);
        this.ironGolemRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.ironGolemRightArm.addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, 0.0F);
        this.ironGolemBody1 = new ModelRenderer(this, 0, 70);
        this.ironGolemBody1.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.ironGolemBody1.addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.ironGolemBody0.render(f5);
        this.ironGolemHead0.render(f5);
        this.ironGolemLeftLeg.render(f5);
        this.ironGolemLeftArm.render(f5);
        this.ironGolemHead1.render(f5);
        this.ironGolemRightLeg.render(f5);
        this.ironGolemRightArm.render(f5);
        this.ironGolemBody1.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
