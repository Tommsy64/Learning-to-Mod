package iceCraft.items.tools.lib;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomHoe extends ItemHoe {

	protected CustomHoe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setCreativeTab(IceCraft.IceCraftTab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + "tools/"
				+ this.getUnlocalizedName().replace("item.", ""));
	}
}
