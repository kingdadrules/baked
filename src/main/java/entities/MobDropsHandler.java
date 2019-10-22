package entities;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler {
	
@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=true)
public void onEvent(LivingDropsEvent event)
{
    if (event.getEntity() instanceof EntityZombie && event.getEntity().world.provider.getDimension() == 8)
    {
    	Random r = new Random();
		float chance = r.nextFloat();
		if (chance <= 0.4f) {		
	        event.getDrops().clear();
	        ItemStack itemStackToDrop = new ItemStack(Items.FEATHER, 1);
	        event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	        event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
		}
   	}
    
    //if (event.getEntity() instanceof ArbosSpider && event.getEntity().world.provider.getDimension() == 0)
    //{
    //	float chance = r.nextFloat();
	//	if (chance <= 0.4f) {		
	//        event.getDrops().clear();
	 //       ItemStack itemStackToDrop = new ItemStack(Items.FEATHER, 1);
	 //       event.getDrops().add(new EntityItem(event.getEntity().world, event.getEntity().posX, 
	 //       event.getEntity().posY, event.getEntity().posZ, itemStackToDrop));
	//	}
   	//}
} 

}
