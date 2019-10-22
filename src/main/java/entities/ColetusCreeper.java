package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ColetusCreeper extends EntityCreeper {

	public ColetusCreeper(World worldIn) {
		super(worldIn);
		
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
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/coletuscreeper");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
}

