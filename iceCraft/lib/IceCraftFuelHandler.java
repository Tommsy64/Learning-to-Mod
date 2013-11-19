package iceCraft.lib;

import java.util.Dictionary;
import java.util.TreeMap;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class IceCraftFuelHandler implements IFuelHandler {
	
	private static Dictionary<String, Integer> fuels;

	@Override
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void addItem(ItemStack fuel, int burnTimeTicks) {
		fuels.put(arg0, arg1)
	}
	
	public static void addItem(int fuelId, int burnTimeTicks) {
		
	}
}
