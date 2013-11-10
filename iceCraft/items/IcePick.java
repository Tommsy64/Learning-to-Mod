package iceCraft.items;

import iceCraft.IceCraft;
import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class IcePick extends ItemTool {
	
	EnumToolMaterial enumToolMaterial;
	
	protected IcePick(int id, float dameageVsEntity,
			EnumToolMaterial toolMaterial, Block[] blocksEffectiveAgainst) {
		
		super(id, dameageVsEntity, toolMaterial, blocksEffectiveAgainst);
		
		enumToolMaterial = toolMaterial;
		this.setCreativeTab(IceCraft.IceCraftTab);
		this.setMaxStackSize(1);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + Names.icePick_unlocalizedName + "-" + enumToolMaterial.toString());
	}
}
