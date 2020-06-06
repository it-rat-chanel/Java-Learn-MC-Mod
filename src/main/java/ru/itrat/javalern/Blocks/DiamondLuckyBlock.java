package ru.itrat.javalern.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class DiamondLuckyBlock extends LuckyBlock {

	public DiamondLuckyBlock(String name, Material material) {
		super(name, material, loot);
	}
	
	private static final Item[] loot = new Item[] {
			Items.DIAMOND,
			Items.DIAMOND_HORSE_ARMOR,
			Item.getItemFromBlock(Blocks.OBSIDIAN),
			Item.getItemFromBlock(Blocks.DIAMOND_BLOCK),
	};

}
