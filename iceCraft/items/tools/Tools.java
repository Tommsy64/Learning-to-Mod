package iceCraft.items.tools;

import iceCraft.items.tools.types.CustomToolTypes;
import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Tools {

	// Tools
	public static ItemTool icePick;
	public static ItemSword iceSword;

	public static void init() {
		icePick = new IcePick(Ids.icePick_actual, 4,
				CustomToolTypes.IcePickTool, new Block[] { Block.ice });
		
		iceSword = new IceSword(Ids.iceSword_actual, CustomToolTypes.Ice);
	}

	public static void addNames() {
		LanguageRegistry.addName(icePick, Names.icePick_name);
		LanguageRegistry.addName(iceSword, Names.iceSword_name);
	}
}
