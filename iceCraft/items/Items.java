package iceCraft.items;

import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item iceShard;
	public static Item mud;

	// Foods
	public static ItemFood rawBacon;
	public static ItemFood bacon;

	public static void init() {
		iceShard = new IceShard(Ids.iceShard_actual);
		mud = new Mud(Ids.mud_actual);

		rawBacon = new GenericFood(Ids.rawBacon_actual,
				Names.rawBacon_unlocalizedName, 32, 64, 3, 0.2F, true, false);
		// 5 is the potion effect id of Strength
		// 120 is 2 minutes
		// 1 is the potion amplifier
		// Probability of effect acurring
		rawBacon.setPotionEffect(19, 8, 0, 0.6F);

		bacon = new GenericFood(Ids.bacon_actual, Names.bacon_unlocalizedName,
				16, 128, 7, 0.8F, true, true);
		// 19 is the potion effect id of Poison
		// 10 is 10 seconds
		// 0 is the potion amplifier
		// Probability of effect acurring
		bacon.setPotionEffect(5, 120, 0, 0.5F);
	}

	public static void addNames() {
		LanguageRegistry.addName(iceShard, Names.iceShard_name);
		LanguageRegistry.addName(mud, Names.mud_name);
		LanguageRegistry.addName(rawBacon, Names.rawBacon_name);
		LanguageRegistry.addName(bacon, Names.bacon_name);
	}
}
