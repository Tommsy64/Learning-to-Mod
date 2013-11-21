package iceCraft.blocks;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MudBricks extends Block {
	
	public MudBricks(int id) {
		super(id, Material.rock);
		
		this.setHardness(2.0F);
		this.setUnlocalizedName(Names.mudBricks_unlocalizedName);
		
		this.setStepSound(Block.soundStoneFootstep);
		
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
					+ Names.mudBricks_unlocalizedName + "_top");
			sideAndBottomIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
					+ Names.mudBricks_unlocalizedName);
		}
		
	
}