/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.render;

public class RenderAfterWorldEvent {
    private static final RenderAfterWorldEvent INSTANCE = new RenderAfterWorldEvent();

    public static RenderAfterWorldEvent get() {
        return INSTANCE;
    }
}
