package iceCraft.fluid;

import iceCraft.blocks.Blocks;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class FluidTextureLoader {
	@ForgeSubscribe
	public void postStitch(TextureStitchEvent.Post event) {
		Blocks.registerFluidTextures();
	}
}
