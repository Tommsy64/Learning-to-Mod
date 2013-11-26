package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomSword;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IceSpade extends CustomSword {

	public IceSpade(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSword_unlocalizedName);
	}

}
