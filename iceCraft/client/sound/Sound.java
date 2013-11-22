package iceCraft.client.sound;

import iceCraft.lib.ModInfo;

public class Sound {
	public static final String SOUND_RESOURCE_LOCATION = ModInfo.ID + ":";
	public static final String SOUND_PREFIX = ModInfo.ID + ":";

	public static String[] files = { "snow_walk1.ogg"};/*, "snow_walk2.ogg",
			"snow_walk3.ogg", "snow_walk4.ogg", "snow_walk5.ogg",
			"snow_walk6.ogg", "snow_walk7.ogg", "snow_walk8.ogg",
			"snow_walk9.ogg", "snow_walk10.ogg", "snow_walk11.ogg", };*/

	public static final String CustomSound = SOUND_PREFIX + "snow_walk1";

	public static int init() {
		int i = 0;
		while (i < files.length) {
			files[i] = SOUND_RESOURCE_LOCATION + files[i];
			i++;
		}
		return i;
	}
}
