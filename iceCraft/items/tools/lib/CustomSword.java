package iceCraft.items.tools.lib;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {

	protected CustomSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "tools/"
				+ this.getUnlocalizedName());
	}
}
