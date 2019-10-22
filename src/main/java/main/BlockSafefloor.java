package main;

import javax.annotation.Nullable;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockSafefloor extends BlockBase {

	public BlockSafefloor(String name) {
		super(Material.ROCK, name);
		setHardness(-1.0f);
        setResistance(25.0f);
        setHarvestLevel("Totally loony proof", 3); 

	}
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.REDSTONE_ORE.getSoundType();
    }
	
	@Override
	public BlockSafefloor setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
