package iceCraft.client.sound;

import iceCraft.lib.LogHelper;

import java.util.logging.Level;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SoundHandler {
	
    @SideOnly(Side.CLIENT)
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {
            for(String sound : Sound.files){

                    try {
                            event.manager.soundPoolSounds.addSound(sound);
                    } catch(Exception e) {
                            LogHelper.log(Level.WARNING, "Failed loading sound: " + sound);
                    }
            }
    }
}
