package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ArbosSpiderRender  extends RenderLiving<ArbosSpider> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/arbosspider.png");

    public static final Factory FACTORY = new Factory();

    public ArbosSpiderRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSpider(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ArbosSpider entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ArbosSpider> {

        //@Override
        public Render<? super ArbosSpider> createRenderFor(RenderManager manager) {
            return new ArbosSpiderRender(manager);
        }

    }

}
