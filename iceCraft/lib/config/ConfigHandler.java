package iceCraft.lib.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);

		// Categories
		final String BOOLEANS = config.CATEGORY_GENERAL
				+ config.CATEGORY_SPLITTER + "booleans";

		config.load();

		// Items are shifted 256, so we subtract 256 to compensate

		// Items
		Ids.iceShard_actual = config.getItem(config.CATEGORY_ITEM,
				Names.iceShard_name, Ids.iceShard_default).getInt() - 256;

		Ids.icePick_actual = config.getItem(config.CATEGORY_ITEM,
				Names.icePick_name, Ids.icePick_default).getInt() - 256;
		
		Ids.mud_actual = config.getItem(config.CATEGORY_ITEM, Names.mud_name,
				Ids.mud_default).getInt() - 256;
		
		Ids.mudBrick_actual = config.getItem(config.CATEGORY_ITEM, Names.mudBrick_name,
				Ids.mudBrick_actual).getInt() - 256;
		
		Ids.bacon_actual = config.getItem(config.CATEGORY_ITEM, Names.bacon_name,
				Ids.bacon_default).getInt() - 256;
		
		Ids.rawBacon_actual = config.getItem(config.CATEGORY_ITEM, Names.rawBacon_name,
				Ids.rawBacon_default).getInt() - 256;

		// Blocks
		Ids.wetIce_actual = config.getItem(config.CATEGORY_BLOCK,
				Names.wetIce_name, Ids.wetIce_default).getInt() - 256;
		
		Ids.mudBrickBlock_actual = config.getItem(config.CATEGORY_BLOCK,
				Names.mudBrickBlock_name, Ids.mudBrickBlock_default).getInt() - 256;

		// Booleans
		ConfigBooleans.enableBurnables = config.get(BOOLEANS,
				ConfigBooleans.enableBurnables_name,
				ConfigBooleans.enableBurnables_default).getBoolean(
				ConfigBooleans.enableBurnables_default);

		// Save the config
		config.save();
	}
}