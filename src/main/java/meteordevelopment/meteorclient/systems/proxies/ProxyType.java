/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.systems.proxies;

import org.jetbrains.annotations.Nullable;

public enum ProxyType {
    Socks4,
    Socks5;

    @Nullable
    public static ProxyType parse(String group) {
        for (ProxyType type : values()) {
            if (type.name().equalsIgnoreCase(group)) {
                return type;
            }
        }
        return null;
    }
}
