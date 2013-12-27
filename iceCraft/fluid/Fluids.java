package iceCraft.fluid;

import iceCraft.lib.config.Names;
import net.minecraftforge.fluids.FluidRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Fluids {

	public static LiquidIce liquidIce;

	public static void init() {
		liquidIce = new LiquidIce();
		FluidRegistry.registerFluid(liquidIce);
	}
}
