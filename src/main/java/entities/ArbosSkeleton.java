package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArbosSkeleton extends EntitySkeleton{

	public ArbosSkeleton(World worldIn) {
		super(worldIn);
		
		this.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, new ItemStack(Items.BOW));
		this.setHeldItem(EnumHand.MAIN_HAND,  new ItemStack(Items.BOW));		
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/arbosskeleton");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }	
	
}