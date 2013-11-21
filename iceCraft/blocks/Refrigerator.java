package iceCraft.blocks;

import iceCraft.IceCraft;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Refrigerator extends Block {

	public Refrigerator(int id) {
		super(id, Material.iron);
		
		this.setUnlocalizedName(Names.refrigerator_unlocalizedName);
		
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);
		
		this.setHardness(5F);
		this.setResistance(10F);
		
	}

}