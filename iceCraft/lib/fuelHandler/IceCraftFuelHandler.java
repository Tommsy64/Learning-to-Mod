package iceCraft.lib.fuelHandler;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class IceCraftFuelHandler implements IFuelHandler {
	
	private static ArrayList<FuelType> fuels = new ArrayList<FuelType>();

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		for (FuelType arrayFuel : fuels) {
			if (arrayFuel.getItemId() == fuel.itemID) {
				return arrayFuel.getBurnTime();
			}
		}
		
		return 0;
	}
	
	public static void addItem(ItemStack fuel, int burnTimeTicks) {		
		addItem(fuel.itemID, burnTimeTicks);
	}
	
	public static void addItem(int fuelId, int burnTimeTicks) {
		FuelType fuelType = new FuelType(fuelId, burnTimeTicks);		
		fuels.add(fuelType);
	}
}
