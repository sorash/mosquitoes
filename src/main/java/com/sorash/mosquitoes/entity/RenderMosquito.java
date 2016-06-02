package com.sorash.mosquitoes.entity;

import com.sorash.mosquitoes.main.Resources;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMosquito extends RenderLiving<EntityMosquito>
{
	private static final ResourceLocation mosquitoTextures = new ResourceLocation(Resources.MODID + ":textures/entity/ModelMosquito.png");

	public RenderMosquito(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelMosquito(), 0.1F);	// shadow size 0.1F, keep the same as scale down value
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
		GlStateManager.scale(0.1F, 0.1F, 0.1F);	// scale model down
												// 0.1F, 0.1F, 0.1F seems good
												// keep shadow size the same
		GlStateManager.translate(0.0F, -1.0F, 0.0F);	// needed or it falls through the floor??
	}

	protected void rotateCorpse(EntityMosquito mosquito, float f1, float f2, float partialTicks)
	{
		GlStateManager.translate(0.0F, -0.1F, 0.0F);
		super.rotateCorpse(mosquito, f1, f2, partialTicks);
	}
}