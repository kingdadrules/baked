package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class InsulaSpiderRender  extends RenderLiving<InsulaSpider> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/insulaspider.png");

    public static final Factory FACTORY = new Factory();

    public InsulaSpiderRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSpider(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull InsulaSpider entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<InsulaSpider> {

        //@Override
        public Render<? super InsulaSpider> createRenderFor(RenderManager manager) {
            return new InsulaSpiderRender(manager);
        }

    }

}
