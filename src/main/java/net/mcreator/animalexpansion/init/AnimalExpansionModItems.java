
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.animalexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.animalexpansion.AnimalExpansionMod;

public class AnimalExpansionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AnimalExpansionMod.MODID);
	public static final RegistryObject<Item> COOKIE_BLOCK = block(AnimalExpansionModBlocks.COOKIE_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
