package silvamworld;

import java.util.Random;

import javax.annotation.Nullable;

import main.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SilvamBushCrop extends BlockCrops {

	protected String name;

	public SilvamBushCrop(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	public Item getSeed() {
		return ModItems.silvambushseed;
	}
	
	@Override
	public Item getCrop() {
		return ModItems.silvamflamefruit;
	}
		
	// Always return only 1 seed, plus 1 crop if plant is mature.
	@Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {       
        int age = getAge(state);        
		drops.add(new ItemStack(this.getSeed(), 1, 0));
		if (age >= 7) {    
			drops.add(new ItemStack(this.getCrop(), 1, 0));
		}
		Random r2 = new Random();
		float chance2 = r2.nextFloat();
		if (chance2 <= 0.05f) {
			drops.add(new ItemStack(this.getSeed(), 1, 0)); /// Bonus seed 1 in 20 times.
		}
    }
	
	@Override
    public int getBonemealAgeIncrease(World worldIn)
    {
        return 2;
    }
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.GRASS.getSoundType();
    }
	
	@Override
	public SilvamBushCrop setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}


}
