package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArbosWitch extends EntityWitch{

	public ArbosWitch(World worldIn) {
		super(worldIn);
		
		
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/arboswitch");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
    }
	
}

