package iceCraft.items;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GenericFood extends ItemFood {

	protected int eatTime;
	protected String itemUnlocalizedName;

	public GenericFood(int id, String itemUnlocalizedName, int maxStackSize,
			int eatTime, int healAmount, float saturationModifier,
			boolean isWolfsFavoriteMeat, boolean isAlwaysEdible) {
		super(id, healAmount, saturationModifier, isWolfsFavoriteMeat);

		this.itemUnlocalizedName = itemUnlocalizedName;
		this.eatTime = eatTime;

		// The Food Tab needs to go first, otherwise it won't appear in the
		// IceCraftTab
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);

		this.setUnlocalizedName(this.itemUnlocalizedName);

		this.maxStackSize = maxStackSize;

		this.setPotionEffect(5, 120, 0, 0.5F);

		if (isAlwaysEdible)
			this.setAlwaysEdible();
	}

	@Override
	public int getMaxItemUseDuration(ItemStack itemStacj) {
		return this.eatTime;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ this.itemUnlocalizedName);
	}
}
