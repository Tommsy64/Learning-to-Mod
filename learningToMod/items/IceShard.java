package learningToMod.items;

import learningToMod.lib.config.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IceShard extends Item {

	public IceShard(int id) {
		super(id);
		
		//Set creative tabs
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		
		//Set Unlocalized Name
		this.setUnlocalizedName(Names.iceShard_unlocalizedName);
	}
}
