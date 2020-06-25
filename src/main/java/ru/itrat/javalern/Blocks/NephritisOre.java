package ru.itrat.javalern.Blocks;

import Utils.Randomizer;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import ru.itrat.javalern.Items.ItemRegistrator;

public class NephritisOre extends Block{
	
public NephritisOre(String name, Material material) {
		
		super(material);
		
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(3.0F);
	    this.setResistance(15.0F);
	    this.setHarvestLevel("pickaxe", 3);
	    this.setRegistryName(name);
		this.setTranslationKey(name);
	}

	@Override
	public void getDrops(NonNullList<ItemStack> itemStacks, IBlockAccess access, BlockPos blockPos, IBlockState state, int p) {
		itemStacks.clear();
		itemStacks.add(new ItemStack(ItemRegistrator.NEPHRITIS, Randomizer.getRandomNumberInRange(1, 3), this.damageDropped(state)));
	}

}
