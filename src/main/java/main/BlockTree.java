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

public class BlockTree extends BlockBase {

	public BlockTree(String name) {
		super(Material.WOOD, name);
		setHardness(2.0f);
        setResistance(10.0f);
        setHarvestLevel("shovel", 1); 
        

	}
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.ACACIA_DOOR.getSoundType();
    }
	
	@Override
	public BlockTree setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
