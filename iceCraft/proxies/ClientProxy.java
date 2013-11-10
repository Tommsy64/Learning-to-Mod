package iceCraft.proxies;

import iceCraft.lib.LogHelper;
import iceCraft.sound.Sound;
import iceCraft.sound.SoundHandler;

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
