package iceCraft.items.tools;

import iceCraft.items.tools.lib.CustomToolTypes;
import iceCraft.items.tools.types.ice.IceAxe;
import iceCraft.items.tools.types.ice.IcePickaxe;
import iceCraft.items.tools.types.ice.IceSpade;
import iceCraft.items.tools.types.ice.IceSword;
import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Tools {

	// Tools
	public static ItemTool icePick;

	// Ice set
	public static IceSword iceSword;
	public static IcePickaxe icePickaxe;
	public static IceAxe iceAxe;
	public static ItemSpade iceSpade;

	public static void init() {
		icePick = new IcePick(Ids.icePick_actual, 4,
				CustomToolTypes.IcePickTool, new Block[] { Block.ice });

		iceSword = new IceSword(Ids.iceSword_actual, CustomToolTypes.Ice);
		icePickaxe = new IcePickaxe(Ids.icePickaxe_actual, CustomToolTypes.Ice);
		iceAxe = new IceAxe(Ids.iceAxe_actual, CustomToolTypes.Ice);
		iceSpade = new IceSpade(Ids.iceSpade_actual, CustomToolTypes.Ice);
	}

	public static void addNames() {

		// Ice tool set
		LanguageRegistry.addName(iceSword, Names.iceSword_name);
		LanguageRegistry.addName(icePickaxe, Names.icePickaxe_name);
		LanguageRegistry.addName(iceAxe, Names.iceAxe_name);
		LanguageRegistry.addName(iceSpade, Names.iceSpade_name);

		LanguageRegistry.addName(icePick, Names.icePick_name);
	}
}
