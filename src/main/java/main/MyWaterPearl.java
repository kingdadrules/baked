package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MyWaterPearl extends Item {

	protected String name;

	public MyWaterPearl(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	 /**
     * Called when a Block is right-clicked with this Item
     */
	
	 @Override
	
    
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	 {
    	 System.out.println("HHHHHH");
    	 worldIn.playSound(player, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
    	 for (int l = 0; l < 1000; l++) 
			{
    		// worldIn.spawnParticle(EnumParticleTypes.WATER_BUBBLE, player.posX + Math.random(), player.posY + Math.random(), player.posZ + Math.random(), 0.0D, 0.0D, 0.0D);
    		 worldIn.spawnParticle(EnumParticleTypes.WATER_BUBBLE, player.posX , player.posY + 1.5, player.posZ , 0.0D, 0.0D, 0.0D);
			}
    	 player.addPotionEffect(new PotionEffect(Potion.getPotionById(13), 1800, 2)); 
    	 player.inventory.decrStackSize(player.inventory.currentItem, 1); 
    	     	 
    	 return EnumActionResult.SUCCESS;
    }
	 
	 
	public void registerItemModel() {
		baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public MyWaterPearl setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}	

}
