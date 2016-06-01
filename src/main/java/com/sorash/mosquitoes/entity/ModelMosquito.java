package com.sorash.mosquitoes.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMosquito extends ModelBase
{
	//fields
	ModelRenderer head;
	ModelRenderer body1;
	ModelRenderer body2;
	ModelRenderer sting;

	public ModelMosquito()
	{
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(0F, 0F, 0F, 4, 4, 4);
		head.setRotationPoint(-2F, 11F, -11F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0.5235988F, 0F, 0F);
		body1 = new ModelRenderer(this, 0, 0);
		body1.addBox(0F, 0F, 0F, 6, 6, 8);
		body1.setRotationPoint(-3F, 8.5F, -8.5F);
		body1.setTextureSize(64, 32);
		body1.mirror = true;
		setRotation(body1, 0.5235988F, 0F, 0F);
		body2 = new ModelRenderer(this, 0, 0);
		body2.addBox(0F, -1F, 1F, 6, 6, 15);
		body2.setRotationPoint(-3F, 4.7F, -3F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, -0.6632251F, 0F, 0F);
		sting = new ModelRenderer(this, 0, 0);
		sting.addBox(0F, 0F, 0F, 2, 7, 2);
		sting.setRotationPoint(-1F, 11.26667F, -10F);
		sting.setTextureSize(64, 64);
		sting.mirror = true;
		setRotation(sting, -0.4363323F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body1.render(f5);
		body2.render(f5);
		sting.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}
}