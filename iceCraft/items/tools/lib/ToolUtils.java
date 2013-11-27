package iceCraft.items.tools.lib;

import iceCraft.lib.LogHelper;

import java.util.logging.Level;

public final class ToolUtils {

	public static boolean isMobLava(String mob) {

		// WTF?! I can't use Strings in a switch statement?!
		/*
		 * switch() { case "PigZombie": break; case "MagmaCube": break; default:
		 * break; }
		 */

		LogHelper.log(Level.INFO, mob);
		
		if (mob == "PigZombie") {
			return true;
		} else if (mob == "Magma Cube") {
			return true;
		} else if (mob == "Blaze") {
			return true;
		}
		return false;
	}
}
