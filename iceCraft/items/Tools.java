package iceCraft.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class Tools {
	
	public static ItemTool icePick;
	
	public static void init() {
		icePick = new IcePick(Ids.icePick_actual, 4, IcePick.IcePickTool, 
				new Block[] {Block.ice});
	}
	
	public static void addNames() {
		LanguageRegistry.addName(icePick, Names.icePick_name);
	}
}
