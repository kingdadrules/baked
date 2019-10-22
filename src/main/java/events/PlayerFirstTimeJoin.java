package events;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class PlayerFirstTimeJoin {


	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)
	public void onEvent(PlayerLoggedInEvent event)
	{
		//event.player.sendMessage(new TextComponentString("Welcome to Baked."));		
	
		NBTTagCompound tag = event.player.getEntityData();

		NBTBase modeTag = tag.getTag("baked");
		if (modeTag != null) {
		event.player.sendMessage(new TextComponentString("Welcome Back"));
		} else {
		event.player.sendMessage(new TextComponentString(" "));
		event.player.sendMessage(new TextComponentString("Welcome. Watch out, there have been rumours about space pirates kidnapping people."));
		event.player.sendMessage(new TextComponentString("The stories seem to have been started by a strange villager, so they might be worth checking out."));
		event.player.sendMessage(new TextComponentString(" "));
		tag.setInteger("baked", 1);		
		
		//event.player.inventory.addItemStackToInventory(new ItemStack(ModBlocks.piratebeacon, 1));
		
		//event.player.send
				
		}
	}
}
