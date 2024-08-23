/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.client.render.MapRenderer;
import net.minecraft.component.type.MapIdComponent;
import net.minecraft.item.map.MapState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(MapRenderer.class)
public interface MapRendererAccessor {
    @Invoker("getMapTexture")
    MapRenderer.MapTexture invokeGetMapTexture(MapIdComponent id, MapState state);
}
