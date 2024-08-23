/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.entity.player;

/**
 * @see net.minecraft.client.network.ClientPlayerEntity#tickMovement()
 */
public class PlayerTickMovementEvent {
    private static final PlayerTickMovementEvent INSTANCE = new PlayerTickMovementEvent();

    public static PlayerTickMovementEvent get() {
        return INSTANCE;
    }
}
