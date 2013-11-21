package iceCraft.blocks;

import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Refrigerator extends Block {

	public Refrigerator(int id) {
		super(id, Material.iron);
		
		this.setUnlocalizedName(Names.refrigerator_unlocalizedName);
	}

}
