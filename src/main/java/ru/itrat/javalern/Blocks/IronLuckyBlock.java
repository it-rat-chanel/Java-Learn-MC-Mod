package ru.itrat.javalern.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class IronLuckyBlock extends LuckyBlock {

	public IronLuckyBlock(String name, Material material) {
		super(name, material, loot);
	}
	
	private static final Item[] loot = new Item[] {
			Items.IRON_INGOT,
			Items.IRON_DOOR,
			Item.getItemFromBlock(Blocks.IRON_BLOCK),
	};

}
