
package net.mcreator.animalexpansion.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animalexpansion.entity.MosswalkerEntity;
import net.mcreator.animalexpansion.client.model.Modelyesmosswalker;

public class MosswalkerRenderer extends MobRenderer<MosswalkerEntity, Modelyesmosswalker<MosswalkerEntity>> {
	public MosswalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelyesmosswalker(context.bakeLayer(Modelyesmosswalker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MosswalkerEntity entity) {
		return new ResourceLocation("animal_expansion:textures/entities/mosswalkertexture.png");
	}
}
