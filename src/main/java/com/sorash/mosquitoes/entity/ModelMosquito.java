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
	ModelRenderer leg1part1;
	ModelRenderer leg1part2;
	ModelRenderer leg2part1;
	ModelRenderer leg2part2;
	ModelRenderer leg3part1;
	ModelRenderer leg3part2;

	public ModelMosquito()
	{
		textureWidth = 64;
		textureHeight = 32;

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
		sting.setTextureSize(64, 32);
		sting.mirror = true;
		setRotation(sting, -0.4363323F, 0F, 0F);
		leg1part1 = new ModelRenderer(this, 0, 0);
		leg1part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg1part1.setRotationPoint(2F, 12.5F, -5.5F);
		leg1part1.setTextureSize(64, 32);
		leg1part1.mirror = true;
		setRotation(leg1part1, 0F, 0F, -0.7853982F);
		leg1part2 = new ModelRenderer(this, 0, 0);
		leg1part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg1part2.setRotationPoint(5F, 9.5F, -5.5F);
		leg1part2.setTextureSize(64, 32);
		setRotation(leg1part2, 0F, 0F, 0.7853982F);
		leg1part2.mirror = false;
		leg2part1 = new ModelRenderer(this, 0, 0);
		leg2part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg2part1.setRotationPoint(2F, 11F, -4F);
		leg2part1.setTextureSize(64, 32);
		setRotation(leg2part1, 0F, 0F, -0.7853982F);
		leg2part2 = new ModelRenderer(this, 0, 0);
		leg2part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg2part2.setRotationPoint(5F, 8F, -4F);
		leg2part2.setTextureSize(64, 32);
		setRotation(leg2part2, 0F, 0F, 0.7853982F);
		leg3part1 = new ModelRenderer(this, 0, 0);
		leg3part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg3part1.setRotationPoint(2F, 10F, -2.5F);
		leg3part1.setTextureSize(64, 32);
		setRotation(leg3part1, 0F, 0F, -0.7853982F);
		leg3part2 = new ModelRenderer(this, 0, 0);
		leg3part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg3part2.setRotationPoint(5F, 7F, -2.5F);
		leg3part2.setTextureSize(64, 32);
		setRotation(leg3part2, 0F, 0F, 0.7853982F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body1.render(f5);
		body2.render(f5);
		sting.render(f5);
		leg1part1.render(f5);
		leg1part2.render(f5);
		leg2part1.render(f5);
		leg2part2.render(f5);
		leg3part1.render(f5);
		leg3part2.render(f5);
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