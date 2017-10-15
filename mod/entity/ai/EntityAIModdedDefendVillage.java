package phealin.mod.entity.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.village.Village;
import phealin.mod.entity.EntityPurporiumGolem;

public class EntityAIModdedDefendVillage extends EntityAIBase 
{

	 EntityPurporiumGolem irongolem;
    /** The aggressor of the iron golem's village which is now the golem's attack target. */
    EntityLivingBase villageAgressorTarget;
	private Object taskOwner;

    public EntityAIModdedDefendVillage(EntityPurporiumGolem ironGolemIn)
    {
        super();
        this.irongolem = ironGolemIn;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        Village village = this.irongolem.getVillage();

        if (village == null)
        {
            return false;
        }
        else
        {
            this.villageAgressorTarget = village.findNearestVillageAggressor(this.irongolem);

            if (this.villageAgressorTarget instanceof EntityCreeper)
            {
                return false;
            }
            else if (this.isSuitableTarget(this.villageAgressorTarget, false))
            {
                return true;
            }
            else if (((EntityLivingBase) this.taskOwner).getRNG().nextInt(20) == 0)
            {
                this.villageAgressorTarget = village.getNearestTargetPlayer(this.irongolem);
                return this.isSuitableTarget(this.villageAgressorTarget, false);
            }
            else
            {
                return false;
            }
        }
    }

    private boolean isSuitableTarget(EntityLivingBase villageAgressorTarget2, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.irongolem.setAttackTarget(this.villageAgressorTarget);
        super.startExecuting();
    }
} 
