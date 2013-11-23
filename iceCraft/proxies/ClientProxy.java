package iceCraft.proxies;

import iceCraft.client.sound.Sound;
import iceCraft.client.sound.SoundHandler;
import iceCraft.lib.LogHelper;

import java.util.logging.Level;

import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy {
	@Override
	public void initRenderers() {
		
	}
	
	@Override
	public void initSounds() {
		LogHelper.log(Level.INFO, "Added " + Sound.init() + " sound prefixes");
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
}
