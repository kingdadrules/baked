package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class SilvamZombieRender  extends RenderLiving<SilvamZombie> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/silvamzombie.png");

    public static final Factory FACTORY = new Factory();

    public SilvamZombieRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelZombie(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull SilvamZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<SilvamZombie> {

        //@Override
        public Render<? super SilvamZombie> createRenderFor(RenderManager manager) {
            return new SilvamZombieRender(manager);
        }

    }

}
