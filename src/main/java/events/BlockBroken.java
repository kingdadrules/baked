package events;

import main.ModBlocks;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBroken {

	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
	@SideOnly(Side.CLIENT)
	//WorldServer world = (WorldServer) world;
	public void onEvent(BreakEvent event)
	 
	{	
			
			if ( (event.getPlayer() != null) && ( event.getState().getBlock() == ModBlocks.oxygenweed ) )
			 {
			
			event.getPlayer().addPotionEffect(new PotionEffect(Potion.getPotionById(13), 1200, 2));
		}	
			
	}
	
	
}
