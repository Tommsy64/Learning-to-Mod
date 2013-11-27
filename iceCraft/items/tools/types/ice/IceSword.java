package iceCraft.items.tools.types.ice;

import java.util.logging.Level;

import iceCraft.items.tools.lib.CustomSword;
import iceCraft.items.tools.lib.ToolUtils;
import iceCraft.lib.LogHelper;
import iceCraft.lib.config.Names;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class IceSword extends CustomSword {

	public IceSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSword_unlocalizedName);
	}
	
	@Override
	public boolean hitEntity(ItemStack stack,
			EntityLivingBase entity,
			EntityLivingBase entityPlayer) {
		
		LogHelper.log(Level.INFO, "" +  ToolUtils.isMobLava(entity.getEntityName()));
		
		if (ToolUtils.isMobLava(entity.getEntityName())) {	
			stack.damageItem(1000, entityPlayer);
			return false;
		}
		
		stack.damageItem(10, entityPlayer);
		return true;
	}
}
