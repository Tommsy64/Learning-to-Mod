package iceCraft;

import iceCraft.blocks.Blocks;
import iceCraft.items.Items;
import iceCraft.items.Tools;
import iceCraft.lib.IceCraftTab;
import iceCraft.lib.LogHelper;
import iceCraft.lib.ModInfo;
import iceCraft.lib.Recipes;
import iceCraft.lib.config.ConfigHandler;
import iceCraft.proxies.CommonProxy;
import iceCraft.sound.Sound;

import java.util.logging.Level;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod ( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true )

public class IceCraft {
	
	@SidedProxy( clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy")
	public static CommonProxy proxy;
	
	//Setting up the Creative Tabs
	public static CreativeTabs IceCraftTab = new IceCraftTab(CreativeTabs.getNextID(), ModInfo.NAME);
	
	@EventHandler 
	static void preInit(FMLPreInitializationEvent event) {
		
		//Start the logger
		LogHelper.init();
		
		LogHelper.log(Level.INFO, "Loading config");
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		LogHelper.log(Level.INFO, "Config loaded succesfuly");
		
		LogHelper.log(Level.INFO, "Preparing Renderers");
		proxy.initRenderers();
		LogHelper.log(Level.INFO, "Renderers loaded");
		
		LogHelper.log(Level.INFO, "Preparing Audio");
		proxy.initSounds();
		LogHelper.log(Level.INFO, "Loaded " + Sound.files.length + " audio files");
	}
	
	@EventHandler 
	static void init(FMLInitializationEvent event) {		
		//Fix the itemGroup in front of creative tab name
		LogHelper.log(Level.INFO, "Setting up language files");
		LanguageRegistry.instance().addStringLocalization("itemGroup." + ModInfo.NAME, "en_US", ModInfo.NAME);
		LogHelper.log(Level.INFO, "Language files loaded");
		
		LogHelper.log(Level.INFO, "Preparing items");
		Items.init();
		Items.addNames();
		LogHelper.log(Level.INFO, "Items loaded");
		
		LogHelper.log(Level.INFO, "Preparing blocks");
		Blocks.init();
		Blocks.addNames();
		LogHelper.log(Level.INFO, "Blocks loaded");
		
		LogHelper.log(Level.INFO, "Preparing tools");
		Tools.init();
		Tools.addNames();
		LogHelper.log(Level.INFO, "Tools loaded");
				
		LogHelper.log(Level.INFO, "Preparing recipes");
		Recipes.init();
		LogHelper.log(Level.INFO, "Recipes loaded");
	}
	
	@EventHandler 
	static void postInit(FMLPostInitializationEvent event) {
		
	}

}
