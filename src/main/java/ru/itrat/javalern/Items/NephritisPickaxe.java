package ru.itrat.javalern.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class NephritisPickaxe extends ItemPickaxe {
	
	  public NephritisPickaxe(String name, ToolMaterial toolMaterial){
	        super(toolMaterial);
	        this.setRegistryName(name);
	        this.setTranslationKey(name);
	        this.setCreativeTab(CreativeTabs.TOOLS);
	        this.setMaxStackSize(1);
	    }
	  
}
