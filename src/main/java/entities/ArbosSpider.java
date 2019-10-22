package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ArbosSpider extends EntitySpider {

	public ArbosSpider(World worldIn) {
		super(worldIn);
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/arbosspider");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
   }
	
}

