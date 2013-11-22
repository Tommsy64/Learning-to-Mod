package iceCraft.client;

import iceCraft.IceCraft;
import iceCraft.client.container.ContainerRefrigerator;
import iceCraft.client.gui.GuiRefrigerator;
import iceCraft.tileentity.TileEntityRefrigerator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

public class GuiHandler implements IGuiHandler {

	public GuiHandler() {
		// Each mod has its own GuiHandler
		NetworkRegistry.instance().registerGuiHandler(IceCraft.instance, this);
	}

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch (id) {
		case 0:
			if (entity != null && entity instanceof TileEntityRefrigerator)
				return new ContainerRefrigerator(player.inventory,
						(TileEntityRefrigerator) entity);
			else
				return null;
		default:
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getBlockTileEntity(x, y, z);

		switch (id) {
		case 0:
			if (entity != null && entity instanceof TileEntityRefrigerator)
				return new GuiRefrigerator(player.inventory,
						(TileEntityRefrigerator) entity);
			else
				return null;
		default:
			return null;
		}
	}
}