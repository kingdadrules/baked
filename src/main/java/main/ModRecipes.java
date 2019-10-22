package main;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.bakedclinker, new ItemStack(ModItems.clinker), 0.5f);
		GameRegistry.addSmelting(ModBlocks.lavastone, new ItemStack(Items.FLINT,3), 0.75f);
		GameRegistry.addSmelting(Items.LAVA_BUCKET, new ItemStack(Items.FLINT,3), 0.75f);
		GameRegistry.addSmelting(ModBlocks.waterstone, new ItemStack(ModItems.waterpearl), 0.75f);
		GameRegistry.addSmelting(ModBlocks.bathisleadore, new ItemStack(ModItems.bathisleadingot), 0.75f);
		GameRegistry.addSmelting(ModBlocks.rottenblock, new ItemStack(Items.LEATHER), 0.75f);
		GameRegistry.addSmelting(ModBlocks.silvamloga, new ItemStack(Items.COAL), 0.75f);
		GameRegistry.addSmelting(ModBlocks.silvamlogb, new ItemStack(Items.COAL,2), 0.75f);
		GameRegistry.addSmelting(ModItems.insulaplate, new ItemStack(ModItems.insulaplatebaked), 0.75f);
		GameRegistry.addSmelting(ModItems.fossilnetherstar, new ItemStack(ModItems.bakednetherstar), 0.75f);
		GameRegistry.addSmelting(ModBlocks.caelumiteore, new ItemStack(ModItems.caelumitenugget), 0.75f);
		
	}

}
