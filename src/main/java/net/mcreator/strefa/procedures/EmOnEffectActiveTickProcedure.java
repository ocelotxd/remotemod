package net.mcreator.strefa.procedures;

public class EmOnEffectActiveTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TheocelotmodMod.LOGGER.warn("Failed to load dependency x for procedure EmOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TheocelotmodMod.LOGGER.warn("Failed to load dependency y for procedure EmOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TheocelotmodMod.LOGGER.warn("Failed to load dependency z for procedure EmOnEffectActiveTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TheocelotmodMod.LOGGER.warn("Failed to load dependency world for procedure EmOnEffectActiveTick!");
			return;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(EmparticleParticle.particle, x, y, z, (int) 50, 1, 1, 1, 1);
		}
	}

}
