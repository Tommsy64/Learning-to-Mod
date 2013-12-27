package iceCraft.proxies;

import iceCraft.client.sound.Sound;
import iceCraft.client.sound.SoundHandler;
import iceCraft.lib.LogHelper;
import iceCraft.tileentity.TileEntityRefrigerator;
import iceCraft.tileentity.TileEntityRefrigeratorRenderer;

import java.util.logging.Level;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
	@Override
	public void initRenderers() {
		ClientRegistry.bindTileEntitySpecialRenderer(
				TileEntityRefrigerator.class,
				new TileEntityRefrigeratorRenderer());
	}

	@Override
	public void initSounds() {
		LogHelper.log(Level.INFO, "Added " + Sound.init() + " sound prefixes");
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
}
