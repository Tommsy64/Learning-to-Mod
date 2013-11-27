package iceCraft.items.tools.lib;

public final class ToolUtils {

	public static boolean isMobLava(String mob) {
		if (mob == "PigZombie") {
			return true;
		} else if (mob == "LavaSlime") {
			return true;
		} else if (mob == "Blaze") {
			return true;
		}
		return false;
	}
}
