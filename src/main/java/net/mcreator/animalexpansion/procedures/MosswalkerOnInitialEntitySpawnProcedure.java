package net.mcreator.animalexpansion.procedures;

import net.minecraft.world.entity.Entity;

public class MosswalkerOnInitialEntitySpawnProcedure {
	public static void execute(double y, Entity entity) {
		if (entity == null)
			return;
		if (y > 80) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
