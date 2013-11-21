package iceCraft.blocks;

import iceCraft.lib.config.Ids;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;


public class Blocks {
	
	public static Block wetIce;
	public static Block mudBricks;
	
	public static void init() { 
		wetIce = new WetIce(Ids.wetIce_actual);
		mudBricks = new MudBrickBlock(Ids.mudBrickBlock_actual);
		GameRegistry.registerBlock(wetIce, Names.wetIce_name);
		GameRegistry.registerBlock(mudBricks, Names.mudBricks_name);
	}
	
	public static void addNames() { 
		LanguageRegistry.addName(wetIce, Names.wetIce_name);
		LanguageRegistry.addName(mudBricks, Names.mudBricks_name);
	}
}