package learningToMod.lib;

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
	}
}
