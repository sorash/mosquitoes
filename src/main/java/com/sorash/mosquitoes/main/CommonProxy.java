package com.sorash.mosquitoes.main;

import com.sorash.mosquitoes.entity.EntityMosquito;
import com.sorash.mosquitoes.entity.RenderMosquito;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
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

    	// add spawn
        // 3 numbers are as follows:
    	// probability, min spawn count, max spawn count
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.plains);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.beach);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.deepOcean);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.desert);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.forest);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.jungle);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.swampland);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.river);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.roofedForest);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.ocean);
    	EntityRegistry.addSpawn(EntityMosquito.class, 300, 10, 20, EnumCreatureType.MONSTER, BiomeGenBase.jungleEdge);
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
