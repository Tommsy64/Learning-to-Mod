package iceCraft.fluid;

import iceCraft.blocks.Blocks;
import iceCraft.items.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;

public class Fluids {

	public static LiquidIce liquidIce;

	public static void init() {
		liquidIce = new LiquidIce();

		FluidRegistry.registerFluid(liquidIce);
	}

	public static void initBucketHandler() {
		BucketHandler.INSTANCE.buckets.put(Blocks.liquidIceBlock,
				Items.liquidIceBucket);
		MinecraftForge.EVENT_BUS.register(BucketHandler.INSTANCE);
	}
}
