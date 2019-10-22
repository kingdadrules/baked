package entities;

import javax.annotation.Nonnull;


import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class BathisSkeletonRender  extends RenderBiped<BathisSkeleton> {

    private ResourceLocation mobTexture = new ResourceLocation(main.baked.modId + ":" + "textures/entity/bathisskeleton.png");

    public static final Factory FACTORY = new Factory();

    public BathisSkeletonRender(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelSkeleton(), 0.5F);        
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull BathisSkeleton entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<BathisSkeleton> {

        //@Override
        public Render<? super BathisSkeleton> createRenderFor(RenderManager manager) {
            return new BathisSkeletonRender(manager);
        }

    }

}
