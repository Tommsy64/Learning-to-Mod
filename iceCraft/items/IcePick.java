package iceCraft.items;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.network.Player;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IcePick extends ItemTool {

	EnumToolMaterial enumToolMaterial;

	// EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency,
	// damage, enchantability)
	public static final EnumToolMaterial IcePickTool = EnumHelper
			.addToolMaterial("IcePickTool", 1, 255, 1.0F, 2.0F, 14);

	protected IcePick(int id, float dameageVsEntity,
			EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {

		super(id, dameageVsEntity, toolMaterial, blocksEffectiveAgainst);

		enumToolMaterial = toolMaterial;
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setMaxStackSize(1);
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
