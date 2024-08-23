/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.client.gl.Framebuffer;

import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.player.BlockBreakingInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(WorldRenderer.class)
public interface WorldRendererAccessor {
    @Accessor
    void setEntityOutlinesFramebuffer(Framebuffer framebuffer);

    @Accessor("blockBreakingInfos")
    Int2ObjectMap<BlockBreakingInfo> getBlockBreakingInfos();
}
