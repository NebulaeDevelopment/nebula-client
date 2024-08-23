/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.entity.player;

import meteordevelopment.meteorclient.events.Cancellable;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class PlaceBlockEvent extends Cancellable {
    private static final PlaceBlockEvent INSTANCE = new PlaceBlockEvent();

    public BlockPos blockPos;
    public Block block;

    public static PlaceBlockEvent get(BlockPos blockPos, Block block) {
        INSTANCE.setCancelled(false);
        INSTANCE.blockPos = blockPos;
        INSTANCE.block = block;
        return INSTANCE;
    }
}
