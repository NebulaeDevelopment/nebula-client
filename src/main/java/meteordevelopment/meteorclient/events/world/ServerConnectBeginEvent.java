/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.world;

import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;

public class ServerConnectBeginEvent {
    private static final ServerConnectBeginEvent INSTANCE = new ServerConnectBeginEvent();
    public ServerAddress address;
    public ServerInfo info;

    public static ServerConnectBeginEvent get(ServerAddress address, ServerInfo info) {
        INSTANCE.address = address;
        INSTANCE.info = info;
        return INSTANCE;
    }
}
