package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomSword;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IceSword extends CustomSword {

	public IceSword(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSword_unlocalizedName);
	}
}