package com.sorash.mosquitoes.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelMosquito extends ModelBase
{
	// parts
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
	ModelRenderer leg4part1;
	ModelRenderer leg4part2;
	ModelRenderer leg5part1;
	ModelRenderer leg5part2;
	ModelRenderer leg6part1;
	ModelRenderer leg6part2;

	public ModelMosquito()
	{
		// texture size
		textureWidth = 128;
		textureHeight = 128;

		// head
		head = new ModelRenderer(this, 0, 0);
		head.addBox(0F, 0F, 0F, 3, 3, 5);
		head.setRotationPoint(-2F, 12F, -11F);
		head.setTextureSize(128, 128);
		head.mirror = true;
		setRotation(head, 0.5235988F, 0F, 0F);
		
		// body1
		body1 = new ModelRenderer(this, 17, 0);
		body1.addBox(0F, 0F, 0F, 5, 5, 8);
		body1.setRotationPoint(-3F, 9.5F, -8.5F);
		body1.setTextureSize(64, 32);
		body1.mirror = true;
		setRotation(body1, 0.5235988F, 0F, 0F);
		
		// body2
		body2 = new ModelRenderer(this, 46, 0);
		body2.addBox(0F, -1F, 1F, 3, 2, 15);
		body2.setRotationPoint(-2F, 5.7F, -3F);
		body2.setTextureSize(64, 32);
		body2.mirror = true;
		setRotation(body2, -0.6632251F, 0F, 0F);
		
		// sting
		sting = new ModelRenderer(this, 0, 23);
		sting.addBox(0F, 0F, 0F, 1, 5, 1);
		sting.setRotationPoint(-1F, 13F, -10F);
		sting.setTextureSize(64, 32);
		sting.mirror = true;
		setRotation(sting, -0.4363323F, 0F, 0F);
		
		// leg1
		leg1part1 = new ModelRenderer(this, 10, 30);
		leg1part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg1part1.setRotationPoint(1F, 12F, -5.5F);
		leg1part1.setTextureSize(64, 32);
		leg1part1.mirror = true;
		setRotation(leg1part1, 0F, 0F, -0.7853982F);
		leg1part2 = new ModelRenderer(this, 22, 30);
		leg1part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg1part2.setRotationPoint(4F, 9F, -5.5F);
		leg1part2.setTextureSize(64, 32);
		leg1part2.mirror = true;
		setRotation(leg1part2, 0F, 0F, 0.7853982F);
		
		// leg2
		leg2part1 = new ModelRenderer(this, 10, 30);
		leg2part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg2part1.setRotationPoint(1F, 11F, -4F);
		leg2part1.setTextureSize(64, 32);
		leg2part1.mirror = true;
		setRotation(leg2part1, 0F, 0F, -0.7853982F);
		leg2part2 = new ModelRenderer(this, 22, 30);
		leg2part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg2part2.setRotationPoint(4F, 8F, -4F);
		leg2part2.setTextureSize(64, 32);
		leg2part2.mirror = true;
		setRotation(leg2part2, 0F, 0F, 0.7853982F);
		
		// leg3
		leg3part1 = new ModelRenderer(this, 10, 30);
		leg3part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg3part1.setRotationPoint(1F, 10F, -2.5F);
		leg3part1.setTextureSize(64, 32);
		leg3part1.mirror = true;
		setRotation(leg3part1, 0F, 0F, -0.7853982F);
		leg3part2 = new ModelRenderer(this, 22, 30);
		leg3part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg3part2.setRotationPoint(4F, 7F, -2.5F);
		leg3part2.setTextureSize(64, 32);
		leg3part2.mirror = true;
		setRotation(leg3part2, 0F, 0F, 0.7853982F);
		
		// leg4
		leg4part1 = new ModelRenderer(this, 10, 26);
		leg4part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg4part1.setRotationPoint(-2.8F, 13F, -5.5F);
		leg4part1.setTextureSize(64, 32);
		leg4part1.mirror = true;
		setRotation(leg4part1, 0F, 0F, -2.356194F);
		leg4part2 = new ModelRenderer(this, 22, 26);
		leg4part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg4part2.setRotationPoint(-4.3F, 10F, -5.5F);
		leg4part2.setTextureSize(64, 32);
		leg4part2.mirror = true;
		setRotation(leg4part2, 0F, 0F, 2.356194F);
		
		// leg5
		leg5part1 = new ModelRenderer(this, 10, 26);
		leg5part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg5part1.setRotationPoint(-2.8F, 12F, -4F);
		leg5part1.setTextureSize(64, 32);
		leg5part1.mirror = true;
		setRotation(leg5part1, 0F, 0F, -2.356194F);
		leg5part2 = new ModelRenderer(this, 22, 26);
		leg5part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg5part2.setRotationPoint(-4.3F, 9F, -4F);
		leg5part2.setTextureSize(64, 32);
		leg5part2.mirror = true;
		setRotation(leg5part2, 0F, 0F, 2.356194F);
		
		// leg6
		leg6part1 = new ModelRenderer(this, 10, 26);
		leg6part1.addBox(0F, 0F, 0F, 4, 1, 1);
		leg6part1.setRotationPoint(-2.8F, 11F, -2.5F);
		leg6part1.setTextureSize(64, 32);
		leg6part1.mirror = true;
		setRotation(leg6part1, 0F, 0F, -2.356194F);
		leg6part2 = new ModelRenderer(this, 22, 26);
		leg6part2.addBox(0F, 0F, 0F, 10, 1, 1);
		leg6part2.setRotationPoint(-4.3F, 8F, -2.5F);
		leg6part2.setTextureSize(64, 32);
		leg6part2.mirror = true;
		setRotation(leg6part2, 0F, 0F, 2.356194F);
	}

	// render parts
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float scale)
	{
		super.render(entity, f, f1, f2, f3, f4, scale);
		setRotationAngles(f, f1, f2, f3, f4, scale, entity);
		head.render(scale);
		body1.render(scale);
		body2.render(scale);
		sting.render(scale);
		leg1part1.render(scale);
		leg1part2.render(scale);
		leg2part1.render(scale);
		leg2part2.render(scale);
		leg3part1.render(scale);
		leg3part2.render(scale);
		leg4part1.render(scale);
		leg4part2.render(scale);
		leg5part1.render(scale);
		leg5part2.render(scale);
		leg6part1.render(scale);
		leg6part2.render(scale);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);

		// (PI / float) changes the rotation start angle
		// addition or subtraction changes the start position of rotation
		// cos(par3 * float) changes the speed of rotation
		// last float changes the degree of rotation
		leg1part2.rotateAngleZ = ((float)Math.PI / 4F) + MathHelper.cos(par3 * 0.1F) * 0.1F;
		leg2part2.rotateAngleZ = ((float)Math.PI / 4F) + MathHelper.cos(par3 * 0.1F) * 0.1F;
		leg3part2.rotateAngleZ = ((float)Math.PI / 4F) + MathHelper.cos(par3 * 0.1F) * 0.1F;

		leg4part2.rotateAngleZ = ((float)Math.PI / 1.35F) - MathHelper.cos(par3 * 0.1F) * 0.1F;
		leg5part2.rotateAngleZ = ((float)Math.PI / 1.35F) - MathHelper.cos(par3 * 0.1F) * 0.1F;
		leg6part2.rotateAngleZ = ((float)Math.PI / 1.35F) - MathHelper.cos(par3 * 0.1F) * 0.1F;

		// rotate front and back rather than up and down
		// leg4part2.rotateAngleY = ((float)Math.PI / 25F) + MathHelper.cos(par3 * 0.1F) * 0.15F;

		// set rotation on sting
		sting.rotateAngleX = ((float)Math.PI * 1.9F) + MathHelper.cos(par3 * 0.075F) * 0.1F;
	}
}