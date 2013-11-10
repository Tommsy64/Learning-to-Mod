package iceCraft.blocks;

import iceCraft.IceCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class WetIce extends Block {

	public WetIce(int id) {
		super(id, Material.ice);
		
		
		this.setHardness(0.5F);		
		this.setLightOpacity(3);
		this.slipperiness = 2F;
		
		this.setStepSound(Block.soundGlassFootstep);
		
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}
