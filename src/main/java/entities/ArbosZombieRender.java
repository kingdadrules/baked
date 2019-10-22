package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ArbosZombieRender  extends RenderLiving<ArbosZombie> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/arboszombie.png");

    public static final Factory FACTORY = new Factory();

    public ArbosZombieRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelZombie(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ArbosZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ArbosZombie> {

        //@Override
        public Render<? super ArbosZombie> createRenderFor(RenderManager manager) {
            return new ArbosZombieRender(manager);
        }

    }

}
