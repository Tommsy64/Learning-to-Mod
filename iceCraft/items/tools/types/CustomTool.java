package iceCraft.items.tools.types;

import iceCraft.IceCraft;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;

public class CustomTool extends ItemTool {

	protected CustomTool(int id, float damageVsEntity,
			EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {
		super(id, damageVsEntity, toolMaterial, blocksEffectiveAgainst);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setMaxStackSize(1);
	}

}
