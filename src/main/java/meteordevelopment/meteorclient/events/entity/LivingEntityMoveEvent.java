/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.entity;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

public class LivingEntityMoveEvent {
    private static final LivingEntityMoveEvent INSTANCE = new LivingEntityMoveEvent();

    public LivingEntity entity;
    public Vec3d movement;

    public static LivingEntityMoveEvent get(LivingEntity entity, Vec3d movement) {
        INSTANCE.entity = entity;
        INSTANCE.movement = movement;
        return INSTANCE;
    }
}
