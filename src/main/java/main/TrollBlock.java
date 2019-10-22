package main;

import java.util.Random;

import javax.annotation.Nullable;

import main.BlockBase;
import main.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class TrollBlock extends BlockBase {

	public TrollBlock(String name) {
		super(Material.ROCK, name);
		setHardness(3.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 3); 
   	}
	public Item getItemDropped(IBlockState state, Random random, int i2 ){
		return ModItems.algae;
	}
	public int quantityDropped(Random random){
		return 0;
	}
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.REDSTONE_ORE.getSoundType();
    }
	
	@Override
	public TrollBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}