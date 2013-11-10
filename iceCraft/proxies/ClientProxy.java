package iceCraft.proxies;

import iceCraft.sound.Sound;
import iceCraft.sound.SoundHandler;
import net.minecraftforge.common.MinecraftForge;



public class ClientProxy extends CommonProxy {
	@Override
	public void initRenderers() {
		
	}
	
	@Override
	public void initSounds() {
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
}
