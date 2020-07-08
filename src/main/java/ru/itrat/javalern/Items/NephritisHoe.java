package ru.itrat.javalern.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class NephritisHoe extends ItemHoe {

    public NephritisHoe(String name, ToolMaterial toolMaterial){
        super(toolMaterial);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CreativeTabs.TOOLS);
        this.setMaxStackSize(1);
    }

}
