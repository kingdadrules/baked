package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSpider;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class MonsSpiderRender  extends RenderLiving<MonsSpider> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/monsspider.png");

    public static final Factory FACTORY = new Factory();

    public MonsSpiderRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSpider(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull MonsSpider entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<MonsSpider> {

        //@Override
        public Render<? super MonsSpider> createRenderFor(RenderManager manager) {
            return new MonsSpiderRender(manager);
        }

    }

}
