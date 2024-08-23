/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.entity.player;

import meteordevelopment.meteorclient.events.Cancellable;
import net.minecraft.util.math.BlockPos;

public class BreakBlockEvent extends Cancellable {
    private static final BreakBlockEvent INSTANCE = new BreakBlockEvent();

    public BlockPos blockPos;

    public static BreakBlockEvent get(BlockPos blockPos) {
        INSTANCE.setCancelled(false);
        INSTANCE.blockPos = blockPos;
        return INSTANCE;
    }
}
