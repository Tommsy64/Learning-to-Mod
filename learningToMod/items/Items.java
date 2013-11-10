package learningToMod.items;

import learningToMod.lib.config.Ids;
import learningToMod.lib.config.Names;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Items {	
	
	public static Item iceShard;
	
	public static void init() {
		iceShard = new IceShard(Ids.iceShard_actual);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(iceShard, Names.iceShard_name);
	}
}
