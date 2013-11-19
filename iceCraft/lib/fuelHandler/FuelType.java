package iceCraft.lib.fuelHandler;

public class FuelType {
	
	private int itemId;
	private int burnTime;
	
	public void fuelType(int itemId, int burnTime) {
		this.itemId = itemId;
		this.burnTime = burnTime;
	}
	
	public int getItemId() {
		return this.itemId;
	}
	
	public int getBurnTime() {
		return this.burnTime;
	}
}
