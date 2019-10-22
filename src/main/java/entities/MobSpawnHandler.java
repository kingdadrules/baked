package entities;

import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobSpawnHandler {
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)
	public void onEvent(LivingSpawnEvent event)
	{
		
	  //  if (event.getEntity() instanceof EntityZombie && event.getEntity().world.provider.getDimension() == 2)
	 //   {
	 //   	event.getEntity().setDead();
	 //   } 
	 //   if (event.getEntity() instanceof EntitySkeleton && event.getEntity().world.provider.getDimension() == 2)
	 //   {
	// 	event.getEntity().setDead();
	//			} 
	}
}
