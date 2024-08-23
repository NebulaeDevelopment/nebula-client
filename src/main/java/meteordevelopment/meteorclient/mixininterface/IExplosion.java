/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixininterface;

import net.minecraft.util.math.Vec3d;

public interface IExplosion {
    void set(Vec3d pos, float power, boolean createFire);
}
