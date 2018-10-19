package com.helloworld.helloworld;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.helloworld.proxy.CommonProxy;

@Mod(modid = HelloWorld.MODID, name = HelloWorld.MODNAME, version = HelloWorld.MODVERSION, useMetadata = true)
public class HelloWorld {

    public static final String MODID = "helloworld";
    public static final String MODNAME = "Hello World";
    public static final String MODVERSION= "0.0.1";

    @SidedProxy(clientSide = "com.helloworld.proxy.ClientProxy", serverSide = "com.helloworld.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static HelloWorld instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
    	// some hello world action
        logger.info("HELLO WORLD!");
    	proxy.postInit(e);
    }
}
