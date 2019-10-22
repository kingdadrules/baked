package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ColetusSkeletonRender  extends RenderBiped<ColetusSkeleton> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/coletusskeleton.png");

    public static final Factory FACTORY = new Factory();

    public ColetusSkeletonRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSkeleton(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ColetusSkeleton entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ColetusSkeleton> {

        //@Override
        public Render<? super ColetusSkeleton> createRenderFor(RenderManager manager) {
            return new ColetusSkeletonRender(manager);
        }

    }

}
