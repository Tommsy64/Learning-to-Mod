package iceCraft.items;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Bacon extends Item {

	public Bacon(int id) {
		super(id);
		// TODO Auto-generated constructor stub
		
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setCreativeTab(CreativeTabs.tabFood);
		
		this.setUnlocalizedName(Names.bacon_unlocalizedName);
		
	}
		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister icon) {
			itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
					+ Names.bacon_unlocalizedName);
		}
}
