package ru.itrat.javalern.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianStick extends Item {

    public ObsidianStick(String name){
        this.setRegistryName(name);
        this.setTranslationKey(name);
        this.setCreativeTab(CreativeTabs.MISC);
    }

}
