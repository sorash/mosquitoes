package com.sorash.mosquitoes.main;

import com.sorash.mosquitoes.entity.EntityMosquito;
import com.sorash.mosquitoes.entity.ModelMosquito;
import com.sorash.mosquitoes.entity.RenderMosquito;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class CommonProxy 
{
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	// create the mosquito entity
    	EntityRegistry.registerModEntity(EntityMosquito.class, "mosquito", 0, Mosquitoes.instance, 32, 32, false);
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	RenderingRegistry.registerEntityRenderingHandler(EntityMosquito.class, new RenderMosquito(Minecraft.getMinecraft().getRenderManager()));
    }
}
