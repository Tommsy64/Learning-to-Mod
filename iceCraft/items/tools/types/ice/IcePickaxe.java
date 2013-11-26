package iceCraft.items.tools.types.ice;

import iceCraft.items.tools.lib.CustomPickaxe;
import iceCraft.lib.config.Names;
import net.minecraft.item.EnumToolMaterial;

public class IcePickaxe extends CustomPickaxe {

	public IcePickaxe(int id, EnumToolMaterial toolMaterial) {
		super(id, toolMaterial);
		this.setUnlocalizedName(Names.icePickaxe_unlocalizedName);
	}
}
