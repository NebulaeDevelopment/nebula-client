/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.particle.EntityEffectParticleEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntityEffectParticleEffect.class)
public interface EntityEffectParticleEffectAccessor {
    @Accessor
    int getColor();
}
