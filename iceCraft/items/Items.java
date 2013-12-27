package iceCraft.items;

import iceCraft.items.consumables.GenericFood;
import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {

	public static Item iceShard;
	public static Item mud;
	public static Item mudBrick;
	public static Item liquidIceBucket;

	// Foods
	public static ItemFood rawBacon;
	public static ItemFood bacon;

	public static void init() {
		iceShard = new IceShard(Ids.iceShard_actual);
		mud = new Mud(Ids.mud_actual);
		mudBrick = new MudBrick(Ids.mudBrick_actual);
		liquidIceBucket = new LiquidIceBucket(Ids.liquidIceBucket_actual,
				Ids.liquidIce_actual);

		rawBacon = new GenericFood(Ids.rawBacon_actual,
				Names.rawBacon_unlocalizedName, 32, 64, 3, 0.2F, true, false);
		// 60% chance for Poison 1 for 8 seconds
		rawBacon.setPotionEffect(19, 8, 0, 0.6F);

		bacon = new GenericFood(Ids.bacon_actual, Names.bacon_unlocalizedName,
				16, 128, 7, 0.8F, true, true);
		// 50% chance for Strength 1 for 2 minutes
		bacon.setPotionEffect(5, 120, 0, 0.5F);
	}

	public static void addNames() {
		LanguageRegistry.addName(iceShard, Names.iceShard_name);
		LanguageRegistry.addName(mud, Names.mud_name);
		LanguageRegistry.addName(rawBacon, Names.rawBacon_name);
		LanguageRegistry.addName(bacon, Names.bacon_name);
		LanguageRegistry.addName(mudBrick, Names.mudBrick_name);
		LanguageRegistry.addName(liquidIceBucket, Names.liquidIceBucket_name);
	}
}
