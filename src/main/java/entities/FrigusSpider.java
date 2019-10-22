package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class FrigusSpider extends EntitySpider {

	public FrigusSpider(World worldIn) {
		super(worldIn);
	}
	
	@Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(45.0D);
	    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
	    getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.8D);
	    getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(60.0D); 
	    getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(3.0D);
	   
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/frigusspider");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
   }
	
}

