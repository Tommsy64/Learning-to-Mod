package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomSword;
import iceCraft.items.tools.lib.ToolUtils;
import iceCraft.lib.config.Names;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IceSword extends CustomSword {

	public IceSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSword_unlocalizedName);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack,
			EntityPlayer entityPlayer, Entity entity) {
		if (ToolUtils.isMobLava(entity.getEntityName()))
			stack.damageItem(100, entityPlayer);

		// WTF?! I can't use Strings in a switch statement?!
		/*
		 * switch() { case "PigZombie": break; case "MagmaCube": break; default:
		 * break; }
		 */

		return false;
	}
}
