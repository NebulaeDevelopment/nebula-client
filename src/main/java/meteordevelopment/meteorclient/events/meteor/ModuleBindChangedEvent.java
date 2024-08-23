/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.meteor;

import meteordevelopment.meteorclient.systems.modules.Module;

public class ModuleBindChangedEvent {
    private static final ModuleBindChangedEvent INSTANCE = new ModuleBindChangedEvent();

    public Module module;

    public static ModuleBindChangedEvent get(Module module) {
        INSTANCE.module = module;
        return INSTANCE;
    }
}
