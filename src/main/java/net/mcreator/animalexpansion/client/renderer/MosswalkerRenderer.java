
package net.mcreator.animalexpansion.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.animalexpansion.entity.MosswalkerEntity;
import net.mcreator.animalexpansion.client.model.Modelmosswalker;

public class MosswalkerRenderer extends MobRenderer<MosswalkerEntity, Modelmosswalker<MosswalkerEntity>> {
	public MosswalkerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmosswalker(context.bakeLayer(Modelmosswalker.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MosswalkerEntity entity) {
		return new ResourceLocation("animal_expansion:textures/entities/mosswalkertexture.png");
	}
}
