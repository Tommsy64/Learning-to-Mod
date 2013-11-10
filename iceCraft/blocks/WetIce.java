package iceCraft.blocks;

import iceCraft.IceCraft;
import net.minecraft.block.Block;
import net.minecraft.block.StepSound;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class WetIce extends Block {

	public WetIce(int id) {
		super(id, Material.ice);
		
		
		this.setHardness(0.5F);		
		this.setLightOpacity(3);
		this.slipperiness = 1.05F;
		
		StepSound soundWetIceFootstep = new StepSound("stone", 1.0F, 1.0F);
		
		this.setStepSound(Block.soundSnowFootstep);
		
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(IceCraft.IceCraftTab);
	}
}
