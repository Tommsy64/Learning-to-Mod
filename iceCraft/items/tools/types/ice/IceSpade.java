package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomSpade;
import iceCraft.lib.config.Names;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IceSpade extends CustomSpade {

	public IceSpade(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSpade_unlocalizedName);
	}

	public boolean hitEntity(ItemStack stack,
			EntityLivingBase par2EntityLivingBase,
			EntityLivingBase par3EntityLivingBase) {
		stack.damageItem(10, par3EntityLivingBase);
		return true;
	}
}
