package ru.itrat.javalern.Items;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder("javalearn")
@Mod.EventBusSubscriber
public class ItemRegistrator {
	
	private final static Item.ToolMaterial nephritisMaterial = EnumHelper.addToolMaterial("nephritis_material",
            4, 2560, 14F, 11.0F, 30);

	
	@GameRegistry.ObjectHolder("nephritis")
    public static final Item NEPHRITIS = null;
	
	   @GameRegistry.ObjectHolder("obsidian_stick")
	    public static final Item OBSIDIAN_STICK = null;

	    @GameRegistry.ObjectHolder("nephritis_sword")
	    public static final Item NEPHRITIS_SWORD = null;

	    @GameRegistry.ObjectHolder("nephritis_pickaxe")
	    public static final Item NEPHRITIS_PICKAXE = null;

	    @GameRegistry.ObjectHolder("nephritis_axe")
	    public static final Item NEPHRITIS_AXE = null;

	    @GameRegistry.ObjectHolder("nephritis_hoe")
	    public static final Item NEPHRITIS_HOE = null;

	    @GameRegistry.ObjectHolder("nephritis_spade")
	    public static final Item NEPHRITIS_SPADE = null;
	
	@SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {
		 e.getRegistry().register(new ObsidianStick("obsidian_stick"));
	        e.getRegistry().register(new Nephritis("nephritis"));
	        e.getRegistry().register(new NephritisSword("nephritis_sword", nephritisMaterial));
	        e.getRegistry().register(new NephritisPickaxe("nephritis_pickaxe", nephritisMaterial));
	        e.getRegistry().register(new NephritisAxe("nephritis_axe", nephritisMaterial));
	        e.getRegistry().register(new NephritisHoe("nephritis_hoe", nephritisMaterial));
	        e.getRegistry().register(new NephritisSpade("nephritis_spade", nephritisMaterial));
	}
	
	 @SubscribeEvent
	 @SideOnly(Side.CLIENT)
	 public static void onRegistryModel(ModelRegistryEvent e) {
		 registryModel(OBSIDIAN_STICK);
	        registryModel(NEPHRITIS_SWORD);
	        registryModel(NEPHRITIS);
	        registryModel(NEPHRITIS_PICKAXE);
	        registryModel(NEPHRITIS_AXE);
	        registryModel(NEPHRITIS_HOE);
	        registryModel(NEPHRITIS_SPADE);
	 }
	 
	 @SideOnly(Side.CLIENT)
	 private static void registryModel(Item item) {
		 final ResourceLocation regName = item.getRegistryName();
	     final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
	     ModelBakery.registerItemVariants(item, mrl);
	     ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
	 }

}
