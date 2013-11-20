package iceCraft.items;

import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Items {	
	
	public static Item iceShard;
	public static Item mud;
	
	public static void init() {
		iceShard = new IceShard(Ids.iceShard_actual);
		mud = new Mud(Ids.mud_actual);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(iceShard, Names.iceShard_name);
		LanguageRegistry.addName(mud, Names.mud_name);
	}
}
