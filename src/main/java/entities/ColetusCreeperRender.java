package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ColetusCreeperRender extends RenderLiving<ColetusCreeper> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/coletuscreeper.png");

    public static final Factory FACTORY = new Factory();

    public ColetusCreeperRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCreeper(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ColetusCreeper entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ColetusCreeper> {

        //@Override
        public Render<? super ColetusCreeper> createRenderFor(RenderManager manager) {
            return new ColetusCreeperRender(manager);
        }

    }

}
