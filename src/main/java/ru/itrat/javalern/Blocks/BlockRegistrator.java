package ru.itrat.javalern.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockRegistrator {
	
	private static Block myStone = new MyStone("my_stone", Material.ROCK);
	private static Block goldLuckyBlock = new GoldLuckyBlock("gold_lucky_block", Material.IRON);
	private static Block ironLuckyBlock = new IronLuckyBlock("iron_lucky_block", Material.IRON);
	private static Block diamondLuckyBlock = new DiamondLuckyBlock("diamond_lucky_block", Material.IRON);
	
	 public static void registerBlocks() {

	        setRegister(myStone);
	        setRegister(goldLuckyBlock);
	        setRegister(diamondLuckyBlock);
	        setRegister(ironLuckyBlock);

	    }

	    @SideOnly(Side.CLIENT)
	    public static void registerBlocksRender() {

	        setRender(myStone);
	        setRender(goldLuckyBlock);
	        setRender(diamondLuckyBlock);
	        setRender(ironLuckyBlock);

	    }

	    private static void setRegister(Block block) {

	        ForgeRegistries.BLOCKS.register(block);
	        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));

	    }

	    @SideOnly(Side.CLIENT)
	    private static void setRender(Block block) {

	        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block),
	                0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	    }
	

}
