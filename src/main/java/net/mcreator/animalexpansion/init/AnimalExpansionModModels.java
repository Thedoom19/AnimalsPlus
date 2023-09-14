
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animalexpansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.animalexpansion.client.model.Modelyesmosswalker;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class AnimalExpansionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelyesmosswalker.LAYER_LOCATION, Modelyesmosswalker::createBodyLayer);
	}
}
