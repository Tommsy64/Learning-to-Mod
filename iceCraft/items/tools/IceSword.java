package iceCraft.items.tools;

import iceCraft.items.tools.types.CustomSword;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IceSword extends CustomSword {

	protected IceSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSword_unlocalizedName);
	}

}
