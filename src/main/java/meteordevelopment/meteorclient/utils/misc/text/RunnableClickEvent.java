/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.misc.text;

/**
 * Allows arbitrary code execution in a click event
 * @see
 */
public class RunnableClickEvent extends MeteorClickEvent {
    public final Runnable runnable;

    public RunnableClickEvent(Runnable runnable) {
        super(null, null); // Should ensure no vanilla code is triggered, and only we handle it
        this.runnable = runnable;
    }
}
