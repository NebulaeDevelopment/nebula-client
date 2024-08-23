/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.client.font.TextHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TextHandler.class)
public interface TextHandlerAccessor {
    @Accessor("widthRetriever")
    TextHandler.WidthRetriever getWidthRetriever();
}
