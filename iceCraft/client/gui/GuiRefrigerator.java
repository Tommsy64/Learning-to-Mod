package iceCraft.client.gui;

import iceCraft.lib.ModInfo;
import iceCraft.lib.config.Names;
import iceCraft.tileentity.TileEntityRefrigerator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class GuiRefrigerator extends GuiContainer {

	public static final ResourceLocation texture = new ResourceLocation(
			ModInfo.ID.toLowerCase(), ModInfo.GUILOCATION
					+ Names.refrigerator_unlocalizedName + ".png");

	public GuiRefrigerator(InventoryPlayer invPlayer,
			TileEntityRefrigerator entity) {

		super(new ContainerRefrigerator(invPlayer, entity));

		// Size of GUI image
		xSize = 176;
		ySize = 165;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		// Set color of image Red, Green, Blue, Alpha
		GL11.glColor4f(1F, 1F, 1F, 1F);

		// Bind the texture
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);

		/*
		 * guiLeft - This is where on the x-plane the top-left of the GUI will
		 * be drawn. We use guiLeft because it is an existing field in
		 * GuiContainer that will work this out for us. guiTop - This is where
		 * on the y-plane the top-left of the GUI will be drawn. We use guiTop
		 * because it is an existing field in GuiContainer that will work this
		 * out for us. 0 - This is the source location of the top-left of the
		 * GUI on the x-plane. On my texture sheet, the GUI is positioned in the
		 * very top-left (0, 0). 0 - This is the source location of the top-left
		 * of the GUI on the y-plane. On my texture sheet, the GUI is positioned
		 * in the very top-left (0, 0). xSize - This is the width of the GUI
		 * image, which we defined in the GuiTutorialDeployer constructor. ySize
		 * - This is the height of the GUI image, which we defined in the
		 * GuiRefrigerator constructor.
		 */
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
	}

}
