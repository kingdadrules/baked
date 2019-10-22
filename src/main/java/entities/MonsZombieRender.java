package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class MonsZombieRender  extends RenderLiving<MonsZombie> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/monszombie.png");

    public static final Factory FACTORY = new Factory();

    public MonsZombieRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelZombie(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull MonsZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<MonsZombie> {

        //@Override
        public Render<? super MonsZombie> createRenderFor(RenderManager manager) {
            return new MonsZombieRender(manager);
        }

    }

}
