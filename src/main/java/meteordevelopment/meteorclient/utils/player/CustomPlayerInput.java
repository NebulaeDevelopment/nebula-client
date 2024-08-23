/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.player;

import net.minecraft.client.input.Input;

public class CustomPlayerInput extends Input {
    @Override
    public void tick(boolean slowDown, float f) {
        movementForward = pressingForward == pressingBack ? 0.0F : (pressingForward ? 1.0F : -1.0F);
        movementSideways = pressingLeft == pressingRight ? 0.0F : (pressingLeft ? 1.0F : -1.0F);

        if (sneaking) {
            movementForward *= 0.3;
            movementSideways *= 0.3;
        }
    }

    public void stop() {
        pressingForward = false;
        pressingBack = false;
        pressingRight = false;
        pressingLeft = false;
        jumping = false;
        sneaking = false;
    }
}
