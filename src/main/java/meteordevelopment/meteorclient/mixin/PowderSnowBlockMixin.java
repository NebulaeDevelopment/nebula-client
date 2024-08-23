/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import meteordevelopment.meteorclient.systems.modules.Modules;
import meteordevelopment.meteorclient.systems.modules.movement.Jesus;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static meteordevelopment.meteorclient.MeteorClient.mc;

@Mixin(PowderSnowBlock.class)
public abstract class PowderSnowBlockMixin {
    @ModifyReturnValue(method = "canWalkOnPowderSnow", at = @At("RETURN"))
    private static boolean onCanWalkOnPowderSnow(boolean original, Entity entity) {
        if (entity == mc.player && Modules.get().get(Jesus.class).canWalkOnPowderSnow()) return true;
        return original;
    }
}
