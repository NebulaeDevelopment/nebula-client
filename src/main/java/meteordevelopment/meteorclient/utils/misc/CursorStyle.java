/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.misc;

import org.lwjgl.glfw.GLFW;

public enum CursorStyle {
    Default,
    Click,
    Type;

    private boolean created;
    private long cursor;

    public long getGlfwCursor() {
        if (!created) {
            switch (this) {
                case Click -> cursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_HAND_CURSOR);
                case Type -> cursor = GLFW.glfwCreateStandardCursor(GLFW.GLFW_IBEAM_CURSOR);
            }

            created = true;
        }

        return cursor;
    }
}
