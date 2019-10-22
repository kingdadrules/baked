package events;

import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerSleep {
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)
	public void onEvent(PlayerSleepInBedEvent event)
	{
		if  (event.getEntityPlayer().world.provider.getDimension() != 0) {
			event.getEntityPlayer().sendMessage(new TextComponentString(" "));
			event.getEntityPlayer().sendMessage(new TextComponentString("You are too scared to sleep well."));
		}
	}
	
}
