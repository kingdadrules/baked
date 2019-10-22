package silvamworld;

import java.util.ArrayList;
import java.util.Random;

import javax.annotation.Nullable;

import main.ModBlocks;
import main.ModItems;
import main.baked;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SilvamBush extends BlockBush {

	protected String name;
	
	public SilvamBush(String name) {
		super(Material.GRASS);
		setHardness(2.0f);
        setResistance(10.0f);
        setHarvestLevel("shovel", 2); 
        this.name = name;
    	
		setUnlocalizedName(name);
		setRegistryName(name);
   	}
	
	@Override 
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune){
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		
		drops.add(new ItemStack(ModItems.silvamflamefruit, 1));
		Random r2 = new Random();
		float chance2 = r2.nextFloat();
		if (chance2 <= 0.1f) {
			drops.add(new ItemStack(ModItems.silvambushseed, 1));
		}
				
		
		return drops;
		}
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos){
		return true;			
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == ModBlocks.silvamfloor || state.getBlock() == ModBlocks.silvamlogb;
    }

		
	public void registerItemModel(Item itemBlock) {
		baked.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.GRASS.getSoundType();
    }
		
	@Override
	public SilvamBush setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
