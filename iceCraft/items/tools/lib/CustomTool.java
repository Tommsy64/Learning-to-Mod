package iceCraft.items.tools.lib;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomTool extends ItemTool {

	protected CustomTool(int id, float damageVsEntity,
			EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {
		super(id, damageVsEntity, toolMaterial, blocksEffectiveAgainst);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "tools/"
				+ this.getUnlocalizedName().replace("item.", ""));
	}
}
