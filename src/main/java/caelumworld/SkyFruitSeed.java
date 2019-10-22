package caelumworld;

import main.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class SkyFruitSeed extends ItemSeeds  {

	
	protected String name;
	
	public SkyFruitSeed(Block crops, Block soil, String name) {
		super(ModBlocks.skyfruitcrop, ModBlocks.caelumdirt);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(Item item) {
		main.baked.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public SkyFruitSeed setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	

}
