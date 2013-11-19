package iceCraft.lib;

import iceCraft.items.Items;
import iceCraft.lib.fuelHandler.IceCraftFuelHandler;
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
		
		//Smelting
		GameRegistry.addSmelting(Block.ice.blockID, new ItemStack(Block.waterStill), 0.1F);
		GameRegistry.addSmelting(Item.bucketWater.itemID, new ItemStack(Item.bucketEmpty), 0.1F);

		//Initiate the FuelHandler
		GameRegistry.registerFuelHandler(new IceCraftFuelHandler());
		
		//Add the fuels
		
		IceCraftFuelHandler.addItem(Item.sign.itemID, 500);
	}
}
