package iceCraft.blocks;

import iceCraft.fluid.Fluids;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LiquidIceBlock extends BlockFluidClassic {

	public LiquidIceBlock(int id) {
		super(id, Fluids.liquidIce, Material.water);
		Fluids.liquidIce.setBlockID(id);
		this.setUnlocalizedName(Names.liquidIce_unlocalizedName + "Block");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return Block.waterMoving.getIcon(side, meta);
	}

	@Override
	public int colorMultiplier(IBlockAccess iblockaccess, int x, int y, int z) {
		return 0x00CCFF; // HEX color code as indicated by the 0x infront. This
							// is a light blue color.
	}
}
