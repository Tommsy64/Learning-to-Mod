package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomSpade;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IceSpade extends CustomSpade {

	public IceSpade(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceSpade_unlocalizedName);
	}

}
