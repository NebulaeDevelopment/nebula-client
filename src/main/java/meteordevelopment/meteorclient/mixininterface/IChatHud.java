/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixininterface;

import net.minecraft.text.Text;

public interface IChatHud {
    void meteor$add(Text message, int id);
}
