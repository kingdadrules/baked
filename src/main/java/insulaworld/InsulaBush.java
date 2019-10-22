package insulaworld;

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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InsulaBush extends BlockBush {

	protected String name;
	
	public InsulaBush(String name) {
		super(Material.GRASS);
		setHardness(2.0f);
        setResistance(15.0f);
        setHarvestLevel("shovel", 2); 
        this.name = name;
    	
		setUnlocalizedName(name);
		setRegistryName(name);
   	}
	
	public Item getItemDropped(IBlockState state, Random random, int i2 ){
		return ModItems.insulatwigs;
	}
	public int quantityDropped(){		
		return 1; 
	}	
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos){
		return true;			
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == ModBlocks.insuladirt;
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
	public InsulaBush setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
