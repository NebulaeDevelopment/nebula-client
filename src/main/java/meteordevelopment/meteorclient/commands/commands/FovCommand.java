/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.commands.commands;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.mixininterface.ISimpleOption;
import net.minecraft.command.CommandSource;

public class FovCommand extends Command {
    public FovCommand() {
        super("fov", "Changes your fov.");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.then(argument("fov", IntegerArgumentType.integer(0, 180)).executes(context -> {
            ((ISimpleOption) (Object) mc.options.getFov()).set(context.getArgument("fov", Integer.class));
            return SINGLE_SUCCESS;
        }));
    }
}
