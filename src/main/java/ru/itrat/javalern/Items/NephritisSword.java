package ru.itrat.javalern.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class NephritisSword extends ItemSword {

    public NephritisSword(String name, ToolMaterial toolMaterial){
        super(toolMaterial);
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CreativeTabs.COMBAT);
        this.setMaxStackSize(1);
    }

}
