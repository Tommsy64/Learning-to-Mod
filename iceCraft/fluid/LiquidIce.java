package iceCraft.fluid;

import iceCraft.lib.config.Names;
import net.minecraftforge.fluids.Fluid;

public class LiquidIce extends Fluid {

	public LiquidIce() {
		super(Names.liquidIce_unlocalizedName);
		this.setDensity(1000); // How tick the fluid is, affects movement inside
								// the liquid.
		this.setViscosity(500);
		this.setTemperature(274); // Temperature in kelvin, completely arbitrary
	}

}
