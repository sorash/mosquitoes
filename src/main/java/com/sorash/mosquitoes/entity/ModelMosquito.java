package com.sorash.mosquitoes.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
<<<<<<< HEAD
=======
import net.minecraft.entity.passive.EntityBat;
>>>>>>> 83aa26302ffb3005fabc2ceb2f42a7ddf431530c
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMosquito extends ModelBase
{
	private ModelRenderer head;
	private ModelRenderer body1;
	private ModelRenderer body2;
<<<<<<< HEAD
	
	public ModelMosquito()
	{
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this, 0, 0);
		head.addBox(0F, 0F, 0F, 4, 4, 4);
		head.setRotationPoint(-8F, 18F, -2F);
		head.setTextureSize(64, 64);
		head.mirror = true;
		body1 = new ModelRenderer(this, 0, 0);
		body1.addBox(0F, 0F, 0F, 5, 2, 2);
		body1.setRotationPoint(-5F, 18F, -1F);
		body1.setTextureSize(64, 64);
		body1.mirror = true;
		body2 = new ModelRenderer(this, 0, 0);
		body2.addBox(0F, 0F, 0F, 8, 2, 2);
		body2.setRotationPoint(-0.6F, 15.6F, -1F);
		body2.setTextureSize(64, 64);
		body2.mirror = true;
=======
	private ModelRenderer leftWing;
	private ModelRenderer rightWing;

	public ModelMosquito()
	{
		this.textureWidth = 64;
		this.textureHeight = 64;

		// head
		this.head = new ModelRenderer(this, 0, 0);
		this.head.addBox(-3.0F, -3.0F, -3.0F, 6, 6, 6);
		
		// body1
		this.body1 = new ModelRenderer(this, 0, 16);
		this.body1.addBox(-3.0F, 4.0F, -3.0F, 6, 12, 6);
		this.body1.setTextureOffset(0, 34).addBox(-5.0F, 16.0F, 0.0F, 10, 6, 1);
		
		// body2
		this.body2 = new ModelRenderer(this, 0, 16);
		this.body2.addBox(-3.0F, 4.0F, -3.0F, 6, 12, 6);
		this.body2.setTextureOffset(0, 34).addBox(-5.0F, 16.0F, 0.0F, 10, 6, 1);
		
		// wings
		this.rightWing = new ModelRenderer(this, 42, 0);
		this.rightWing.addBox(-12.0F, 1.0F, 1.5F, 10, 16, 1);
		this.leftWing = new ModelRenderer(this, 42, 0);
		this.leftWing.mirror = true;
		this.leftWing.addBox(2.0F, 1.0F, 1.5F, 10, 16, 1);
		this.body1.addChild(this.rightWing);
		this.body1.addChild(this.leftWing);		
>>>>>>> 83aa26302ffb3005fabc2ceb2f42a7ddf431530c
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body1.render(f5);
<<<<<<< HEAD
		body2.render(f5);
=======
	}

	public void setRotationAngles(float f1, float f2, float f3, float f4, float f5, float f6, Entity entityIn)
	{
		float f = (180F / (float)Math.PI);
        this.head.rotateAngleX = f5 / (180F / (float)Math.PI);
        this.head.rotateAngleY = f4 / (180F / (float)Math.PI);
        this.head.rotateAngleZ = 0.0F;
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        
        this.rightWing.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftWing.setRotationPoint(0.0F, 0.0F, 0.0F);
        
        this.body1.rotateAngleX = ((float)Math.PI / 4F) + MathHelper.cos(f3 * 0.1F) * 0.15F;
        this.body1.rotateAngleY = 0.0F;
        this.body2.rotateAngleX = ((float)Math.PI / 4F) - MathHelper.cos(f3 * 0.1F) * 0.15F;
        this.body2.rotateAngleY = 0.0F;
        
        this.rightWing.rotateAngleY = MathHelper.cos(f3 * 1.3F) * (float)Math.PI * 0.25F;
        this.leftWing.rotateAngleY = -this.rightWing.rotateAngleY;
>>>>>>> 83aa26302ffb3005fabc2ceb2f42a7ddf431530c
	}
}