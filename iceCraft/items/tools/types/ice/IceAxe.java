package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomAxe;
import iceCraft.items.tools.lib.ToolUtils;
import iceCraft.lib.config.Names;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IceAxe extends CustomAxe {

	public IceAxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceAxe_unlocalizedName);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase entity,
			EntityLivingBase entityPlayer) {

		if (ToolUtils.isMobLava(entity.getEntityName())) {
			stack.damageItem(1000, entityPlayer);
			return false;
		}

		stack.damageItem(3, entityPlayer);
		return true;
	}
}
