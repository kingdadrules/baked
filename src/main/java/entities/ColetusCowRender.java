package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ColetusCowRender extends RenderLiving<ColetusCow> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/coletuscow.png");

    public static final Factory FACTORY = new Factory();

    public ColetusCowRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCow(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ColetusCow entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ColetusCow> {

        //@Override
        public Render<? super ColetusCow> createRenderFor(RenderManager manager) {
            return new ColetusCowRender(manager);
        }

    }

}
