/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.entity.player;

public class SendMovementPacketsEvent {
    public static class Pre {
        private static final Pre INSTANCE = new Pre();

        public static SendMovementPacketsEvent.Pre get() {
            return INSTANCE;
        }
    }

    public static class Post {
        private static final Post INSTANCE = new Post();

        public static SendMovementPacketsEvent.Post get() {
            return INSTANCE;
        }
    }
}
