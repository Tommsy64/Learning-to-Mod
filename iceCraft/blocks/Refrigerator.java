package iceCraft.blocks;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import iceCraft.tileentity.TileEntityRefrigerator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Refrigerator extends BlockContainer {

	public Refrigerator(int id) {
		super(id, Material.iron);

		this.setUnlocalizedName(Names.refrigerator_unlocalizedName);

		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(IceCraft.IceCraftTab);

		this.setHardness(5F);
		this.setResistance(10F);

	}

	@Override
	public TileEntity createNewTileEntity(World world) {
		return new TileEntityRefrigerator();
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z,
			EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		// We want the GUI opening to be handled on the serverside
		if (!world.isRemote) {

			/*
			 * Play to open GUI on, Mod instance, ID of the GUI, world of the
			 * player/world to open GUI, xyz coords of the block to open the GUI
			 * on
			 */
			FMLNetworkHandler.openGui(player, IceCraft.instance, 0, world, x,
					y, z);
		}
		// We want the GUI to open regardless whether it is the client or server
		return true;
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		setDefaultDirection(world, x, y, z);
	}

	private void setDefaultDirection(World world, int x, int y, int z) {
		// Bizzare code that is not understood to get the meta data......
		if (!world.isRemote) {
			int zNeg = world.getBlockId(x, y, z - 1);
			int zPos = world.getBlockId(x, y, z + 1);
			int xNeg = world.getBlockId(x - 1, y, z);
			int xPos = world.getBlockId(x + 1, y, z);
			byte meta = 3;

			if (Block.opaqueCubeLookup[xNeg] && !Block.opaqueCubeLookup[xPos]) {
				meta = 5;
			}

			if (Block.opaqueCubeLookup[xPos] && !Block.opaqueCubeLookup[xNeg]) {
				meta = 4;
			}

			if (Block.opaqueCubeLookup[zNeg] && !Block.opaqueCubeLookup[zPos]) {
				meta = 3;
			}

			if (Block.opaqueCubeLookup[zPos] && !Block.opaqueCubeLookup[zNeg]) {
				meta = 2;
			}
			// The 2 in the setBlockMetadataWithNotify call is just a value used
			// by the vanilla code to identify the significance of the update.
			// Again, just accept that this is the value that you need to use
			// here.....
			world.setBlockMetadataWithNotify(x, y, z, meta, 2);
		}
	}

	// We set some more metadata values depending on the
	// rotation of the player when the block is placed. This is the constructor
	// that determines what direction the player is facing and, consequently,
	// what way the block should face:
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z,
			EntityLivingBase entity, ItemStack itemstack) {
		int rotation = MathHelper
				.floor_double((double) (entity.rotationYaw * 4F / 360F) + 0.5D) & 3;

		if (rotation == 0) {
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}

		if (rotation == 1) {
			world.setBlockMetadataWithNotify(x, y, z, 5, 2);
		}

		if (rotation == 2) {
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}

		if (rotation == 3) {
			world.setBlockMetadataWithNotify(x, y, z, 4, 2);
		}
	}

	@SideOnly(Side.CLIENT)
	public static Icon topIcon;
	@SideOnly(Side.CLIENT)
	public static Icon sideIcon;
	@SideOnly(Side.CLIENT)
	public static Icon frontIcon;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		topIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.refrigerator_unlocalizedName + "_top");
		sideIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.refrigerator_unlocalizedName + "_side");
		frontIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":"
				+ Names.refrigerator_unlocalizedName + "_front");
	}

	@Override
	public Icon getIcon(int side, int meta) {
		if (side == 0 || side == 1) {
			return topIcon;
		} else if (side != meta) {
			return sideIcon;
		} else {
			return frontIcon;
		}
	}
}