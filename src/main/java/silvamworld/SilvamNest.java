package silvamworld;

import java.util.List;
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
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SilvamNest extends BlockBase {
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 14, 0.0625 * 5, 0.0625 * 14);

	public SilvamNest(String name) {
		super(Material.WOOD, name);
		setHardness(2.0f);
        setResistance(8.0f);
        setHarvestLevel("shovel", 2); 
	}
		
	public Item getItemDropped(IBlockState state, Random random, int i2 ){
		return ModItems.bakedstick;
	}
	public int quantityDropped(Random random){
		//Random r = new Random();
		return random.nextInt(1) + 2; 
	}
	
	@Override	
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override	
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source,
			BlockPos pos) {
		// TODO Auto-generated method stub
		return BOX_BOUNDING;
	}
	
	//@SuppressWarnings("deprecation")
	@Override
	public void addCollisionBoxToList(IBlockState state, World worldIn,
			BlockPos pos, AxisAlignedBB entityBox,
			List<AxisAlignedBB> collidingBoxes, Entity entityIn,
			boolean p_185477_7_) {
		// TODO Auto-generated method stub
		super.addCollisionBoxToList(pos, entityBox, collidingBoxes, BOX_BOUNDING);
	}
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.PLANKS.getSoundType();
    }

	
	@Override
	public SilvamNest setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
