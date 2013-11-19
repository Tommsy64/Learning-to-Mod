package iceCraft.lib.fuelHandler;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class IceCraftFuelHandler implements IFuelHandler {
	
	ArrayList<String> fuels = new ArrayList<String>();

	@Override
	public int getBurnTime(ItemStack fuel) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void addItem(ItemStack fuel, int burnTimeTicks) {
		
	}
	
	public static void addItem(int fuelId, int burnTimeTicks) {
		
	}
}
