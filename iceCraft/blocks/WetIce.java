package iceCraft.blocks;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WetIce extends Block {

	public WetIce(int id) {
		super(id, Material.ice);

		this.setHardness(0.5F);
		this.setLightOpacity(3);
		this.slipperiness = 1.05F;
		this.setUnlocalizedName(Names.wetIce_unlocalizedName);

		StepSound soundWetIceFootstep = new StepSound("stone", 1.0F, 1.0F);

		this.setStepSound(Block.soundSnowFootstep);

		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(IceCraft.IceCraftTab);
	}

	
	//Icons
	@SideOnly(Side.CLIENT)
	public static Icon topIcon;

	@SideOnly(Side.CLIENT)
	public static Icon sideAndBottomIcon;

	//Get Icons
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.wetIce_unlocalizedName + "_top");
		sideAndBottomIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.wetIce_unlocalizedName);
	}

	//Return Icons
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata) {
		if (side == 1) {
			return topIcon;
		} else {
			return sideAndBottomIcon;
		}
	}
}
