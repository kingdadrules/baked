package bathisworld;

import java.util.Random;

import javax.annotation.Nullable;

import main.ModBlocks;
import main.ModItems;
import main.baked;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BathisWeed extends BlockBush {

	protected String name;
	
	public BathisWeed(String name) {
		super(Material.WATER);
		setHardness(1.2f);
        setResistance(1.5f);
        setHarvestLevel("shovel", 2); 
        this.name = name;
    	
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setDefaultState(blockState.getBaseState().withProperty(BlockLiquid.LEVEL, 15));
		
   	}
	
	@Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {       
        
		Random r1 = new Random();
		float chance1 = r1.nextFloat();
		if (chance1 <= 0.7f) {
			drops.add(new ItemStack(ModItems.algae, 1, 0));
		}
		Random r2 = new Random();
		float chance2 = r2.nextFloat();
		if (chance2 <= 0.2f) {
			drops.add(new ItemStack(ModBlocks.bathisweed , 1, 0));
		}
    }
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, BlockLiquid.LEVEL);
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}
	
	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos){
		return true;			
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state)
    {
        return state.getBlock() == Blocks.GRAVEL || state.getBlock() == Blocks.STONE;
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
	public BathisWeed setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
