package iceCraft.proxies;

import iceCraft.event.EventHandler;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
	public void initRenderers() {

	}

	public void initSounds() {

	}

	public void initEventHandlers() {
		MinecraftForge.EVENT_BUS.register(new EventHandler());
	}
}
