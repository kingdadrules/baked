package main;


import caelumworld.SkyFruitSeed;
import insulaworld.InsulaBootsPotion;
import monsworld.MonsArmour;
import arbosworld.ArbosNutSeed;
import bathisworld.CrabshellBoots;
import bathisworld.HelmetPotion;
import toolInsula.InsulaSword;
import toolbathis.CrabSword;
import toolmons.MonsSword;
import toolsbaked.BakedSword;
import toolsbaked.ModAxe;
import toolsbaked.ModHoe;
import toolsbaked.ModPickaxe;
import toolsbaked.ModShovel;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.registries.IForgeRegistry;
import silvamworld.SilvamBushSeed;
import net.minecraftforge.common.util.EnumHelper;


public class ModItems {
					// harvestLevel, durability, miningSpeed, damageVsEntities, enchantability
	
	public static ItemBase bakednoteium = new ItemBase("bakednoteium").setCreativeTab(CreativeTab.baked);
	public static ItemBase introbook = new ItemBase("introbook").setCreativeTab(CreativeTab.baked);
	public static ItemBase notebaked1 = new ItemBase("notebaked1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notebaked2 = new ItemBase("notebaked2").setCreativeTab(CreativeTab.baked);
	public static ItemBase notearbos1 = new ItemBase("notearbos1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notebathis1 = new ItemBase("notebathis1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notesilvam1 = new ItemBase("notesilvam1").setCreativeTab(CreativeTab.baked);
	public static ItemBase noteinsula1 = new ItemBase("noteinsula1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notecaelum1 = new ItemBase("notecaelum1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notemons1 = new ItemBase("notemons1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notecoletus1 = new ItemBase("notecoletus1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notefrigus1 = new ItemBase("notefrigus1").setCreativeTab(CreativeTab.baked);
	public static ItemBase notefinal = new ItemBase("notefinal").setCreativeTab(CreativeTab.baked);
	public static ItemBase piratediviningrod = new ItemBase("piratediviningrod").setCreativeTab(CreativeTab.baked);
	
	public static ToolMaterial BakedMaterial = EnumHelper.addToolMaterial("BakedMaterial", 2, 99, 3, (float) 0.9, 10);
	public static ToolMaterial CrabswordMaterial = EnumHelper.addToolMaterial("CrabswordMaterial", 3, 900, 7, (float) 3.5, 10);
	public static ToolMaterial InsulaSwordMaterial = EnumHelper.addToolMaterial("InsulaSwordMaterial", 3, 2000, 7, (float) 4.5, 15);
	public static ToolMaterial MonsSwordMaterial = EnumHelper.addToolMaterial("MonsSwordMaterial", 3, 4000, 7, (float) 6.5, 25);
		
	public static ModPickaxe bakedpickaxe = new ModPickaxe(BakedMaterial, "bakedpickaxe").setCreativeTab(CreativeTab.baked);
	public static ModShovel bakedshovel = new ModShovel(BakedMaterial, "bakedshovel").setCreativeTab(CreativeTab.baked);
	public static ModHoe bakedhoe = new ModHoe(BakedMaterial, "bakedhoe").setCreativeTab(CreativeTab.baked);
	public static ModAxe bakedaxe = new ModAxe(BakedMaterial, "bakedaxe").setCreativeTab(CreativeTab.baked);
	public static BakedSword bakedsword = new BakedSword(BakedMaterial, "bakedsword").setCreativeTab(CreativeTab.baked);
	public static ItemBase sievebookefficiency = new ItemBase("sievebookefficiency").setCreativeTab(CreativeTab.baked);
	public static ItemBase sievebookfortune = new ItemBase("sievebookfortune").setCreativeTab(CreativeTab.baked);
	
	public static MyItemFood lichen = new MyItemFood("lichen").setCreativeTab(CreativeTab.baked);
	public static MyItemFood algae = new MyItemFood("algae").setCreativeTab(CreativeTab.baked);
	public static ItemBase bakedstick = new ItemBase("bakedstick").setCreativeTab(CreativeTab.baked);
	public static ItemBase clinker = new ItemBase("clinker").setCreativeTab(CreativeTab.baked);
	public static MyWaterPearl waterpearl = new MyWaterPearl("waterpearl").setCreativeTab(CreativeTab.baked);
	public static ItemBase enderseed = new ItemBase("enderseed").setCreativeTab(CreativeTab.baked);
	public static ItemBase transformer = new ItemBase("transformer").setCreativeTab(CreativeTab.baked);	
	public static ItemBase portalhandle = new ItemBase("portalhandle").setCreativeTab(CreativeTab.baked);
	public static ItemBase portalpowersource = new ItemBase("portalpowersource").setCreativeTab(CreativeTab.baked);
	public static ItemBase crushedeggshells = new ItemBase("crushedeggshells").setCreativeTab(CreativeTab.baked);
	public static MyItemFood driedeggpowder = new MyItemFood("driedeggpowder").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase portalarboskey = new ItemBase("portalarboskey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalarbosactivator = new MyIgniter("portalarbosactivator").setCreativeTab(CreativeTab.baked);	
	public static ItemBase arbosnut = new ItemBase("arbosnut").setCreativeTab(CreativeTab.baked);
	public static ItemBase arbosnutcrushed = new ItemBase("arbosnutcrushed").setCreativeTab(CreativeTab.baked);
	public static ArbosNutSeed arbosnutseed = new ArbosNutSeed(null, null, "arbosnutseed").setCreativeTab(CreativeTab.baked);
	public static ItemBase arbosgreenjewel = new ItemBase("arbosgreenjewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase arbosbluejewel = new ItemBase("arbosbluejewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase arbosgreenjewelcrushed = new ItemBase("arbosgreenjewelcrushed").setCreativeTab(CreativeTab.baked);
	public static ItemBase arbosbluejewelcrushed = new ItemBase("arbosbluejewelcrushed").setCreativeTab(CreativeTab.baked);
	public static ItemBase arbosmobheart = new ItemBase("arbosmobheart").setCreativeTab(CreativeTab.baked);
		
	public static ItemBase portalbathiskey = new ItemBase("portalbathiskey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalbathisactivator = new MyIgniter("portalbathisactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase bathisleadingot = new ItemBase("bathisleadingot").setCreativeTab(CreativeTab.baked);
	public static ItemBase bathisredjewel = new ItemBase("bathisredjewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase bathisredjewelcrushed = new ItemBase("bathisredjewelcrushed").setCreativeTab(CreativeTab.baked);
	public static HelmetPotion helmetpotion = new HelmetPotion(baked.crabshellAmorMaterial, EntityEquipmentSlot.HEAD, new PotionEffect(MobEffects.NIGHT_VISION, 600, 100, true, false), "crabshellhelmet");
	public static ItemArmor crabshellchestplate = new ItemArmor(baked.crabshellAmorMaterial, EntityEquipmentSlot.CHEST, "crabshellchestplate").setCreativeTab(CreativeTab.baked);
	public static ItemArmor crabshellleggings = new ItemArmor(baked.crabshellAmorMaterial, EntityEquipmentSlot.LEGS, "crabshellleggings").setCreativeTab(CreativeTab.baked);
	public static CrabshellBoots crabshellboots = new CrabshellBoots(baked.crabshellAmorMaterial, EntityEquipmentSlot.FEET, "crabshellboots").setCreativeTab(CreativeTab.baked);
	public static CrabSword crabsword = new CrabSword(CrabswordMaterial, "crabsword").setCreativeTab(CreativeTab.baked).setCreativeTab(CreativeTab.baked);
	public static ItemBase transformerbathis = new ItemBase("transformerbathis").setCreativeTab(CreativeTab.baked);	
	public static ItemBase coral = new ItemBase("coral").setCreativeTab(CreativeTab.baked);	
	public static MyPearl pearl = new MyPearl("pearl").setCreativeTab(CreativeTab.baked);	
	public static ItemBase transparentpearl = new ItemBase("transparentpearl").setCreativeTab(CreativeTab.baked);
	public static ItemBase pearlglass = new ItemBase("pearlglass").setCreativeTab(CreativeTab.baked);
	public static ItemBase bathismodule = new ItemBase("bathismodule").setCreativeTab(CreativeTab.baked);	
	public static ItemBase bathisweeddust = new ItemBase("bathisweeddust").setCreativeTab(CreativeTab.baked);
	public static ItemBase firecrabdust = new ItemBase("firecrabdust").setCreativeTab(CreativeTab.baked);
	public static ItemBase bathismobheart = new ItemBase("bathismobheart").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase portalsilvamkey = new ItemBase("portalsilvamkey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalsilvamactivator = new MyIgniter("portalsilvamactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase transformersilvam = new ItemBase("transformersilvam").setCreativeTab(CreativeTab.baked);	
	public static ItemBase silvammodule = new ItemBase("silvammodule").setCreativeTab(CreativeTab.baked);	
	public static ItemBase silvamegg = new ItemBase("silvamegg").setCreativeTab(CreativeTab.baked);
	public static SilvamBushSeed silvambushseed = new SilvamBushSeed(null, null, "silvambushseed").setCreativeTab(CreativeTab.baked);
	public static MyItemFood silvamflamefruit = new MyItemFood("silvamflamefruit").setCreativeTab(CreativeTab.baked);
	public static ItemBase silvamyellowjewel = new ItemBase("silvamyellowjewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase silvamyellowjewelcrushed = new ItemBase("silvamyellowjewelcrushed").setCreativeTab(CreativeTab.baked);
	public static ItemBase silvammobheart = new ItemBase("silvammobheart").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase portalinsulakey = new ItemBase("portalinsulakey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalinsulaactivator = new MyIgniter("portalinsulaactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulatwigs = new ItemBase("insulatwigs").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulaplate = new ItemBase("insulaplate").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulaplatebaked = new ItemBase("insulaplatebaked").setCreativeTab(CreativeTab.baked);
	public static InsulaBootsPotion insulabootspotion = new InsulaBootsPotion(baked.insulaAmorMaterial, EntityEquipmentSlot.FEET, new PotionEffect(MobEffects.FIRE_RESISTANCE, 600, 100, true, false), "insulaboots");
	public static ItemArmor insulachestplate = new ItemArmor(baked.insulaAmorMaterial, EntityEquipmentSlot.CHEST, "insulachestplate").setCreativeTab(CreativeTab.baked);
	public static ItemArmor insulaleggings = new ItemArmor(baked.insulaAmorMaterial, EntityEquipmentSlot.LEGS, "insulaleggings").setCreativeTab(CreativeTab.baked);
	public static ItemArmor insulahelmet = new ItemArmor(baked.insulaAmorMaterial, EntityEquipmentSlot.HEAD, "insulahelmet").setCreativeTab(CreativeTab.baked);
	public static InsulaSword insulasword = new InsulaSword(InsulaSwordMaterial, "insulasword").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulawhitejewel = new ItemBase("insulawhitejewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulablackjewel = new ItemBase("insulablackjewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulawhitejewelcrushed = new ItemBase("insulawhitejewelcrushed").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulablackjewelcrushed = new ItemBase("insulablackjewelcrushed").setCreativeTab(CreativeTab.baked);
	public static ItemBase fossiltwigs = new ItemBase("fossiltwigs").setCreativeTab(CreativeTab.baked);
	public static ItemBase fossilnetherstar = new ItemBase("fossilnetherstar").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulamodule = new ItemBase("insulamodule").setCreativeTab(CreativeTab.baked);
	public static ItemBase transformerinsula = new ItemBase("transformerinsula").setCreativeTab(CreativeTab.baked);
	public static ItemBase bakednetherstar = new ItemBase("bakednetherstar").setCreativeTab(CreativeTab.baked);
	public static ItemBase insulamobheart = new ItemBase("insulamobheart").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase caelumitenugget = new ItemBase("caelumitenugget").setCreativeTab(CreativeTab.baked);
	public static ItemBase caelumiteingot = new ItemBase("caelumiteingot").setCreativeTab(CreativeTab.baked);
	public static ItemBase caelumpinkjewel = new ItemBase("caelumpinkjewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase caelumpinkjewelcrushed = new ItemBase("caelumpinkjewelcrushed").setCreativeTab(CreativeTab.baked);
	public static SkyFruitSeed skyfruitseed = new SkyFruitSeed(null, null, "skyfruitseed").setCreativeTab(CreativeTab.baked);
	public static ItemBase skyfruit = new ItemBase("skyfruit").setCreativeTab(CreativeTab.baked);
	public static ItemBase caelummodule = new ItemBase("caelummodule").setCreativeTab(CreativeTab.baked);
	public static ItemBase transformercaelum = new ItemBase("transformercaelum").setCreativeTab(CreativeTab.baked);
	public static ItemBase portalcaelumkey = new ItemBase("portalcaelumkey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalcaelumactivator = new MyIgniter("portalcaelumactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase caelummobheart = new ItemBase("caelummobheart").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase monsrainbowjewel = new ItemBase("monsrainbowjewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase monsheavyingot = new ItemBase("monsheavyingot").setCreativeTab(CreativeTab.baked);
	public static ItemBase monsmediumingot = new ItemBase("monsmediumingot").setCreativeTab(CreativeTab.baked);
	public static ItemBase monslightingot = new ItemBase("monslightingot").setCreativeTab(CreativeTab.baked);
	public static MonsArmour monsboots = new MonsArmour(baked.MonsAmorMaterial, EntityEquipmentSlot.FEET, "monsboots").setCreativeTab(CreativeTab.baked);
	public static MonsArmour monsleggings = new MonsArmour(baked.MonsAmorMaterial, EntityEquipmentSlot.LEGS, "monsleggings").setCreativeTab(CreativeTab.baked);
	public static MonsArmour monschestplate = new MonsArmour(baked.MonsAmorMaterial, EntityEquipmentSlot.CHEST, "monschestplate").setCreativeTab(CreativeTab.baked);
	public static MonsArmour monshelmet = new MonsArmour(baked.MonsAmorMaterial, EntityEquipmentSlot.HEAD, "monshelmet").setCreativeTab(CreativeTab.baked);
	public static MonsSword monssword = new MonsSword(MonsSwordMaterial, "monssword").setCreativeTab(CreativeTab.baked);
	public static ItemBase monsmodule = new ItemBase("monsmodule").setCreativeTab(CreativeTab.baked);
	public static ItemBase transformermons = new ItemBase("transformermons").setCreativeTab(CreativeTab.baked);
	public static ItemBase portalmonskey = new ItemBase("portalmonskey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalmonsactivator = new MyIgniter("portalmonsactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase monsmobheart = new ItemBase("monsmobheart").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase coletusorangejewel = new ItemBase("coletusorangejewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase coletusmodule = new ItemBase("coletusmodule").setCreativeTab(CreativeTab.baked);
	public static ItemBase transformercoletus = new ItemBase("transformercoletus").setCreativeTab(CreativeTab.baked);
	public static ItemBase portalcoletuskey = new ItemBase("portalcoletuskey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalcoletusactivator = new MyIgniter("portalcoletusactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase coletusmobheart = new ItemBase("coletusmobheart").setCreativeTab(CreativeTab.baked);
	public static ItemBase coletusbone = new ItemBase("coletusbone").setCreativeTab(CreativeTab.baked);
	
	public static ItemBase iceflower = new ItemBase("iceflower").setCreativeTab(CreativeTab.baked);
	public static ItemBase icecrystal = new ItemBase("icecrystal").setCreativeTab(CreativeTab.baked);
	public static ItemBase icecrystalcrushed = new ItemBase("icecrystalcrushed").setCreativeTab(CreativeTab.baked);
	public static ItemBase icejewelfragment = new ItemBase("icejewelfragment").setCreativeTab(CreativeTab.baked);
	public static ItemBase icystrand = new ItemBase("icystrand").setCreativeTab(CreativeTab.baked);
	public static ItemBase icejewel = new ItemBase("icejewel").setCreativeTab(CreativeTab.baked);
	public static ItemBase returnactivator = new ItemBase("returnactivator").setCreativeTab(CreativeTab.baked);
	public static ItemBase frigusmobheart = new ItemBase("frigusmobheart").setCreativeTab(CreativeTab.baked);
	public static ItemBase portalfriguskey = new ItemBase("portalfriguskey").setCreativeTab(CreativeTab.baked);
	public static MyIgniter portalfrigusactivator = new MyIgniter("portalfrigusactivator").setCreativeTab(CreativeTab.baked);
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				
				bakednoteium,
				introbook,
				notebaked1,
				notebaked2,
				notearbos1,
				notebathis1,
				notesilvam1,
				noteinsula1,
				notecaelum1,
				notemons1,
				notecoletus1,
				notefrigus1,
				notefinal,
				piratediviningrod,
				
				bakedstick,
				bakedpickaxe,
				bakedshovel,
				bakedhoe,
				bakedaxe,
				bakedsword,
				sievebookefficiency,
				sievebookfortune,
				
				lichen,
				algae,
				clinker,
				waterpearl,
				enderseed,
				transformer,
				portalhandle,
				portalpowersource,
				crushedeggshells,
				driedeggpowder,
				
				portalarboskey,
				portalarbosactivator,				
				arbosnut,
				arbosnutcrushed,
				arbosnutseed,
				arbosgreenjewel,
				arbosbluejewel,
				arbosgreenjewelcrushed,
				arbosbluejewelcrushed,
				arbosmobheart,
				
				portalbathiskey,
				portalbathisactivator,				
				bathisleadingot,
				bathisredjewel,
				bathisredjewelcrushed,
				helmetpotion,
				crabshellchestplate,
				crabshellleggings,
				crabshellboots,
				crabsword,
				transformerbathis,
				coral,
				pearl,
				transparentpearl,
				pearlglass,
				bathismodule,
				bathisweeddust,
				firecrabdust,
				bathismobheart,
				
				portalsilvamkey,
				portalsilvamactivator,
				silvammodule,
				transformersilvam,
				silvamegg,
				silvambushseed,
				silvamflamefruit,
				silvamyellowjewel,
				silvamyellowjewelcrushed,
				silvammobheart,
				
				portalinsulakey,
				portalinsulaactivator,
				insulatwigs,
				insulaplate,
				insulaplatebaked,
				insulabootspotion,
				insulaleggings,
				insulachestplate,
				insulahelmet,
				insulasword,
				insulawhitejewel,
				insulablackjewel,
				insulawhitejewelcrushed,
				insulablackjewelcrushed,
				fossiltwigs,
				fossilnetherstar,
				insulamodule,
				transformerinsula,
				bakednetherstar,
				insulamobheart,
				
				caelumitenugget,
				caelumiteingot,
				caelumpinkjewel,
				caelumpinkjewelcrushed,
				skyfruit,
				skyfruitseed,
				caelummodule,
				transformercaelum,
				portalcaelumkey,
				portalcaelumactivator,
				caelummobheart,
				
				monsrainbowjewel,
				monsheavyingot,
				monsmediumingot,
				monslightingot,
				monsboots,
				monsleggings,
				monschestplate,
				monshelmet,
				monssword,
				monsmodule,
				transformermons,
				portalmonskey,
				portalmonsactivator,
				monsmobheart,		
				
				
				coletusmodule,
				transformercoletus,
				portalcoletuskey,
				portalcoletusactivator,
				coletusmobheart,				
				coletusorangejewel,
				coletusbone,
				
				iceflower,
				icecrystal,
				icecrystalcrushed,
				icejewelfragment,
				icystrand,
				icejewel,
				returnactivator,
				frigusmobheart,
				portalfriguskey,
				portalfrigusactivator
				
		);
	}

	public static void registerModels() {
		
		bakednoteium.registerItemModel();
		introbook.registerItemModel();
		notebaked1.registerItemModel();
		notebaked2.registerItemModel();
		notearbos1.registerItemModel();
		notebathis1.registerItemModel();
		notesilvam1.registerItemModel();
		noteinsula1.registerItemModel();
		notecaelum1.registerItemModel();
		notemons1.registerItemModel();
		notecoletus1.registerItemModel();
		notefrigus1.registerItemModel();
		notefinal.registerItemModel();
		piratediviningrod.registerItemModel();
				
		bakedpickaxe.registerItemModel(bakedpickaxe);
		bakedshovel.registerItemModel(bakedshovel);
		bakedhoe.registerItemModel(bakedhoe);
		bakedaxe.registerItemModel(bakedaxe);
		bakedsword.registerItemModel(bakedsword);
		sievebookefficiency.registerItemModel();
		sievebookfortune.registerItemModel();
		
		lichen.registerItemModel(lichen);	
		algae.registerItemModel(algae);
		bakedstick.registerItemModel();
		clinker.registerItemModel();
		waterpearl.registerItemModel();
		enderseed.registerItemModel();
		transformer.registerItemModel();
		portalhandle.registerItemModel();
		portalpowersource.registerItemModel();
		crushedeggshells.registerItemModel();
		driedeggpowder.registerItemModel(driedeggpowder);
		
		portalarboskey.registerItemModel();
		portalarbosactivator.registerItemModel();
		arbosnut.registerItemModel();
		arbosnutcrushed.registerItemModel();
		arbosnutseed.registerItemModel(arbosnutseed);
		arbosgreenjewel.registerItemModel();
		arbosbluejewel.registerItemModel();
		arbosgreenjewelcrushed.registerItemModel();
		arbosbluejewelcrushed.registerItemModel();
		arbosmobheart.registerItemModel();
		
		portalbathiskey.registerItemModel();
		portalbathisactivator.registerItemModel();
		bathisleadingot.registerItemModel();
		bathisredjewel.registerItemModel();
		bathisredjewelcrushed.registerItemModel();
		helmetpotion.registerItemModel(helmetpotion);
		crabshellchestplate.registerItemModel(crabshellchestplate);
		crabshellleggings.registerItemModel(crabshellleggings);
		crabshellboots.registerItemModel(crabshellboots);
		crabsword.registerItemModel(crabsword);
		transformerbathis.registerItemModel();
		coral.registerItemModel();
		pearl.registerItemModel();
		transparentpearl.registerItemModel();
		pearlglass.registerItemModel();
		bathismodule.registerItemModel();
		bathisweeddust.registerItemModel();
		firecrabdust.registerItemModel();
		bathismobheart.registerItemModel();
		
		portalsilvamkey.registerItemModel();
		portalsilvamactivator.registerItemModel();
		transformersilvam.registerItemModel();
		silvammodule.registerItemModel();
		silvamegg.registerItemModel();
		silvambushseed.registerItemModel(silvambushseed);
		silvamflamefruit.registerItemModel(silvamflamefruit);
		silvamyellowjewel.registerItemModel();
		silvamyellowjewelcrushed.registerItemModel();
		silvammobheart.registerItemModel();
		
		portalinsulakey.registerItemModel();
		portalinsulaactivator.registerItemModel();
		insulatwigs.registerItemModel();
		insulaplate.registerItemModel();
		insulaplatebaked.registerItemModel();
		insulabootspotion.registerItemModel(insulabootspotion);
		insulaleggings.registerItemModel(insulaleggings);
		insulachestplate.registerItemModel(insulachestplate);
		insulahelmet.registerItemModel(insulahelmet);
		insulasword.registerItemModel(insulasword);
		insulawhitejewel.registerItemModel();
		insulablackjewel.registerItemModel();
		insulawhitejewelcrushed.registerItemModel();
		insulablackjewelcrushed.registerItemModel();
		fossiltwigs.registerItemModel();
		fossilnetherstar.registerItemModel();
		insulamodule.registerItemModel();
		transformerinsula.registerItemModel();
		bakednetherstar.registerItemModel();
		insulamobheart.registerItemModel();
		
		caelumitenugget.registerItemModel();
		caelumiteingot.registerItemModel();
		caelumpinkjewel.registerItemModel();
		caelumpinkjewelcrushed.registerItemModel();
		skyfruit.registerItemModel();
		skyfruitseed.registerItemModel(skyfruitseed);
		caelummodule.registerItemModel();
		transformercaelum.registerItemModel();
		portalcaelumkey.registerItemModel();
		portalcaelumactivator.registerItemModel();
		caelummobheart.registerItemModel();
		monsrainbowjewel.registerItemModel();
		monsheavyingot.registerItemModel();
		monsmediumingot.registerItemModel();
		monslightingot.registerItemModel();		
		monsboots.registerItemModel(monsboots);
		monsleggings.registerItemModel(monsleggings);
		monschestplate.registerItemModel(monschestplate);
		monshelmet.registerItemModel(monshelmet);
		monssword.registerItemModel(monssword);
		monsmodule.registerItemModel();
		transformermons.registerItemModel();		
		portalmonskey.registerItemModel();		
		portalmonsactivator.registerItemModel();		
		monsmobheart.registerItemModel();		
		
		coletusmodule.registerItemModel();
		transformercoletus.registerItemModel();		
		portalcoletuskey.registerItemModel();		
		portalcoletusactivator.registerItemModel();		
		coletusmobheart.registerItemModel();			
		coletusorangejewel.registerItemModel();
		coletusbone.registerItemModel();
		
		iceflower.registerItemModel();
		icecrystal.registerItemModel();
		icecrystalcrushed.registerItemModel();
		icejewelfragment.registerItemModel();
		icystrand.registerItemModel();
		icejewel.registerItemModel();
		returnactivator.registerItemModel();
		frigusmobheart.registerItemModel();
		portalfriguskey.registerItemModel();		
		portalfrigusactivator.registerItemModel();
	}
}
