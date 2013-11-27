package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomAxe;
import iceCraft.lib.config.Names;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IceAxe extends CustomAxe {

	public IceAxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceAxe_unlocalizedName);
	}

	public boolean hitEntity(ItemStack stack,
			EntityLivingBase par2EntityLivingBase,
			EntityLivingBase par3EntityLivingBase) {
		stack.damageItem(3, par3EntityLivingBase);
		return true;
	}
}
