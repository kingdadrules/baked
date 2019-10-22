package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class InsulaZombieRender  extends RenderLiving<InsulaZombie> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/insulazombie.png");

    public static final Factory FACTORY = new Factory();

    public InsulaZombieRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelZombie(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull InsulaZombie entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<InsulaZombie> {

        //@Override
        public Render<? super InsulaZombie> createRenderFor(RenderManager manager) {
            return new InsulaZombieRender(manager);
        }

    }

}
