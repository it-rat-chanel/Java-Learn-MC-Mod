package ru.itrat.javalern;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import ru.itrat.javalern.Blocks.BlockRegistrator;
import ru.itrat.javalern.World.WorldGenerator;

@Mod(modid = "javalearn", name = "IT RAT - Java learn", version = "0.0.1")
public class JavaLearnMod {
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	    BlockRegistrator.registerBlocks();
	    GameRegistry.registerWorldGenerator(new WorldGenerator(), 3);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	   BlockRegistrator.registerBlocksRender();
	}


	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
