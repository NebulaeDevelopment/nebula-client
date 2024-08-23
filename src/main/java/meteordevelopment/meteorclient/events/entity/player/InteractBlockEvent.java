/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.entity.player;

import meteordevelopment.meteorclient.events.Cancellable;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;

public class InteractBlockEvent extends Cancellable {
    private static final InteractBlockEvent INSTANCE = new InteractBlockEvent();

    public Hand hand;
    public BlockHitResult result;

    public static InteractBlockEvent get(Hand hand, BlockHitResult result) {
        INSTANCE.setCancelled(false);
        INSTANCE.hand = hand;
        INSTANCE.result = result;
        return INSTANCE;
    }
}
