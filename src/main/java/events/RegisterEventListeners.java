package events;


import entities.MobDropsHandler;
import entities.MobSpawnHandler;
import main.baked;
import net.minecraftforge.common.MinecraftForge;

public class RegisterEventListeners {
	
	public static void registerEventListeners() {
			
	    // DEBUG
		baked.logger.info("registerEventListeners");

	    MinecraftForge.EVENT_BUS.register(new MobDropsHandler());
	    MinecraftForge.EVENT_BUS.register(new MobSpawnHandler());
	    MinecraftForge.EVENT_BUS.register(new PlayerRightClick());
	    MinecraftForge.EVENT_BUS.register(new PlayerFirstTimeJoin());
	    MinecraftForge.EVENT_BUS.register(new PlayerSleep());
	    MinecraftForge.EVENT_BUS.register(new PlayerChangedDimension());
	    MinecraftForge.EVENT_BUS.register(new BlockBroken());
	    MinecraftForge.EVENT_BUS.register(new PlayerInteractEntity());
	}
	
}
