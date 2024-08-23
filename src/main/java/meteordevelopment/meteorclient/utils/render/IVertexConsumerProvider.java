/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.render;

import net.minecraft.client.render.VertexConsumerProvider;

public interface IVertexConsumerProvider extends VertexConsumerProvider {
    void setOffset(float offsetX, float offsetY, float offsetZ);
}
