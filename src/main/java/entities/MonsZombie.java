package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class MonsZombie extends EntityZombie{

	public MonsZombie(World worldIn) {
		super(worldIn);
		
		
	}
	
	@Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(35.0D);
	    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.36D);
	    getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(0.5D);
	    getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(48.0D); 
	    getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.4D);
	   
	}
	
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/monszombie");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
}

