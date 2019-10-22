package entities;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import main.baked;

public class ModEntities {
	
	public static void init() {
		baked.logger.info("ModEntities.init");
        int id = 1;        

        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Arboswitch"), ArbosWitch.class, "arboswitch", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
      //EntityRegistry.addSpawn(ArbosCreeper.class, 100, 3, 5, EnumCreatureType.MONSTER, Biomes.PLAINS, Biomes.ICE_PLAINS);
        LootTableList.register(ArbosWitch.LOOT);

        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Arboscreeper"), ArbosCreeper.class, "arboscreeper", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ArbosCreeper.LOOT);

        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Arbosskeleton"), ArbosSkeleton.class, "arbosskeleton", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ArbosSkeleton.LOOT);

        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Arbosspider"), ArbosSpider.class, "arbosspider", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ArbosSpider.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Arboszombie"), ArbosZombie.class, "arboszombie", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ArbosZombie.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Bathisskeleton"), BathisSkeleton.class, "bathisskeleton", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(BathisSkeleton.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Bathiscavespider"), BathisCaveSpider.class, "bathiscavespider", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(BathisCaveSpider.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Silvamcreeper"), SilvamCreeper.class, "silvamcreeper", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(SilvamCreeper.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Silvamzombie"), SilvamZombie.class, "silvamzombie", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(SilvamZombie.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Insulaspider"), InsulaSpider.class, "insulaspider", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(InsulaSpider.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Insulazombie"), InsulaZombie.class, "insulazombie", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(InsulaZombie.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Caelumskeleton"), CaelumSkeleton.class, "caelumskeleton", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(CaelumSkeleton.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Monsspider"), MonsSpider.class, "monsspider", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(MonsSpider.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Monszombie"), MonsZombie.class, "monszombie", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(MonsZombie.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Coletuscreeper"), ColetusCreeper.class, "coletuscreeper", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ColetusCreeper.LOOT);

        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Coletusskeleton"), ColetusSkeleton.class, "coletusskeleton", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ColetusSkeleton.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Coletuscow"), ColetusCow.class, "coletuscow", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(ColetusCow.LOOT);
        
        EntityRegistry.registerModEntity(new ResourceLocation(main.baked.modId, "Frigusspider"), FrigusSpider.class, "frigusspider", id++, main.baked.instance, 64, 3, true, 0x996600, 0x00ff00);
        LootTableList.register(FrigusSpider.LOOT);
        
       	}
	
	@SideOnly(Side.CLIENT)
       public static void initModels() {
   	   baked.logger.info("ModEntities.initModels");
   	   
   	   RenderingRegistry.registerEntityRenderingHandler(ArbosWitch.class, ArbosWitchRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(ArbosCreeper.class, ArbosCreeperRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(ArbosSkeleton.class, ArbosSkeletonRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(ArbosSpider.class, ArbosSpiderRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(ArbosZombie.class, ArbosZombieRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(BathisSkeleton.class, BathisSkeletonRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(BathisCaveSpider.class, BathisCaveSpiderRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(SilvamCreeper.class, SilvamCreeperRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(SilvamZombie.class, SilvamZombieRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(InsulaSpider.class, InsulaSpiderRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(InsulaZombie.class, InsulaZombieRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(CaelumSkeleton.class, CaelumSkeletonRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(MonsSpider.class, MonsSpiderRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(MonsZombie.class, MonsZombieRender.FACTORY);
   	   RenderingRegistry.registerEntityRenderingHandler(ColetusCreeper.class, ColetusCreeperRender.FACTORY);
	   RenderingRegistry.registerEntityRenderingHandler(ColetusSkeleton.class, ColetusSkeletonRender.FACTORY);
	   RenderingRegistry.registerEntityRenderingHandler(ColetusCow.class, ColetusCowRender.FACTORY);
	   RenderingRegistry.registerEntityRenderingHandler(FrigusSpider.class, FrigusSpiderRender.FACTORY);
    }
}

