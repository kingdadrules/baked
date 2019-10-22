package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ColetusCow extends EntityCow {

	public ColetusCow(World worldIn) {
		super(worldIn);
		
	}
	
	@Override
	protected void applyEntityAttributes()
	{
	    super.applyEntityAttributes(); 

	    // standard attributes registered to EntityLivingBase
	    getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
	    getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.40D);
	    getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(1.0D);
	   
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/coletuscow");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
}

