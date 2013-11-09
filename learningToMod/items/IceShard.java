package learningToMod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IceShard extends Item {

	public IceShard(int id) {
		super(id);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabMisc);
	}

}
