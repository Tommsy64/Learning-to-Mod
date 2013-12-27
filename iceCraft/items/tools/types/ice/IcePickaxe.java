package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomPickaxe;
import iceCraft.items.tools.lib.ToolUtils;
import iceCraft.lib.config.Names;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IcePickaxe extends CustomPickaxe {

	public IcePickaxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.icePickaxe_unlocalizedName);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity,
			EntityLivingBase entityPlayer) {

		if (ToolUtils.isMobLava(entity.getEntityName())) {
			stack.damageItem(1000, entityPlayer);
			return false;
		}

		stack.damageItem(10, entityPlayer);
		return true;
	}
}
