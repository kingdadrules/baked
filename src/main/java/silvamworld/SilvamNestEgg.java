package silvamworld;

import java.util.ArrayList;
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
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SilvamNestEgg extends BlockBase {
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 14, 0.0625 * 7, 0.0625 * 14);

	public SilvamNestEgg(String name) {
		super(Material.WOOD, name);
		setHardness(2.0f);
        setResistance(8.0f);
        setHarvestLevel("shovel", 2); 
        //setBlockBounds()
        //this.setSize(0.6F, 1.95F)
	}
	
		
	@Override 
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		
		Random r = new Random();
		float chance = r.nextFloat();
		if (chance <= 0.5f) {
			drops.add(new ItemStack(ModItems.bakedstick, 1));
		} else {
			drops.add(new ItemStack(ModItems.bakedstick, 2));
		}
		drops.add(new ItemStack(ModItems.silvamegg, 1));		
		
		return drops;
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
	@SuppressWarnings("deprecation")
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
	public SilvamNestEgg setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
