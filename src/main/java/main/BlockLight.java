package main;

import net.minecraft.block.BlockGlowstone;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockLight extends BlockGlowstone {

	protected String name;

	public BlockLight(Material material, String name) {
		super(Material.ROCK);
	
		this.name = name;
	
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setHardness(-1.0f);
        setResistance(25.0f);
        setHarvestLevel("Not going to happen", 3); 
	}
	
	@Deprecated
    public int getLightValue(IBlockState state)
    {
        return 15;
    }
	
	public void registerItemModel(Item itemBlock) {
		baked.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public BlockLight setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}