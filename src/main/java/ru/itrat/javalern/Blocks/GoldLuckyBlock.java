package ru.itrat.javalern.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class GoldLuckyBlock extends LuckyBlock {

	public GoldLuckyBlock(String name, Material material) {
		super(name, material, loot);
	}
	
	private static final Item[] loot = new Item[] {
			Items.GOLD_INGOT,
			Items.GOLDEN_CARROT,
			Item.getItemFromBlock(Blocks.GOLD_BLOCK),
			Items.COAL
	};

}
