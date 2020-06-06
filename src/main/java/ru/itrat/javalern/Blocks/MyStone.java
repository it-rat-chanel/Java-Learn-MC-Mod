package ru.itrat.javalern.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class MyStone extends Block{

	public MyStone(String name, Material material) {
		
		super(material);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS); //Вкладка в креативе
		this.setHardness(2.0F); // прочность_блока К примеру 3.0F как у руд
	    this.setResistance(15.0F); // взрывоустойчивость_блока К примеру 15.0F как у руд
	    this.setHarvestLevel("pickaxe", 1); //К примеру pickaxe и 0 как деревянная кирка
	    this.setRegistryName(name); //Используется для подключения моделей и в команде /give
		this.setTranslationKey(name);
	}
}
