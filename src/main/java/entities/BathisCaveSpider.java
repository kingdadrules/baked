package entities;

import javax.annotation.Nullable;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BathisCaveSpider extends EntityCaveSpider {

	public BathisCaveSpider(World worldIn) {
		super(worldIn);
	}
	
	public static final ResourceLocation LOOT = new ResourceLocation(main.baked.modId, "entities/bathiscavespider");
	
	
	@Override
    @Nullable
    protected ResourceLocation getLootTable() {
        return LOOT;
   }
	
}

