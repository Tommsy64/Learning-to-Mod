package iceCraft.items.tools;

import iceCraft.items.tools.types.CustomTool;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IcePick extends CustomTool {

	protected IcePick(int id, float damageVsEntity,
			EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {
		super(id, damageVsEntity, toolMaterial, blocksEffectiveAgainst);
		this.setUnlocalizedName(Names.icePick_unlocalizedName);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.icePick_unlocalizedName);
	}

	public boolean hitEntity(ItemStack stack,
			EntityLivingBase par2EntityLivingBase,
			EntityLivingBase par3EntityLivingBase) {
		stack.damageItem(10, par3EntityLivingBase);
		return true;
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, int par3,
			int x, int y, int z, EntityLivingBase entityLivingBase) {

		if (world.getBlockId(x, y, z) == Block.ice.blockID) {
			return true;
		}

		if ((double) Block.blocksList[par3].getBlockHardness(world, x, y, z) != 0.0D
				&& (double) Block.blocksList[par3].getBlockHardness(world, x,
						y, z) != 0.1D) {
			stack.damageItem(2, entityLivingBase);
		}

		return true;
	}
}