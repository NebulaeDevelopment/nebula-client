/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixininterface;

import com.mojang.authlib.GameProfile;

public interface IChatHudLine {
    String meteor$getText();

    int meteor$getId();

    void meteor$setId(int id);

    GameProfile meteor$getSender();

    void meteor$setSender(GameProfile profile);
}
