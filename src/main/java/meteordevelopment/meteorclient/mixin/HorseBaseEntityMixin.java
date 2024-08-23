/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import meteordevelopment.meteorclient.mixininterface.IHorseBaseEntity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AbstractHorseEntity.class)
public abstract class HorseBaseEntityMixin implements IHorseBaseEntity {
    @Shadow protected abstract void setHorseFlag(int bitmask, boolean flag);

    @Override
    public void setSaddled(boolean saddled) {
        setHorseFlag(4, saddled);
    }
}
