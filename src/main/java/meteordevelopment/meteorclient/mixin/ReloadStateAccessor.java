/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.client.resource.ResourceReloadLogger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ResourceReloadLogger.ReloadState.class)
public interface ReloadStateAccessor {
    @Accessor("finished")
    boolean isFinished();
}
