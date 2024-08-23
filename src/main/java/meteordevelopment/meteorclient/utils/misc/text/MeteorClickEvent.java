/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.misc.text;

import net.minecraft.text.ClickEvent;
import net.minecraft.text.Style;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * This class does nothing except ensure that {@link ClickEvent}'s containing Meteor Client commands can only be executed if they come from the client.
 * @see meteordevelopment.meteorclient.mixin.ScreenMixin#onRunCommand(Style, CallbackInfoReturnable)
 */
public class MeteorClickEvent extends ClickEvent {
    public MeteorClickEvent(Action action, String value) {
        super(action, value);
    }
}
