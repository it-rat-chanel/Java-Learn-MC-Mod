package ru.itrat.javalern.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;


public class NephritisAxe extends ItemAxe {

    public NephritisAxe(String name, ToolMaterial toolMaterial){
        super(toolMaterial, 8, 8);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setMaxStackSize(1);
    }

}
