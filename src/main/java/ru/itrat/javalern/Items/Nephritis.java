package ru.itrat.javalern.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Nephritis extends Item {
	
	public Nephritis(String name){
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CreativeTabs.MATERIALS);
    }

}
