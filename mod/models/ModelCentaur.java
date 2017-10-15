package phealin.mod.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelHorse - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelCentaur extends ModelBase {
    public ModelRenderer tailBase;
    public ModelRenderer frontLeftHoof;
    public ModelRenderer tailMiddle;
    public ModelRenderer backRightShin;
    public ModelRenderer body;
    public ModelRenderer frontRightLeg;
    public ModelRenderer backLeftShin;
    public ModelRenderer backLeftLeg;
    public ModelRenderer frontRightHoof;
    public ModelRenderer backLeftHoof;
    public ModelRenderer backRightLeg;
    public ModelRenderer backRightHoof;
    public ModelRenderer frontLeftLeg;
    public ModelRenderer tailTip;
    public ModelRenderer frontRightShin;
    public ModelRenderer frontLeftShin;
    public ModelRenderer villagerBody1;
    public ModelRenderer villagerHead;
    public ModelRenderer villagerArms0;
    public ModelRenderer villagerArms0_1;
    public ModelRenderer villagerArms2;
    public ModelRenderer villagerBody0;
    public ModelRenderer villagerHeadChild;

    public ModelCentaur() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.frontRightLeg = new ModelRenderer(this, 60, 29);
        this.frontRightLeg.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.frontRightLeg.addBox(-1.100000023841858F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.backRightHoof = new ModelRenderer(this, 96, 51);
        this.backRightHoof.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightHoof.addBox(-1.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 2.384185791015625E-7F);
        this.villagerArms0 = new ModelRenderer(this, 0, 116);
        this.villagerArms0.setRotationPoint(-8.0F, -9.0F, -8.0F);
        this.villagerArms0.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerArms0, -0.7330382858376184F, 0.0F, 0.0F);
        this.body = new ModelRenderer(this, 0, 34);
        this.body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.villagerBody0 = new ModelRenderer(this, 30, 90);
        this.villagerBody0.setRotationPoint(-4.0F, -9.5F, -9.5F);
        this.villagerBody0.addBox(0.0F, 0.0F, 0.0F, 8, 12, 6, 0.0F);
        this.villagerHeadChild = new ModelRenderer(this, 24, 68);
        this.villagerHeadChild.setRotationPoint(4.0F, 7.0F, 4.0F);
        this.villagerHeadChild.addBox(-1.0F, -1.0F, -6.0F, 2, 4, 2, 0.0F);
        this.frontLeftHoof = new ModelRenderer(this, 44, 51);
        this.frontLeftHoof.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftHoof.addBox(-2.4000000953674316F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 2.384185791015625E-7F);
        this.backLeftLeg = new ModelRenderer(this, 78, 29);
        this.backLeftLeg.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.backLeftLeg.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.frontRightShin = new ModelRenderer(this, 60, 41);
        this.frontRightShin.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightShin.addBox(-1.100000023841858F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.tailBase = new ModelRenderer(this, 44, 0);
        this.tailBase.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailBase.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(tailBase, -1.3089969158172607F, 0.0F, 0.0F);
        this.frontRightHoof = new ModelRenderer(this, 60, 51);
        this.frontRightHoof.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.frontRightHoof.addBox(-1.600000023841858F, 5.099999904632568F, -2.0999999046325684F, 4, 3, 4, 2.384185791015625E-7F);
        this.tailTip = new ModelRenderer(this, 24, 3);
        this.tailTip.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailTip.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tailTip, -1.570796251296997F, 0.0F, 0.0F);
        this.backLeftHoof = new ModelRenderer(this, 78, 51);
        this.backLeftHoof.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftHoof.addBox(-2.5F, 5.099999904632568F, -2.0F, 4, 3, 4, 2.384185791015625E-7F);
        this.villagerHead = new ModelRenderer(this, 0, 68);
        this.villagerHead.setRotationPoint(-4.0F, -20.0F, -10.5F);
        this.villagerHead.addBox(0.0F, 0.0F, 0.0F, 8, 10, 8, 0.0F);
        this.villagerArms2 = new ModelRenderer(this, 40, 120);
        this.villagerArms2.setRotationPoint(-4.0F, -6.0F, -11.0F);
        this.villagerArms2.addBox(0.0F, 0.0F, 0.0F, 8, 4, 4, 0.0F);
        this.setRotateAngle(villagerArms2, -0.7330382858376184F, 0.0F, 0.0F);
        this.backLeftShin = new ModelRenderer(this, 78, 43);
        this.backLeftShin.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.backLeftShin.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.villagerBody1 = new ModelRenderer(this, 0, 90);
        this.villagerBody1.setRotationPoint(-4.0F, -9.5F, -9.5F);
        this.villagerBody1.addBox(0.0F, 0.0F, 0.0F, 8, 12, 6, 0.5F);
        this.backRightShin = new ModelRenderer(this, 96, 43);
        this.backRightShin.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.backRightShin.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.backRightLeg = new ModelRenderer(this, 96, 29);
        this.backRightLeg.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.backRightLeg.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.frontLeftLeg = new ModelRenderer(this, 44, 29);
        this.frontLeftLeg.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.frontLeftLeg.addBox(-1.899999976158142F, -1.0F, -2.0999999046325684F, 3, 8, 4, 0.0F);
        this.frontLeftShin = new ModelRenderer(this, 44, 41);
        this.frontLeftShin.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.frontLeftShin.addBox(-1.899999976158142F, 0.0F, -1.600000023841858F, 3, 5, 3, 0.0F);
        this.tailMiddle = new ModelRenderer(this, 38, 7);
        this.tailMiddle.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.tailMiddle.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(tailMiddle, -1.3089969158172607F, 0.0F, 0.0F);
        this.villagerArms0_1 = new ModelRenderer(this, 20, 116);
        this.villagerArms0_1.setRotationPoint(4.0F, -9.0F, -8.0F);
        this.villagerArms0_1.addBox(0.0F, 0.0F, 0.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(villagerArms0_1, -0.7330382858376184F, 0.0F, 0.0F);
        this.villagerHead.addChild(this.villagerHeadChild);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.frontRightLeg.render(f5);
        this.backRightHoof.render(f5);
        this.villagerArms0.render(f5);
        this.body.render(f5);
        this.villagerBody0.render(f5);
        this.frontLeftHoof.render(f5);
        this.backLeftLeg.render(f5);
        this.frontRightShin.render(f5);
        this.tailBase.render(f5);
        this.frontRightHoof.render(f5);
        this.tailTip.render(f5);
        this.backLeftHoof.render(f5);
        this.villagerHead.render(f5);
        this.villagerArms2.render(f5);
        this.backLeftShin.render(f5);
        this.villagerBody1.render(f5);
        this.backRightShin.render(f5);
        this.backRightLeg.render(f5);
        this.frontLeftLeg.render(f5);
        this.frontLeftShin.render(f5);
        this.tailMiddle.render(f5);
        this.villagerArms0_1.render(f5);
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
