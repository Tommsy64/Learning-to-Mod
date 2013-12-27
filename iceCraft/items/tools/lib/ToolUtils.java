package iceCraft.items.tools.lib;

public final class ToolUtils {

	public static boolean isMobLava(String mob) {

		// WTH?! I can't use Strings in a switch statement?!
		/*
		 * switch() { case "PigZombie": break; case "MagmaCube": break; default:
		 * break; }
		 */

		if (mob.compareToIgnoreCase("PigZombie") == 0) {
			return true;
		} else if (mob.compareToIgnoreCase("Magma Cube") == 0) {
			return true;
		} else if (mob.compareToIgnoreCase("Blaze") == 0) {
			return true;
		}
		return false;
	}
}
