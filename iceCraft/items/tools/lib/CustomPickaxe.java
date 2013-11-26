package iceCraft.items.tools.lib;

import iceCraft.IceCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {

	protected CustomPickaxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
	}

}
