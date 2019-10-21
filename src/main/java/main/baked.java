package main;

import org.apache.logging.log4j.Logger;

import entities.ModEntities;
import events.RegisterEventListeners;
import lastworld.LastWorldGenerator;
import proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = baked.modId, name = baked.name, version = baked.version, acceptedMinecraftVersions = "[1.12]")
public class baked {

	public static final ItemArmor.ArmorMaterial crabshellAmorMaterial = EnumHelper.addArmorMaterial("CRABSHELL",
			main.baked.modId + ":crabshell", 19, new int[] { 3, 6, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	public static final ItemArmor.ArmorMaterial insulaAmorMaterial = EnumHelper.addArmorMaterial("INSULA",
			main.baked.modId + ":insula", 60, new int[] { 3, 6, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	public static final ItemArmor.ArmorMaterial MonsAmorMaterial = EnumHelper.addArmorMaterial("MONS",
			main.baked.modId + ":mons", 100, new int[] { 3, 7, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	
	@SidedProxy(serverSide = "proxy.CommonProxy", clientSide = "proxy.ClientProxy")
	public static CommonProxy proxy;

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ModBlocks.registerModels();
			ModItems.registerModels();
		}

	}

	public static final String modId = "baked";
	public static final String name = "baked";
	public static final String version = "MC.1.12-1.0.0";
	public static int currentDimension = 0;
	public static Logger logger;

	@Mod.Instance(modId)
	public static baked instance;
	
	@SuppressWarnings("deprecation")
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		ModEntities.init();
		ModEntities.initModels();
		GameRegistry.registerFuelHandler(new MyFuelBlock());
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
		RegisterEventListeners.registerEventListeners();
		GameRegistry.registerWorldGenerator(new LastWorldGenerator(), 0);  
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}

}
