package learningToMod.lib;

import cpw.mods.fml.common.registry.GameRegistry;
import learningToMod.items.Items;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Recipes {
	
	public static void init() { 
		CraftingManager.getInstance().addRecipe(new ItemStack(Block.ice, 1),
				"CCC",
				"CCC",
				"CCC",
				Character.valueOf('C'), Block.cobblestone);
		
		CraftingManager.getInstance().addShapelessRecipe(new ItemStack(Block.ice, 1), new ItemStack(Items.iceShard, 1),
				new ItemStack(Items.iceShard, 1), new ItemStack(Items.iceShard, 1), new ItemStack(Items.iceShard, 1));
		
		
		GameRegistry.addSmelting(Block.ice.blockID, new ItemStack(Block.waterStill), 0.1F);
	}
}
