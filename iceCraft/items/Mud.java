package iceCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Mud extends Item {

	public Mud(int id) {
		super(id);

		//Setup the Creative tabs
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);

		//Set the unlocalized name
		this.setUnlocalizedName(Names.mud_unlocalizedName);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.mud_unlocalizedName);
	}
}
