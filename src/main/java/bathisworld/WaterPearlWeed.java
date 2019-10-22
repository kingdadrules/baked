package bathisworld;

import java.util.Random;

import javax.annotation.Nullable;

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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WaterPearlWeed extends BlockBush {

	protected String name;
	
	public WaterPearlWeed(String name) {
		super(Material.WATER);
		setHardness(1.2F);
        setResistance(1.5f);
        setHarvestLevel("shovel", 2); 
        this.name = name;
    	
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setDefaultState(blockState.getBaseState().withProperty(BlockLiquid.LEVEL, 15));
		
   	}
	public Item getItemDropped(IBlockState state, Random random, int i2 ){
		return ModItems.waterpearl;
	}
	public int quantityDropped(Random random){
		Random r = new Random();
		float chance = r.nextFloat();
		if (chance <= 0.75f) {
			return random.nextInt(1) + 1; 
		} else {
			return 0 ;
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
	public WaterPearlWeed setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
