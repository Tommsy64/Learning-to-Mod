package iceCraft.lib;

import iceCraft.blocks.Blocks;
import iceCraft.items.Items;
import iceCraft.lib.config.ConfigBooleans;
import iceCraft.lib.fuelHandler.IceCraftFuelHandler;

import java.util.logging.Level;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init() { 
		
		//Craft
		CraftingManager.getInstance().addRecipe(new ItemStack(Block.ice, 1),
				"SSS",
				"SSS",
				"SSS",
				Character.valueOf('S'), Items.iceShard);
		
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Block.ice, 1), new ItemStack(Items.iceShard, 1),
				new ItemStack(Items.iceShard, 1), new ItemStack(Items.iceShard, 1), new ItemStack(Items.iceShard, 1));
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Items.mud, 4), new ItemStack(Block.dirt, 1), new ItemStack(Item.bucketWater));
		
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Items.mud, 1), new ItemStack(Block.dirt, 1), new ItemStack(Item.bucketWater, 1));
		
		//Smelting
		GameRegistry.addSmelting(Block.ice.blockID, new ItemStack(Block.waterStill), 0.1F);
		GameRegistry.addSmelting(Item.bucketWater.itemID, new ItemStack(Item.bucketEmpty), 0.1F);

		//Initiate the FuelHandler
		GameRegistry.registerFuelHandler(new IceCraftFuelHandler());
		
		//Add the fuels
		if (ConfigBooleans.enableBurnables) {
			IceCraftFuelHandler.addItem(Item.sign.itemID, 250);
			IceCraftFuelHandler.addItem(Item.bowlEmpty.itemID, 150);
			IceCraftFuelHandler.addItem(Item.boat.itemID, 240);
			IceCraftFuelHandler.addItem(Item.map.itemID, 200);
			IceCraftFuelHandler.addItem(Item.emptyMap.itemID, 200);
			IceCraftFuelHandler.addItem(Item.doorWood.itemID, 600);
			IceCraftFuelHandler.addItem(Item.painting.itemID, 100);
			IceCraftFuelHandler.addItem(Item.paper.itemID, 125);
			IceCraftFuelHandler.addItem(Item.book.itemID, 400);
			IceCraftFuelHandler.addItem(Item.bed.itemID, 250);
			IceCraftFuelHandler.addItem(Item.blazePowder.itemID, 1200);
			IceCraftFuelHandler.addItem(Item.map.itemID, 200);
			LogHelper.log(Level.INFO, "Enabled More Burnables");
		}
	}
}
