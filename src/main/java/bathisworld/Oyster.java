package bathisworld;

import java.util.List;
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
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
public class Oyster extends BlockBush {
	
	protected String name;
	
	private static final AxisAlignedBB BOX_BOUNDING = new AxisAlignedBB(0.0625 * 2, 0, 0.0625 * 2, 0.0625 * 14, 0.0625 * 4, 0.0625 * 14);

	public Oyster(String name) {
		super(Material.WATER);
		setHardness(3.0f);
        setResistance(8.0f);
        setHarvestLevel("pickaxe", 3); 
        this.name = name;
        
        setUnlocalizedName(name);
		setRegistryName(name);
        
        setDefaultState(blockState.getBaseState().withProperty(BlockLiquid.LEVEL, 15));
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return 0;
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, BlockLiquid.LEVEL);
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
		
		
	@Override
    public void getDrops(net.minecraft.util.NonNullList<ItemStack> drops, net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune)
    {       
        
		Random r1 = new Random();
		float chance1 = r1.nextFloat();
		if (chance1 <= 0.7f) {
			drops.add(new ItemStack(ModItems.pearl, 1, 0));
		}
		Random r2 = new Random();
		float chance2 = r2.nextFloat();
		if (chance2 <= 0.2f) {
			drops.add(new ItemStack(ModItems.transparentpearl, 1, 0));
		}
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
        return Blocks.HARDENED_CLAY.getSoundType();
    }
	
	
	@Override
	public Oyster setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
	

}

