package arbosworld;

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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ArbosLeafBlock extends BlockBase {

	public ArbosLeafBlock(String name) {
		super(Material.LEAVES, name);
		setHardness(0.35f);
        setResistance(1.5f);
        setHarvestLevel("axe", 0);         
   	}
	public Item getItemDropped(IBlockState state, Random random, int i2 ){
		return ModItems.arbosnut;
	}
	public int quantityDropped(Random random){
		Random r = new Random();
		float chance = r.nextFloat();
		if (chance <= 0.15f) {
			return random.nextInt(1) + 1; 
		} else {
			return 0 ;
		}
		
	}		

	@SuppressWarnings("deprecation")
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, @Nullable Entity entity)
    {
        //return blockSoundType.PLANT;
        return Blocks.LEAVES.getSoundType();
    }
	
	@Override
	public ArbosLeafBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
