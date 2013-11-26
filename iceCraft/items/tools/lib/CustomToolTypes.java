package iceCraft.items.tools.lib;

import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class CustomToolTypes {
	// EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency,
	// damage, enchantability)
	public static final EnumToolMaterial IcePickTool = EnumHelper
			.addToolMaterial("IcePickTool", 1, 255, 1.0F, 2.0F, 14);
	
	public static final EnumToolMaterial Ice = EnumHelper
			.addToolMaterial("Ice", 1, 32, 3.0F, 3.0F, 22);
}
