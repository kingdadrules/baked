package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class SilvamCreeperRender extends RenderLiving<SilvamCreeper> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/silvamcreeper.png");

    public static final Factory FACTORY = new Factory();

    public SilvamCreeperRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCreeper(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull SilvamCreeper entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<SilvamCreeper> {

        //@Override
        public Render<? super SilvamCreeper> createRenderFor(RenderManager manager) {
            return new SilvamCreeperRender(manager);
        }

    }

}
