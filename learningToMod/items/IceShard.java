package learningToMod.items;

import learningToMod.LearningToMod;
import learningToMod.lib.ModInfo;
import learningToMod.lib.config.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IceShard extends Item {

	public IceShard(int id) {
		super(id);
		
		//Set creative tabs
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(LearningToMod.LearningToModTab);
		
		//Set Unlocalized Name
		this.setUnlocalizedName(Names.iceShard_unlocalizedName);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.iceShard_unlocalizedName);
	}
}
