/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixininterface;

public interface IBakedQuad {
    float meteor$getX(int vertexI);

    float meteor$getY(int vertexI);

    float meteor$getZ(int vertexI);
}
