package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelWitch;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ArbosWitchRender extends RenderLiving<ArbosWitch> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/arboswitch.png");

    public static final Factory FACTORY = new Factory();

    public ArbosWitchRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelWitch(0F), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ArbosWitch entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ArbosWitch> {

        //@Override
        public Render<? super ArbosWitch> createRenderFor(RenderManager manager) {
            return new ArbosWitchRender(manager);
        }

    }

}

