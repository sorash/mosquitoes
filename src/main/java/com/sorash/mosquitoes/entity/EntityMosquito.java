package com.sorash.mosquitoes.entity;

import com.sorash.mosquitoes.main.Resources;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntityMosquito extends EntityCreature 
{
	public EntityMosquito(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.15F, 0.15F);
	}
	
    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.1F;
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return Resources.MODID + ":sounds/mosquito.buzz";
    }
    
    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    public boolean canBePushed()
    {
        return false;
    }
    protected void collideWithEntity(Entity entity)
    {
    }

    protected void collideWithNearbyEntities()
    {
    }
    
    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }
    
    public void fall(float distance, float damageMultiplier)
    {
    }
    
    protected void updateFallState(double y, boolean onGroundIn, Block blockIn, BlockPos pos)
    {
    }

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }
    
    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource source, float amount)
    {
    	// guarantee a one hit kill
        return super.attackEntityFrom(source, 10F);
    }
    
    public float getEyeHeight()
    {
        return this.height / 2.0F;
    }
    
    /**
     * Will return how many at most can spawn in a chunk at once.
     */
    public int getMaxSpawnedInChunk()
    {
        return 20;
    }
}
