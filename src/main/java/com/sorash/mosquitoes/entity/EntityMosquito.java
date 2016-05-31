package com.sorash.mosquitoes.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class EntityMosquito extends EntityCreature 
{
	public EntityMosquito(World worldIn) 
	{
		super(worldIn);
		this.setSize(0.175F, 0.175F);
	}
}
