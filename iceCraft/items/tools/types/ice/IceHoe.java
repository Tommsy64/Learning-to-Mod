package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomHoe;
import iceCraft.items.tools.lib.ToolUtils;
import iceCraft.lib.config.Names;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IceHoe extends CustomHoe {

	public IceHoe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceHoe_unlocalizedName);
	}

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
