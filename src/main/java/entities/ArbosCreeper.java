package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArbosCreeper extends EntityCreeper {

	public ArbosCreeper(World worldIn) {
		super(worldIn);
		
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/arboscreeper");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
}

