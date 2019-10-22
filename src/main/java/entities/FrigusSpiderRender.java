package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class FrigusSpiderRender  extends RenderLiving<FrigusSpider> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/frigusspider.png");

    public static final Factory FACTORY = new Factory();

    public FrigusSpiderRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSpider(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull FrigusSpider entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<FrigusSpider> {

        //@Override
        public Render<? super FrigusSpider> createRenderFor(RenderManager manager) {
            return new FrigusSpiderRender(manager);
        }

    }

}
