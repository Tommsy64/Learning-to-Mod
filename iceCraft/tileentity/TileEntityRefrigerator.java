package iceCraft.tileentity;

import iceCraft.lib.config.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;

public class TileEntityRefrigerator extends TileEntity implements IInventory {

	private ItemStack[] inventory;

	public TileEntityRefrigerator() {
		inventory = new ItemStack[1];
	}

	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return inventory[slot];
	}

	@Override
	public ItemStack decrStackSize(int slot, int count) {
		ItemStack itemstack = getStackInSlot(slot);

		// Check to see if the player picked up an ItemStack
		if (itemstack != null) {
			// If ItemStack that the player picked up is less than the amount
			// the player wants to pick put, pick up all of it
			if (itemstack.stackSize <= count) {
				setInventorySlotContents(slot, null);
			} else {
				itemstack = itemstack.splitStack(count);

				// Alert the server of inventory change
				onInventoryChanged();
			}
		}
		return itemstack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slot) {
		ItemStack itemstack = getStackInSlot(slot);
		setInventorySlotContents(slot, null);
		return itemstack;
	}

	@Override
	public void setInventorySlotContents(int slot, ItemStack itemstack) {
		inventory[slot] = itemstack;

		// Make sure that there is room left for blocks in the slot
		if (itemstack != null && itemstack.stackSize > getInventoryStackLimit()) {

		}

		// Notify the server of the change
		onInventoryChanged();
	}

	@Override
	public String getInvName() {
		return Names.refrigerator_tileEntity;
	}

	/*
	 * This used to determine whether or not to translate the name of the Tile
	 * Entity into the player's language. If you return false, the name of the
	 * Tile Entity will be translated. If you return true, the name will be used
	 * regardless of the player's language:
	 */
	@Override
	public boolean isInvNameLocalized() {
		return true;
	}

	@Override
	public int getInventoryStackLimit() {
		// If this is higher than 64 it will be cut down to 64
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// Pythagorean theorem is actually useful in life!!!!!
		return player
				.getDistanceSq(xCoord + 0.5D, yCoord + 0.5D, zCoord + 0.5D) <= 64;
	}

	@Override
	public void openChest() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeChest() {
		// TODO Auto-generated method stub

	}

	@Override
	// Return true to allow any item to be placed in slot
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

}
