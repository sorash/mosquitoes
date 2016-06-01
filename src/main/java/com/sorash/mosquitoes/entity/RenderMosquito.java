package com.sorash.mosquitoes.entity;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMosquito extends RenderLiving<EntityMosquito>
{
	private static final ResourceLocation mosquitoTextures = new ResourceLocation("textures/entity/mosquito.png");

	public RenderMosquito(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMosquito(), 0.15F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityMosquito entity)
	{
		return mosquitoTextures;
	}

	/**
	 * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	 * entityLiving, partialTickTime
	 */
	protected void preRenderCallback(EntityMosquito entitylivingbaseIn, float partialTickTime)
	{
<<<<<<< HEAD
		GlStateManager.scale(0.15F, 0.15F, 0.15F);
		GlStateManager.translate(0.0F, -2.0F, 0.0F);
=======
		GlStateManager.scale(0.45F, 0.45F, 0.45F);	// scale model down
													// 0.15F, 0.15F, 0.15F seems good
		GlStateManager.translate(0.0F, -2.0F, 0.0F);	// needed or it falls through the floor??
>>>>>>> 83aa26302ffb3005fabc2ceb2f42a7ddf431530c
	}

	protected void rotateCorpse(EntityMosquito mosquito, float p_77043_2_, float p_77043_3_, float partialTicks)
	{
		GlStateManager.translate(0.0F, -0.1F, 0.0F);
		super.rotateCorpse(mosquito, p_77043_2_, p_77043_3_, partialTicks);
	}
}