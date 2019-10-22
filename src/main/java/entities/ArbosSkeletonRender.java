package entities;

import javax.annotation.Nonnull;

import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class ArbosSkeletonRender  extends RenderBiped<ArbosSkeleton> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/arbosskeleton.png");

    public static final Factory FACTORY = new Factory();

    public ArbosSkeletonRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSkeleton(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull ArbosSkeleton entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<ArbosSkeleton> {

        //@Override
        public Render<? super ArbosSkeleton> createRenderFor(RenderManager manager) {
            return new ArbosSkeletonRender(manager);
        }

    }

}
