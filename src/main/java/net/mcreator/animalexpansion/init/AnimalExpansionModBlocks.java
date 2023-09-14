
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animalexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.animalexpansion.block.CookieBlockBlock;
import net.mcreator.animalexpansion.AnimalExpansionMod;

public class AnimalExpansionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnimalExpansionMod.MODID);
	public static final RegistryObject<Block> COOKIE_BLOCK = REGISTRY.register("cookie_block", () -> new CookieBlockBlock());
}
