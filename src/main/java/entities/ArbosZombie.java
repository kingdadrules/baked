package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArbosZombie extends EntityZombie{

	public ArbosZombie(World worldIn) {
		super(worldIn);
		
		
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/arboszombie");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
}

