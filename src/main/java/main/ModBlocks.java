package main;


import bathisworld.BathisRedOre;
import bathisworld.BathisWeed;
import bathisworld.BranchCoral;
import bathisworld.OxygenWeed;
import bathisworld.Oyster;
import bathisworld.WaterPearlWeed;
import caelumworld.CaelumPinkOre;
import caelumworld.SkyFruitCrop;
import frigusworld.IceCrystal;
import frigusworld.Iceplant;
import insulaworld.InsulaBlackOre;
import insulaworld.InsulaBush;
import insulaworld.InsulaWhiteOre;
import monsworld.MonsRainbowOre;
import arbosworld.ArbosBlueOre;
import arbosworld.ArbosGreenOre;
import arbosworld.ArbosLeafBlock;
import arbosworld.ArbosNutCrop;
import bakedworld.MyEnderBlock;
import bakedworld.MyLichenBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.registries.IForgeRegistry;
import silvamworld.SilvamBush;
import silvamworld.SilvamBushCrop;
import silvamworld.SilvamLeafBlock;
import silvamworld.SilvamNest;
import silvamworld.SilvamNestEgg;
import silvamworld.SilvamYellowOre;

public class ModBlocks {
	
	public static BlockLight safelight = new BlockLight(null, "safelight").setCreativeTab(CreativeTab.baked);
	public static BlockSpeaker speaker = new BlockSpeaker("speaker").setCreativeTab(CreativeTab.baked);
	public static BlockSafedoor safedoor = new BlockSafedoor("safedoor").setCreativeTab(CreativeTab.baked);
	public static BlockSafefloor safefloor = new BlockSafefloor("safefloor").setCreativeTab(CreativeTab.baked);
	public static BlockRubberwall rubberwall = new BlockRubberwall("rubberwall").setCreativeTab(CreativeTab.baked);
	public static BlockOre returnblock = new BlockOre("returnblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt mobheartblock = new BlockDirt("mobheartblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt noteiumblock = new BlockDirt("noteiumblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt bakeddirt = new BlockDirt("bakeddirt").setCreativeTab(CreativeTab.baked);
	public static BlockDirt bakedclinker = new BlockDirt("bakedclinker").setCreativeTab(CreativeTab.baked);
	public static BlockStone bakedstone = new BlockStone("bakedstone").setCreativeTab(CreativeTab.baked);
	public static BlockOre lavastone = new BlockOre("lavastone").setCreativeTab(CreativeTab.baked);
	public static BlockOre portalblock = new BlockOre("portalblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre waterstone = new BlockOre("waterstone").setCreativeTab(CreativeTab.baked);	
	public static BlockTree bakedcactus = new BlockTree("bakedcactus").setCreativeTab(CreativeTab.baked);
	public static MyLichenBlock lichenblock = new MyLichenBlock("lichenblock").setCreativeTab(CreativeTab.baked);	
	public static MyEnderBlock enderblock = new MyEnderBlock("enderblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre infusedcoalblock = new BlockOre("infusedcoalblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre superinfusedcoalblock = new BlockOre("superinfusedcoalblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre megainfusedcoalblock = new BlockOre("megainfusedcoalblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt arbosnutdust = new BlockDirt("arbosnutdust").setCreativeTab(CreativeTab.baked);
	public static BlockDirt jeweldust = new BlockDirt("jeweldust").setCreativeTab(CreativeTab.baked);
	public static BlockDirt jewelblock = new BlockDirt("jewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt inertmagma = new BlockDirt("inertmagma").setCreativeTab(CreativeTab.baked);
	public static BlockDirt driedeggblock = new BlockDirt("driedeggblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt eggshellblock = new BlockDirt("eggshellblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt flamefruitblock = new BlockDirt("flamefruitblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt rottenblock = new BlockDirt("rottenblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre piratebeacon = new BlockOre("piratebeacon").setCreativeTab(CreativeTab.baked);
	public static TrollBlock trollblock = new TrollBlock("trollblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre portalhomeworldblock = new BlockOre("portalhomeworldblock").setCreativeTab(CreativeTab.baked);
	
	public static BlockOre portalarbosblock = new BlockOre("portalarbosblock").setCreativeTab(CreativeTab.baked);	
	public static BlockTree arbostrunkblock = new BlockTree("arbostrunkblock").setCreativeTab(CreativeTab.baked);
	public static BlockStone arbosrootblock = new BlockStone("arbosrootblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt arbostopblock = new BlockDirt("arbostopblock").setCreativeTab(CreativeTab.baked);
	public static ArbosLeafBlock arbosleafblock = new ArbosLeafBlock("arbosleafblock").setCreativeTab(CreativeTab.baked);
	public static ArbosNutCrop arbosnutcrop = new ArbosNutCrop("arbosnutcrop").setCreativeTab(CreativeTab.baked);	
	public static BlockDirt arbosnutblock = new BlockDirt("arbosnutblock").setCreativeTab(CreativeTab.baked);
	public static ArbosGreenOre arbosgreenore = new ArbosGreenOre("arbosgreenore").setCreativeTab(CreativeTab.baked);	
	public static ArbosBlueOre arbosblueore = new ArbosBlueOre("arbosblueore").setCreativeTab(CreativeTab.baked);	
	public static BlockOre arbosgreenjewelblock = new  BlockOre("arbosgreenjewelblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre arbosbluejewelblock = new  BlockOre("arbosbluejewelblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre portalbathisblock = new BlockOre("portalbathisblock").setCreativeTab(CreativeTab.baked);	
	public static BlockDirt oceanblock = new BlockDirt("oceanblock").setCreativeTab(CreativeTab.baked);
	public static BlockStone firecrabshell = new BlockStone("firecrabshell").setCreativeTab(CreativeTab.baked);
	public static BlockOre bathisleadore = new BlockOre("bathisleadore").setCreativeTab(CreativeTab.baked);
	public static BlockOre bathisleadblock = new BlockOre("bathisleadblock").setCreativeTab(CreativeTab.baked);
	public static BathisRedOre bathisredore = new BathisRedOre("bathisredore").setCreativeTab(CreativeTab.baked);
	public static BlockOre bathisredjewelblock = new  BlockOre("bathisredjewelblock").setCreativeTab(CreativeTab.baked);	
	public static BathisWeed bathisweed = new BathisWeed("bathisweed").setCreativeTab(CreativeTab.baked);
	public static OxygenWeed oxygenweed = new OxygenWeed("oxygenweed").setCreativeTab(CreativeTab.baked);
	public static WaterPearlWeed waterpearlweed = new WaterPearlWeed("waterpearlweed").setCreativeTab(CreativeTab.baked);
	public static BranchCoral branchcoral = new BranchCoral("branchcoral").setCreativeTab(CreativeTab.baked);
	public static Oyster oyster = new Oyster("oyster").setCreativeTab(CreativeTab.baked);
	public static BlockDirt bathisweedblock = new  BlockDirt("bathisweedblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre crabshellblock = new  BlockOre("crabshellblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre silvamkeyblock = new  BlockOre("silvamkeyblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre tuneablebathisblock = new  BlockOre("tuneablebathisblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre portalsilvamblock = new BlockOre("portalsilvamblock").setCreativeTab(CreativeTab.baked);	
	public static BlockStone silvamstone = new BlockStone("silvamstone").setCreativeTab(CreativeTab.baked);
	public static SilvamLeafBlock silvamleavesblocka = new SilvamLeafBlock("silvamleavesblocka").setCreativeTab(CreativeTab.baked);
	public static SilvamLeafBlock silvamleavesblockb = new SilvamLeafBlock("silvamleavesblockb").setCreativeTab(CreativeTab.baked);
	public static BlockTree silvamloga = new BlockTree("silvamloga").setCreativeTab(CreativeTab.baked);
	public static BlockTree silvamlogb = new BlockTree("silvamlogb").setCreativeTab(CreativeTab.baked);
	public static BlockDirt silvamfloor = new BlockDirt("silvamfloor").setCreativeTab(CreativeTab.baked);
	public static BlockDirt silvamunderfloor = new BlockDirt("silvamunderfloor").setCreativeTab(CreativeTab.baked);
	public static SilvamBush silvambush = new SilvamBush("silvambush").setCreativeTab(CreativeTab.baked);
	public static SilvamNest silvamnest = new SilvamNest("silvamnest").setCreativeTab(CreativeTab.baked);
	public static SilvamNestEgg silvamnestegg = new SilvamNestEgg("silvamnestegg").setCreativeTab(CreativeTab.baked);
	public static SilvamBushCrop silvambushcrop = new SilvamBushCrop("silvambushcrop").setCreativeTab(CreativeTab.baked);	
	public static SilvamYellowOre silvamyellowore = new SilvamYellowOre("silvamyellowore").setCreativeTab(CreativeTab.baked);	
	public static BlockOre silvamYellowjewelblock = new  BlockOre("silvamyellowjewelblock").setCreativeTab(CreativeTab.baked);	
	public static BlockDirt crushedflamefruit = new BlockDirt("crushedflamefruit").setCreativeTab(CreativeTab.baked);
	public static BlockOre tuneablesilvamblock = new  BlockOre("tuneablesilvamblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre insulakeyblock = new  BlockOre("insulakeyblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre portalinsulablock = new BlockOre("portalinsulablock").setCreativeTab(CreativeTab.baked);	
	public static BlockStone insulastone = new BlockStone("insulastone").setCreativeTab(CreativeTab.baked);
	public static BlockDirt insuladirt = new BlockDirt("insuladirt").setCreativeTab(CreativeTab.baked);
	public static InsulaBush insulabush = new InsulaBush("insulabush").setCreativeTab(CreativeTab.baked);
	public static BlockOre insulafossil = new BlockOre("insulafossil").setCreativeTab(CreativeTab.baked);	
	public static BlockOre insulafireblock = new BlockOre("insulafireblock").setCreativeTab(CreativeTab.baked);
	public static InsulaWhiteOre insulawhiteore = new InsulaWhiteOre("insulawhiteore").setCreativeTab(CreativeTab.baked);	
	public static InsulaBlackOre insulablackore = new InsulaBlackOre("insulablackore").setCreativeTab(CreativeTab.baked);
	public static BlockDirt insulawhitejewelblock = new BlockDirt("insulawhitejewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt insulablackjewelblock = new BlockDirt("insulablackjewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt redstonedust = new BlockDirt("redstonedust").setCreativeTab(CreativeTab.baked);
	public static BlockDirt reddirtdust = new BlockDirt("reddirtdust").setCreativeTab(CreativeTab.baked);
	public static BlockOre tuneableinsulablock = new  BlockOre("tuneableinsulablock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre caelumkeyblock = new  BlockOre("caelumkeyblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre fossilblock = new BlockOre("fossilblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre portalcaelumblock = new BlockOre("portalcaelumblock").setCreativeTab(CreativeTab.baked);	
	public static BlockStone caelumstone = new BlockStone("caelumstone").setCreativeTab(CreativeTab.baked);
	public static BlockDirt caelumdirt = new BlockDirt("caelumdirt").setCreativeTab(CreativeTab.baked);
	public static BlockOre caelumiteore = new BlockOre("caelumiteore").setCreativeTab(CreativeTab.baked);	
	public static BlockOre caelumiteblock = new BlockOre("caelumiteblock").setCreativeTab(CreativeTab.baked);
	public static CaelumPinkOre caelumpinkore = new CaelumPinkOre("caelumpinkore").setCreativeTab(CreativeTab.baked);
	public static BlockOre caelumpinkjewelblock = new BlockOre("caelumpinkjewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre caelumdenseblock = new BlockOre("caelumdenseblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt caelumdust = new BlockDirt("caelumdust").setCreativeTab(CreativeTab.baked);
	public static SkyFruitCrop skyfruitcrop = new SkyFruitCrop("skyfruitcrop").setCreativeTab(CreativeTab.baked);	
	public static BlockDirt skyfruitblock = new BlockDirt("skyfruitblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre tuneablecaelumblock = new  BlockOre("tuneablecaelumblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre monskeyblock = new  BlockOre("monskeyblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre portalmonsblock = new BlockOre("portalmonsblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre tuneablemonsblock = new  BlockOre("tuneablemonsblock").setCreativeTab(CreativeTab.baked);	
	public static BlockStone monsstone = new BlockStone("monsstone").setCreativeTab(CreativeTab.baked);
	public static BlockDirt monsdirt = new BlockDirt("monsdirt").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsheavyore = new BlockOre("monsheavyore").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsmediumore = new BlockOre("monsmediumore").setCreativeTab(CreativeTab.baked);
	public static BlockOre monslightore = new BlockOre("monslightore").setCreativeTab(CreativeTab.baked);
	public static MonsRainbowOre monsrainbowore = new MonsRainbowOre("monsrainbowore").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsrainbowjewelblock = new BlockOre("monsrainbowjewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsheavyblock = new BlockOre("monsheavyblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsmediumblock = new BlockOre("monsmediumblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre monslightblock = new BlockOre("monslightblock").setCreativeTab(CreativeTab.baked);
	public static BlockDirt monsdust = new BlockDirt("monsdust").setCreativeTab(CreativeTab.baked);
	public static BlockOre monseaglestone = new BlockOre("monseaglestone").setCreativeTab(CreativeTab.baked);
	public static BlockOre monseagleblock = new BlockOre("monseagleblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsnitre = new BlockOre("monsnitre").setCreativeTab(CreativeTab.baked);
	public static BlockOre monsmagma = new BlockOre("monsmagma").setCreativeTab(CreativeTab.baked);
	public static BlockOre coletuskeyblock = new  BlockOre("coletuskeyblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre portalcoletusblock = new BlockOre("portalcoletusblock").setCreativeTab(CreativeTab.baked);	
	public static BlockOre coletusfireblock = new BlockOre("coletusfireblock").setCreativeTab(CreativeTab.baked);
	public static BlockStone coletusstone = new BlockStone("coletusstone").setCreativeTab(CreativeTab.baked);
	public static BlockDirt coletusdust = new BlockDirt("coletusdust").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomstem1 = new BlockPlant("mushroomstem1").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomtop1 = new BlockPlant("mushroomtop1").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomstem2 = new BlockPlant("mushroomstem2").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomtop2 = new BlockPlant("mushroomtop2").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomtop3 = new BlockPlant("mushroomtop3").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomtop4 = new BlockPlant("mushroomtop4").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomstem3 = new BlockPlant("mushroomstem3").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomstem4 = new BlockPlant("mushroomstem4").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomstem5 = new BlockPlant("mushroomstem5").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomtop5 = new BlockPlant("mushroomtop5").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomspore1 = new BlockPlant("mushroomspore1").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomspore2 = new BlockPlant("mushroomspore2").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomspore1block = new BlockPlant("mushroomspore1block").setCreativeTab(CreativeTab.baked);
	public static BlockPlant mushroomspore2block = new BlockPlant("mushroomspore2block").setCreativeTab(CreativeTab.baked);
	public static BlockOre coletusorangejewelblock = new BlockOre("coletusorangejewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre tuneablecoletusblock = new  BlockOre("tuneablecoletusblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre coletusboneblock = new BlockOre("coletusboneblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre friguskeyblock = new  BlockOre("friguskeyblock").setCreativeTab(CreativeTab.baked);	
	
	public static BlockOre frigusfireblock = new  BlockOre("frigusfireblock").setCreativeTab(CreativeTab.baked);
	public static BlockOre portalfrigusblock = new BlockOre("portalfrigusblock").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock1 = new BlockIce("iceblock1").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock2 = new BlockIce("iceblock2").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock3 = new BlockIce("iceblock3").setCreativeTab(CreativeTab.baked);
	public static IceCrystal iceblock4 = new IceCrystal("iceblock4").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock5 = new BlockIce("iceblock5").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock6 = new BlockIce("iceblock6").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock7 = new BlockIce("iceblock7").setCreativeTab(CreativeTab.baked);
	public static BlockIce iceblock8 = new BlockIce("iceblock8").setCreativeTab(CreativeTab.baked);
	public static Iceplant iceplant = new Iceplant("iceplant").setCreativeTab(CreativeTab.baked);
	public static BlockIce icejewelblock = new BlockIce("icejewelblock").setCreativeTab(CreativeTab.baked);
	public static BlockIce icystrandblock = new BlockIce("icystrandblock").setCreativeTab(CreativeTab.baked);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
			
				safelight,
				speaker,
				safedoor,
				safefloor,
				rubberwall,
				returnblock,
				mobheartblock,
				noteiumblock,
				bakeddirt,
				bakedclinker,
				bakedstone,
				bakedcactus,
				lichenblock,				
				lavastone,
				waterstone,
				enderblock,
				portalblock,
				infusedcoalblock,
				superinfusedcoalblock,
				megainfusedcoalblock,
				arbosnutdust,
				jeweldust,
				jewelblock,
				inertmagma,
				driedeggblock,
				eggshellblock,
				flamefruitblock,
				rottenblock,
				piratebeacon,
				trollblock,
				portalhomeworldblock,
				
				portalarbosblock,
				arbostrunkblock,
				arbosleafblock,
				arbosrootblock,
				arbostopblock,
				arbosnutcrop,
				arbosnutblock,
				arbosgreenore,
				arbosblueore,
				arbosgreenjewelblock,
				arbosbluejewelblock,
				 				
				portalbathisblock,
				oceanblock,
				firecrabshell,
				bathisleadore,
				bathisleadblock,
				bathisredore,
				bathisredjewelblock,
				bathisweed,
				oxygenweed,
				waterpearlweed,
				branchcoral,
				oyster,
				bathisweedblock,
				crabshellblock,
				silvamkeyblock,
				tuneablebathisblock,
				
				portalsilvamblock,
				silvamstone,
				silvamleavesblocka,
				silvamleavesblockb,
				silvamloga,
				silvamlogb,
				silvamfloor,
				silvamunderfloor,
				silvambush,
				silvamnest,
				silvamnestegg,
				silvambushcrop,
				silvamyellowore,
				silvamYellowjewelblock,
				crushedflamefruit,
				tuneablesilvamblock,
				insulakeyblock,
				
				portalinsulablock,
				insulastone,
				insuladirt,
				insulabush,
				insulafossil,
				insulafireblock,
				insulawhiteore,
				insulablackore,
				insulawhitejewelblock,
				insulablackjewelblock,
				redstonedust,
				reddirtdust,
				fossilblock,
				tuneableinsulablock,
				caelumkeyblock,
				
				portalcaelumblock,
				caelumstone,
				caelumdirt,
				caelumiteore,
				caelumiteblock,
			  	caelumpinkore,
				caelumpinkjewelblock,
				caelumdenseblock,
				caelumdust,
				skyfruitcrop,
				skyfruitblock,
				tuneablecaelumblock,
				monskeyblock,
				
				portalmonsblock,
				tuneablemonsblock,
				monsstone,
				monsdirt,
				monsheavyore,
				monsmediumore,
				monslightore,
				monsrainbowore,
				monsrainbowjewelblock,
				monsheavyblock,
				monsmediumblock,
				monslightblock,
				monsdust,
				monseaglestone,
				monseagleblock,
				monsnitre,
				monsmagma,
				coletuskeyblock,
				
				portalcoletusblock,
				coletusfireblock,
				coletusstone,
				coletusdust,
				mushroomstem1,
				mushroomtop1,
				mushroomstem2,
				mushroomtop2,
				mushroomtop3,
				mushroomtop4,
				mushroomstem3,
				mushroomstem4,
				mushroomstem5,
				mushroomtop5,
				mushroomspore1,
				mushroomspore2,
				mushroomspore1block,
				mushroomspore2block,
				coletusorangejewelblock,
				tuneablecoletusblock,
				coletusboneblock,
				friguskeyblock,
				
				frigusfireblock,
				iceblock1,
				iceblock2,
				iceblock3,
				iceblock4,
				iceblock5,
				iceblock6,
				iceblock7,
				iceblock8,
				iceplant,
				icejewelblock,
				icystrandblock,
				portalfrigusblock
				
				
		);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
			
				safelight.createItemBlock(),
				speaker.createItemBlock(),
				safedoor.createItemBlock(),
				safefloor.createItemBlock(),
				rubberwall.createItemBlock(),
				returnblock.createItemBlock(),
				mobheartblock.createItemBlock(),
				noteiumblock.createItemBlock(),
				bakeddirt.createItemBlock(),
				bakedclinker.createItemBlock(),
				bakedstone.createItemBlock(),
				bakedcactus.createItemBlock(),
				lichenblock.createItemBlock(),				
				lavastone.createItemBlock(),
				waterstone.createItemBlock(),
				enderblock.createItemBlock(),
				portalblock.createItemBlock(),
				infusedcoalblock.createItemBlock(),
				superinfusedcoalblock.createItemBlock(),
				megainfusedcoalblock.createItemBlock(),
				arbosnutdust.createItemBlock(),
				jeweldust.createItemBlock(),
				jewelblock.createItemBlock(),
				inertmagma.createItemBlock(),
				driedeggblock.createItemBlock(),
				eggshellblock.createItemBlock(),
				flamefruitblock.createItemBlock(),
				rottenblock.createItemBlock(),
				piratebeacon.createItemBlock(),
				trollblock.createItemBlock(),
				portalhomeworldblock.createItemBlock(),
				
				portalarbosblock.createItemBlock(),
				arbostrunkblock.createItemBlock(),
				arbosleafblock.createItemBlock(),
				arbosrootblock.createItemBlock(),
				arbostopblock.createItemBlock(),
				arbosnutblock.createItemBlock(),
				arbosgreenore.createItemBlock(),
				arbosblueore.createItemBlock(),
				arbosgreenjewelblock.createItemBlock(),
				arbosbluejewelblock.createItemBlock(),
				
				portalbathisblock.createItemBlock(),
				oceanblock.createItemBlock(),
				firecrabshell.createItemBlock(),
				bathisleadore.createItemBlock(),
				bathisleadblock.createItemBlock(),
				bathisredore.createItemBlock(),
				bathisredjewelblock.createItemBlock(),
				bathisweed.createItemBlock(),
				oxygenweed.createItemBlock(),				
				waterpearlweed.createItemBlock(),
				branchcoral.createItemBlock(),
				oyster.createItemBlock(),
				bathisweedblock.createItemBlock(),
				crabshellblock.createItemBlock(),
				silvamkeyblock.createItemBlock(),
				tuneablebathisblock.createItemBlock(),
				
				portalsilvamblock.createItemBlock(),
				silvamstone.createItemBlock(),
				silvamleavesblocka.createItemBlock(),
				silvamleavesblockb.createItemBlock(),
				silvamloga.createItemBlock(),
				silvamlogb.createItemBlock(),
				silvamfloor.createItemBlock(),
				silvamunderfloor.createItemBlock(),
				silvambush.createItemBlock(),
				silvamnest.createItemBlock(),
				silvamnestegg.createItemBlock(),
				silvamyellowore.createItemBlock(),
				silvamYellowjewelblock.createItemBlock(),
				crushedflamefruit.createItemBlock(),
				tuneablesilvamblock.createItemBlock(),
				insulakeyblock.createItemBlock(),
				
				portalinsulablock.createItemBlock(),
				insulastone.createItemBlock(),
				insuladirt.createItemBlock(),
				insulabush.createItemBlock(),
				insulafossil.createItemBlock(),
				insulafireblock.createItemBlock(),
				insulawhiteore.createItemBlock(),
				insulablackore.createItemBlock(),
				insulawhitejewelblock.createItemBlock(),
				insulablackjewelblock.createItemBlock(),
				redstonedust.createItemBlock(),
				reddirtdust.createItemBlock(),
				fossilblock.createItemBlock(),
				tuneableinsulablock.createItemBlock(),
				caelumkeyblock.createItemBlock(),
				
				portalcaelumblock.createItemBlock(),
				caelumstone.createItemBlock(),
				caelumdirt.createItemBlock(),
				caelumiteore.createItemBlock(),
				caelumiteblock.createItemBlock(),
		 		caelumpinkore.createItemBlock(),
				caelumpinkjewelblock.createItemBlock(),
				caelumdenseblock.createItemBlock(),
				caelumdust.createItemBlock(),
				skyfruitblock.createItemBlock(),
				tuneablecaelumblock.createItemBlock(),
				monskeyblock.createItemBlock(),
				
				portalmonsblock.createItemBlock(),
				tuneablemonsblock.createItemBlock(),				
				monsstone.createItemBlock(),
				monsdirt.createItemBlock(),
				monsheavyore.createItemBlock(),
				monsmediumore.createItemBlock(),
				monslightore.createItemBlock(),
				monsrainbowore.createItemBlock(),
				monsrainbowjewelblock.createItemBlock(),
				monsheavyblock.createItemBlock(),
				monsmediumblock.createItemBlock(),
				monslightblock.createItemBlock(),
				monsdust.createItemBlock(),
				monseaglestone.createItemBlock(),
				monseagleblock.createItemBlock(),
				monsnitre.createItemBlock(),				
				monsmagma.createItemBlock(),
				coletuskeyblock.createItemBlock(),
				
				portalcoletusblock.createItemBlock(),
				coletusfireblock.createItemBlock(),
				coletusstone.createItemBlock(),
				coletusdust.createItemBlock(),
				mushroomstem1.createItemBlock(),
				mushroomtop1.createItemBlock(),
				mushroomstem2.createItemBlock(),
				mushroomtop2.createItemBlock(),
				mushroomtop3.createItemBlock(),
				mushroomtop4.createItemBlock(),
				mushroomstem3.createItemBlock(),
				mushroomstem4.createItemBlock(),
				mushroomstem5.createItemBlock(),
				mushroomtop5.createItemBlock(),
				mushroomspore1.createItemBlock(),
				mushroomspore2.createItemBlock(),
				mushroomspore1block.createItemBlock(),
				mushroomspore2block.createItemBlock(),
				coletusorangejewelblock.createItemBlock(),
				tuneablecoletusblock.createItemBlock(),
				coletusboneblock.createItemBlock(),
				friguskeyblock.createItemBlock(),
				
				frigusfireblock.createItemBlock(),
				iceblock1.createItemBlock(),
				iceblock2.createItemBlock(),
				iceblock3.createItemBlock(),
				iceblock4.createItemBlock(),
				iceblock5.createItemBlock(),
				iceblock6.createItemBlock(),
				iceblock7.createItemBlock(),
				iceblock8.createItemBlock(),
				iceplant.createItemBlock(),
				icejewelblock.createItemBlock(),
				icystrandblock.createItemBlock(),
				portalfrigusblock.createItemBlock()
		);
	}
	
	public static void registerModels() {
		
		safelight.registerItemModel(Item.getItemFromBlock(safelight));
		speaker.registerItemModel(Item.getItemFromBlock(speaker));
		safedoor.registerItemModel(Item.getItemFromBlock(safedoor));
		safefloor.registerItemModel(Item.getItemFromBlock(safefloor));
		rubberwall.registerItemModel(Item.getItemFromBlock(rubberwall));
		returnblock.registerItemModel(Item.getItemFromBlock(returnblock));
		mobheartblock.registerItemModel(Item.getItemFromBlock(mobheartblock));
		noteiumblock.registerItemModel(Item.getItemFromBlock(noteiumblock));
		bakeddirt.registerItemModel(Item.getItemFromBlock(bakeddirt));
		bakedclinker.registerItemModel(Item.getItemFromBlock(bakedclinker));
		bakedstone.registerItemModel(Item.getItemFromBlock(bakedstone));
		bakedcactus.registerItemModel(Item.getItemFromBlock(bakedcactus));
		lichenblock.registerItemModel(Item.getItemFromBlock(lichenblock));		
		lavastone.registerItemModel(Item.getItemFromBlock(lavastone));
		waterstone.registerItemModel(Item.getItemFromBlock(waterstone));
		enderblock.registerItemModel(Item.getItemFromBlock(enderblock));
		portalblock.registerItemModel(Item.getItemFromBlock(portalblock));
		infusedcoalblock.registerItemModel(Item.getItemFromBlock(infusedcoalblock));
		superinfusedcoalblock.registerItemModel(Item.getItemFromBlock(superinfusedcoalblock));
		megainfusedcoalblock.registerItemModel(Item.getItemFromBlock(megainfusedcoalblock));
		arbosnutdust.registerItemModel(Item.getItemFromBlock(arbosnutdust));
		jeweldust.registerItemModel(Item.getItemFromBlock(jeweldust));
		jewelblock.registerItemModel(Item.getItemFromBlock(jewelblock));
		inertmagma.registerItemModel(Item.getItemFromBlock(inertmagma));
		driedeggblock.registerItemModel(Item.getItemFromBlock(driedeggblock));
		eggshellblock.registerItemModel(Item.getItemFromBlock(eggshellblock));
		flamefruitblock.registerItemModel(Item.getItemFromBlock(flamefruitblock));
		rottenblock.registerItemModel(Item.getItemFromBlock(rottenblock));
		piratebeacon.registerItemModel(Item.getItemFromBlock(piratebeacon));
		trollblock.registerItemModel(Item.getItemFromBlock(trollblock));
		portalhomeworldblock.registerItemModel(Item.getItemFromBlock(portalhomeworldblock));
		
		portalarbosblock.registerItemModel(Item.getItemFromBlock(portalarbosblock));
		arbostrunkblock.registerItemModel(Item.getItemFromBlock(arbostrunkblock));
		arbosleafblock.registerItemModel(Item.getItemFromBlock(arbosleafblock));
		arbosrootblock.registerItemModel(Item.getItemFromBlock(arbosrootblock));
		arbostopblock.registerItemModel(Item.getItemFromBlock(arbostopblock));
		arbosnutblock.registerItemModel(Item.getItemFromBlock(arbosnutblock));
		arbosgreenore.registerItemModel(Item.getItemFromBlock(arbosgreenore));
		arbosblueore.registerItemModel(Item.getItemFromBlock(arbosblueore));
		arbosgreenjewelblock.registerItemModel(Item.getItemFromBlock(arbosgreenjewelblock));
		arbosbluejewelblock.registerItemModel(Item.getItemFromBlock(arbosbluejewelblock));
		
		portalbathisblock.registerItemModel(Item.getItemFromBlock(portalbathisblock));
		oceanblock.registerItemModel(Item.getItemFromBlock(oceanblock));
		firecrabshell.registerItemModel(Item.getItemFromBlock(firecrabshell));
		bathisleadore.registerItemModel(Item.getItemFromBlock(bathisleadore));
		bathisleadblock.registerItemModel(Item.getItemFromBlock(bathisleadblock));
		bathisredore.registerItemModel(Item.getItemFromBlock(bathisredore));
		bathisredjewelblock.registerItemModel(Item.getItemFromBlock(bathisredjewelblock));
		
		// bathisweed is underwater plant, so uses material water + overrides.
		bathisweed.registerItemModel(Item.getItemFromBlock(bathisweed));		
		ModelLoader.setCustomStateMapper(ModBlocks.bathisweed, new StateMap.Builder().ignore(BlockLiquid.LEVEL).build());
		
		// oxygenweed is underwater plant, so uses material water + overrides.
		oxygenweed.registerItemModel(Item.getItemFromBlock(oxygenweed));		
		ModelLoader.setCustomStateMapper(ModBlocks.oxygenweed, new StateMap.Builder().ignore(BlockLiquid.LEVEL).build());
		
		// waterpearlweed is underwater plant, so uses material water + overrides.
		waterpearlweed.registerItemModel(Item.getItemFromBlock(waterpearlweed));
		ModelLoader.setCustomStateMapper(ModBlocks.waterpearlweed, new StateMap.Builder().ignore(BlockLiquid.LEVEL).build());
		
		// branchcoral is underwater plant, so uses material water + overrides.
		branchcoral.registerItemModel(Item.getItemFromBlock(branchcoral));
		ModelLoader.setCustomStateMapper(ModBlocks.branchcoral, new StateMap.Builder().ignore(BlockLiquid.LEVEL).build());
		
		// oyster is underwater block, so uses material water + overrides.
		oyster.registerItemModel(Item.getItemFromBlock(oyster));
		ModelLoader.setCustomStateMapper(ModBlocks.oyster, new StateMap.Builder().ignore(BlockLiquid.LEVEL).build());
		
		bathisweedblock.registerItemModel(Item.getItemFromBlock(bathisweedblock));
		crabshellblock.registerItemModel(Item.getItemFromBlock(crabshellblock));
		silvamkeyblock.registerItemModel(Item.getItemFromBlock(silvamkeyblock)); 
		tuneablebathisblock.registerItemModel(Item.getItemFromBlock(tuneablebathisblock));                                                                                        
		
		
		portalsilvamblock.registerItemModel(Item.getItemFromBlock(portalsilvamblock));
		silvamstone.registerItemModel(Item.getItemFromBlock(silvamstone));
		silvamleavesblocka.registerItemModel(Item.getItemFromBlock(silvamleavesblocka));
		silvamleavesblockb.registerItemModel(Item.getItemFromBlock(silvamleavesblockb));
		silvamloga.registerItemModel(Item.getItemFromBlock(silvamloga));
		silvamlogb.registerItemModel(Item.getItemFromBlock(silvamlogb));
		silvamfloor.registerItemModel(Item.getItemFromBlock(silvamfloor));
		silvamunderfloor.registerItemModel(Item.getItemFromBlock(silvamunderfloor));
		silvambush.registerItemModel(Item.getItemFromBlock(silvambush));
		silvamnest.registerItemModel(Item.getItemFromBlock(silvamnest));
		silvamnestegg.registerItemModel(Item.getItemFromBlock(silvamnestegg));
		silvamyellowore.registerItemModel(Item.getItemFromBlock(silvamyellowore));
		silvamYellowjewelblock.registerItemModel(Item.getItemFromBlock(silvamYellowjewelblock));
		crushedflamefruit.registerItemModel(Item.getItemFromBlock(crushedflamefruit));
		tuneablesilvamblock.registerItemModel(Item.getItemFromBlock(tuneablesilvamblock));  
		insulakeyblock.registerItemModel(Item.getItemFromBlock(insulakeyblock)); 
		
		portalinsulablock.registerItemModel(Item.getItemFromBlock(portalinsulablock));
		insulastone.registerItemModel(Item.getItemFromBlock(insulastone));
		insuladirt.registerItemModel(Item.getItemFromBlock(insuladirt));
		insulabush.registerItemModel(Item.getItemFromBlock(insulabush));
		insulafossil.registerItemModel(Item.getItemFromBlock(insulafossil));
		insulafireblock.registerItemModel(Item.getItemFromBlock(insulafireblock));
		insulawhiteore.registerItemModel(Item.getItemFromBlock(insulawhiteore));
		insulablackore.registerItemModel(Item.getItemFromBlock(insulablackore));
		insulawhitejewelblock.registerItemModel(Item.getItemFromBlock(insulawhitejewelblock));
		insulablackjewelblock.registerItemModel(Item.getItemFromBlock(insulablackjewelblock));
		redstonedust.registerItemModel(Item.getItemFromBlock(redstonedust));
		reddirtdust.registerItemModel(Item.getItemFromBlock(reddirtdust));
		fossilblock.registerItemModel(Item.getItemFromBlock(fossilblock));
		tuneableinsulablock.registerItemModel(Item.getItemFromBlock(tuneableinsulablock));
		caelumkeyblock.registerItemModel(Item.getItemFromBlock(caelumkeyblock));
		
		portalcaelumblock.registerItemModel(Item.getItemFromBlock(portalcaelumblock));
		caelumstone.registerItemModel(Item.getItemFromBlock(caelumstone));
		caelumdirt.registerItemModel(Item.getItemFromBlock(caelumdirt));
		caelumiteore.registerItemModel(Item.getItemFromBlock(caelumiteore));
		caelumiteblock.registerItemModel(Item.getItemFromBlock(caelumiteblock));
		caelumpinkore.registerItemModel(Item.getItemFromBlock(caelumpinkore));
		caelumpinkjewelblock.registerItemModel(Item.getItemFromBlock(caelumpinkjewelblock));
		caelumdenseblock.registerItemModel(Item.getItemFromBlock(caelumdenseblock));
		caelumdust.registerItemModel(Item.getItemFromBlock(caelumdust));
		skyfruitblock.registerItemModel(Item.getItemFromBlock(skyfruitblock));
		tuneablecaelumblock.registerItemModel(Item.getItemFromBlock(tuneablecaelumblock));
		monskeyblock.registerItemModel(Item.getItemFromBlock(monskeyblock));
		
		portalmonsblock.registerItemModel(Item.getItemFromBlock(portalmonsblock));
		tuneablemonsblock.registerItemModel(Item.getItemFromBlock(tuneablemonsblock));		
		monsstone.registerItemModel(Item.getItemFromBlock(monsstone));
		monsdirt.registerItemModel(Item.getItemFromBlock(monsdirt));
		monsheavyore.registerItemModel(Item.getItemFromBlock(monsheavyore));
		monsmediumore.registerItemModel(Item.getItemFromBlock(monsmediumore));
		monslightore.registerItemModel(Item.getItemFromBlock(monslightore));
		monsrainbowore.registerItemModel(Item.getItemFromBlock(monsrainbowore));
		monsrainbowjewelblock.registerItemModel(Item.getItemFromBlock(monsrainbowjewelblock));
		monsheavyblock.registerItemModel(Item.getItemFromBlock(monsheavyblock));
		monsmediumblock.registerItemModel(Item.getItemFromBlock(monsmediumblock));
		monslightblock.registerItemModel(Item.getItemFromBlock(monslightblock));
		monsdust.registerItemModel(Item.getItemFromBlock(monsdust));
		monseaglestone.registerItemModel(Item.getItemFromBlock(monseaglestone));
		monseagleblock.registerItemModel(Item.getItemFromBlock(monseagleblock));
		monsnitre.registerItemModel(Item.getItemFromBlock(monsnitre));
		monsmagma.registerItemModel(Item.getItemFromBlock(monsmagma));
		coletuskeyblock.registerItemModel(Item.getItemFromBlock(coletuskeyblock));
		
		portalcoletusblock.registerItemModel(Item.getItemFromBlock(portalcoletusblock));
		coletusfireblock.registerItemModel(Item.getItemFromBlock(coletusfireblock));
		coletusstone.registerItemModel(Item.getItemFromBlock(coletusstone));
		coletusdust.registerItemModel(Item.getItemFromBlock(coletusdust));
		mushroomstem1.registerItemModel(Item.getItemFromBlock(mushroomstem1));
		mushroomtop1.registerItemModel(Item.getItemFromBlock(mushroomtop1));
		mushroomstem2.registerItemModel(Item.getItemFromBlock(mushroomstem2));
		mushroomtop2.registerItemModel(Item.getItemFromBlock(mushroomtop2));
		mushroomtop3.registerItemModel(Item.getItemFromBlock(mushroomtop3));
		mushroomtop4.registerItemModel(Item.getItemFromBlock(mushroomtop4));
		mushroomstem3.registerItemModel(Item.getItemFromBlock(mushroomstem3));
		mushroomstem4.registerItemModel(Item.getItemFromBlock(mushroomstem4));
		mushroomstem5.registerItemModel(Item.getItemFromBlock(mushroomstem5));
		mushroomtop5.registerItemModel(Item.getItemFromBlock(mushroomtop5));
		mushroomspore1.registerItemModel(Item.getItemFromBlock(mushroomspore1));
		mushroomspore2.registerItemModel(Item.getItemFromBlock(mushroomspore2));
		mushroomspore1block.registerItemModel(Item.getItemFromBlock(mushroomspore1block));
		mushroomspore2block.registerItemModel(Item.getItemFromBlock(mushroomspore2block));
		coletusorangejewelblock.registerItemModel(Item.getItemFromBlock(coletusorangejewelblock));
		tuneablecoletusblock.registerItemModel(Item.getItemFromBlock(tuneablecoletusblock));		
		coletusboneblock.registerItemModel(Item.getItemFromBlock(coletusboneblock));
		friguskeyblock.registerItemModel(Item.getItemFromBlock(friguskeyblock));
		
		frigusfireblock.registerItemModel(Item.getItemFromBlock(frigusfireblock));
		iceblock1.registerItemModel(Item.getItemFromBlock(iceblock1));	
		iceblock2.registerItemModel(Item.getItemFromBlock(iceblock2));
		iceblock3.registerItemModel(Item.getItemFromBlock(iceblock3));
		iceblock4.registerItemModel(Item.getItemFromBlock(iceblock4));
		iceblock5.registerItemModel(Item.getItemFromBlock(iceblock5));
		iceblock6.registerItemModel(Item.getItemFromBlock(iceblock6));
		iceblock7.registerItemModel(Item.getItemFromBlock(iceblock7));
		iceblock8.registerItemModel(Item.getItemFromBlock(iceblock8));
		iceplant.registerItemModel(Item.getItemFromBlock(iceplant));
		icejewelblock.registerItemModel(Item.getItemFromBlock(icejewelblock));
		icystrandblock.registerItemModel(Item.getItemFromBlock(icystrandblock));
		portalfrigusblock.registerItemModel(Item.getItemFromBlock(portalfrigusblock));
		
	}
		
} 
