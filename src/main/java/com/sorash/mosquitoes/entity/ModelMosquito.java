package com.sorash.mosquitoes.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelMosquito extends ModelBase
{
	private ModelRenderer head;
	private ModelRenderer body1;
	private ModelRenderer body2;
	
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
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		head.render(f5);
		body1.render(f5);
		body2.render(f5);
	}
}