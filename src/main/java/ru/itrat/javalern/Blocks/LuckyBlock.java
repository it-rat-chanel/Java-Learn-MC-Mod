package ru.itrat.javalern.Blocks;

import Utils.Randomizer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class LuckyBlock extends Block{

	public LuckyBlock(String name, Material material, Item[] loots) {
		
		super(material);
		this.loots = loots;
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS); //Вкладка в креативе
		this.setHardness(3.0F); // прочность_блока К примеру 3.0F как у руд
	    this.setResistance(15.0F); // взрывоустойчивость_блока К примеру 15.0F как у руд
	    this.setHarvestLevel("pickaxe", 2); //К примеру pickaxe и 0 как деревянная кирка
	    this.setRegistryName(name); //Используется для подключения моделей и в команде /give
		this.setTranslationKey(name);
	}
	
	private Item[] loots;
	
	@Override
	public void getDrops(NonNullList<ItemStack> itemStacks, IBlockAccess access, BlockPos blockPos, IBlockState state, int p) {
		itemStacks.clear();
		for(Item item : getItemsDropped(Randomizer.getRandomNumberInRange(0, 10))) {
			itemStacks.add(new ItemStack(item, 1, this.damageDropped(state)));
		}
		
	}
	
	private Item[] getItemsDropped(int count) {
		Item item = loots[Randomizer.getRandomNumberInRange(0, loots.length - 1)];
		Item[] items = new Item[count];
		for(int i = 0; i < count;i++) {
			items[i] = item;
		}
		return items;
	}
}
