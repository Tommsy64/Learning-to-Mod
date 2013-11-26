package iceCraft.items.tools.lib;

import iceCraft.IceCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSpade;

public class CustomSpade extends ItemSpade {

	protected CustomSpade(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
	}

}
