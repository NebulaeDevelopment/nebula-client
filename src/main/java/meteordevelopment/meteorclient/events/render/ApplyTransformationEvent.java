/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.render;

import meteordevelopment.meteorclient.events.Cancellable;
import net.minecraft.client.render.model.json.Transformation;
import net.minecraft.client.util.math.MatrixStack;

public class ApplyTransformationEvent extends Cancellable {
    private static final ApplyTransformationEvent INSTANCE = new ApplyTransformationEvent();

    public Transformation transformation;
    public boolean leftHanded;
    public MatrixStack matrices;

    public static ApplyTransformationEvent get(Transformation transformation, boolean leftHanded, MatrixStack matrices) {
        INSTANCE.setCancelled(false);

        INSTANCE.transformation = transformation;
        INSTANCE.leftHanded = leftHanded;
        INSTANCE.matrices = matrices;

        return INSTANCE;
    }
}
