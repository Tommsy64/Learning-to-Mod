package iceCraft.client.container;

import iceCraft.tileentity.TileEntityRefrigerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerRefrigerator extends Container {

	private TileEntityRefrigerator refrigerator;

	public ContainerRefrigerator(InventoryPlayer invPlayer,
			TileEntityRefrigerator entity) {
		this.refrigerator = entity;

	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return refrigerator.isUseableByPlayer(player);
	}
}
