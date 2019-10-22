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

public class BlockStone extends BlockBase {

	public BlockStone(String name) {
		super(Material.ROCK, name);
		setHardness(3.0f);
        setResistance(15.0f);
        setHarvestLevel("pickaxe", 0); 

	}
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.STONE.getSoundType();
    }
	
	@Override
	public BlockStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
