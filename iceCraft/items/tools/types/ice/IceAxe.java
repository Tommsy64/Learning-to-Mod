package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomAxe;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IceAxe extends CustomAxe {

	public IceAxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.iceAxe_unlocalizedName);
	}

}
