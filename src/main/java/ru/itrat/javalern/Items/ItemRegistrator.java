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


@GameRegistry.ObjectHolder("javalearn")
@Mod.EventBusSubscriber
public class ItemRegistrator {
	
	@GameRegistry.ObjectHolder("nephritis")
    public static final Item NEPHRITIS = null;
	
	@SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {
		e.getRegistry().register(new Nephritis("nephritis"));
	}
	
	 @SubscribeEvent
	 @SideOnly(Side.CLIENT)
	 public static void onRegistryModel(ModelRegistryEvent e) {
		 registryModel(NEPHRITIS);
	 }
	 
	 @SideOnly(Side.CLIENT)
	 private static void registryModel(Item item) {
		 final ResourceLocation regName = item.getRegistryName();
	     final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
	     ModelBakery.registerItemVariants(item, mrl);
	     ModelLoader.setCustomModelResourceLocation(item, 0, mrl);
	 }

}
