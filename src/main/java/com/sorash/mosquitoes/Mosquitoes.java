package com.sorash.mosquitoes;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Resources.MODID, name = Resources.NAME, version = Resources.VERSION)
public class Mosquitoes 
{
	// proxy
	@SidedProxy(clientSide=Resources.CLIENTPROXY, serverSide=Resources.SERVERPROXY)
    public static CommonProxy proxy;
	
	// create an instance
	@Instance
    public static Mosquitoes instance = new Mosquitoes();
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.preInit(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	proxy.postInit(event);
    }
}
