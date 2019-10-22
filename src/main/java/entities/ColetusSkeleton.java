package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ColetusSkeleton extends EntitySkeleton{

	public ColetusSkeleton(World worldIn) {
		super(worldIn);
		
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.BOW));
		this.setHeldItem(EnumHand.MAIN_HAND,  new ItemStack(Items.BOW));		
	}
	
	@Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
	    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.37D);
	    getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.7D);
	    getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(58.0D); 
	    getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.7D);
	   
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/coletusskeleton");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }	
	
}