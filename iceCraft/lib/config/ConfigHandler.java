package iceCraft.lib.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler { 
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		//Items are shifted 256, so we subtract 256 to compensate
		Ids.iceShard_actual = config.getItem(Names.iceShard_name, Ids.iceShard_default).getInt() - 256;
		
		Ids.icePick_actual = config.getItem(Names.icePick_name, Ids.icePick_default).getInt() - 256;
		
		Ids.wetIce_actual = config.getItem(Names.wetIce_name, Ids.wetIce_default).getInt() - 256;
		
		config.save();
	}
}