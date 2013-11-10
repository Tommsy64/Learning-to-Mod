package learningToMod.lib;

import learningToMod.items.Items;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class Recipes {
	
	public static void init() { 
		CraftingManager.getInstance().addRecipe(new ItemStack(Block.ice, 1),
				"",
				"SS",
				"SS",
				Character.valueOf('S'), Items.iceShard);
	}
}
