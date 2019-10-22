package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class CaelumSkeletonRender  extends RenderBiped<CaelumSkeleton> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/caelumskeleton.png");

    public static final Factory FACTORY = new Factory();

    public CaelumSkeletonRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSkeleton(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull CaelumSkeleton entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<CaelumSkeleton> {

        //@Override
        public Render<? super CaelumSkeleton> createRenderFor(RenderManager manager) {
            return new CaelumSkeletonRender(manager);
        }

    }

}
