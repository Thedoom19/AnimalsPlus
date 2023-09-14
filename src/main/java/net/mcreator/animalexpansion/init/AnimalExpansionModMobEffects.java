
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animalexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.animalexpansion.potion.BleedingMobEffect;
import net.mcreator.animalexpansion.AnimalExpansionMod;

public class AnimalExpansionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AnimalExpansionMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
