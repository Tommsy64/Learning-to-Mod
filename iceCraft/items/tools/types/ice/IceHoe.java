package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomHoe;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IceHoe extends CustomHoe {

	public IceHoe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceHoe_unlocalizedName);
	}

}
