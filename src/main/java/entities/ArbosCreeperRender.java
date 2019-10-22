package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ArbosCreeperRender extends RenderLiving<ArbosCreeper> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/arboscreeper.png");

    public static final Factory FACTORY = new Factory();

    public ArbosCreeperRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCreeper(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ArbosCreeper entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ArbosCreeper> {

        //@Override
        public Render<? super ArbosCreeper> createRenderFor(RenderManager manager) {
            return new ArbosCreeperRender(manager);
        }

    }

}
