package iceCraft.blocks;

import java.util.logging.Level;

import iceCraft.fluid.Fluids;
import iceCraft.lib.LogHelper;
import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import iceCraft.tileentity.TileEntityRefrigerator;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	public static Block wetIce;
	public static Block mudBrickBlock;
	public static Block refrigerator;
	public static Block blockLiquidIce;

	public static void init() {
		wetIce = new WetIce(Ids.wetIce_actual);
		mudBrickBlock = new MudBrickBlock(Ids.mudBrickBlock_actual);
		refrigerator = new Refrigerator(Ids.refrigerator_actual);
		blockLiquidIce = new BlockLiquidIce(Ids.liquidIceBlock_actual);

		GameRegistry.registerBlock(wetIce, Names.wetIce_name);
		GameRegistry.registerBlock(refrigerator, Names.refrigerator_name);
		GameRegistry.registerBlock(mudBrickBlock, Names.mudBrickBlock_name);
		GameRegistry.registerBlock(blockLiquidIce, Names.liquidIce_name);
	}

	public static void registerTileEntities() {
		// To register a Tile Entity, you refer to the actual class file of the
		// Tile Entity and then give it a unique ID in the form of a string
		GameRegistry.registerTileEntity(TileEntityRefrigerator.class,
				"RefrigeratorIceC");
	}
	
	public static void registerFluidTextures() {
		Fluids.liquidIce.setIcons(blockLiquidIce.getBlockTextureFromSide(0), blockLiquidIce.getBlockTextureFromSide(1));
	}

	public static void addNames() {
		LanguageRegistry.addName(wetIce, Names.wetIce_name);
		LanguageRegistry.addName(mudBrickBlock, Names.mudBrickBlock_name);
		LanguageRegistry.addName(refrigerator, Names.refrigerator_name);
		LanguageRegistry.addName(blockLiquidIce, Names.liquidIce_name);
	}
}