package learningToMod.lib;

import learningToMod.items.Items;
import net.minecraft.creativetab.CreativeTabs;

public class LearningToModTab extends CreativeTabs {

	public LearningToModTab(int id, String name) {
		super(id, name);
	}
	
	@Override
	//This int is the id of the block that we want as the icon of the tab
	public int getTabIconItemIndex() {
		return Items.iceShard.itemID;
	}
}
