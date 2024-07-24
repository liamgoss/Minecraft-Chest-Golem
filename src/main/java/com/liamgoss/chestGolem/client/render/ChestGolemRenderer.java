package com.liamgoss.chestGolem.client.render;

import com.liamgoss.chestGolem.entities.ChestGolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.PartPose;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;

public class ChestGolemRenderer extends MobRenderer<ChestGolemEntity, ChestGolemModel<ChestGolemEntity>> {
    private static final ResourceLocation TEXTURE = new ResourceLocation("chestgolem", "textures/entity/chest_golem.png");

    public ChestGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new ChestGolemModel<>(context.bakeLayer(ModelLayers.IRON_GOLEM)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(ChestGolemEntity entity) {
        return TEXTURE;
    }
}
