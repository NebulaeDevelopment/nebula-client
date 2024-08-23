/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.commands.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import meteordevelopment.meteorclient.commands.arguments.MacroArgumentType;
import meteordevelopment.meteorclient.systems.macros.Macro;
import net.minecraft.command.CommandSource;

public class MacroCommand extends Command {
    public MacroCommand() {
        super("macro", "Allows you to execute macros.");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.then(argument("macro", MacroArgumentType.create()).executes(context -> {
            Macro macro = MacroArgumentType.get(context);
            macro.onAction();
            return SINGLE_SUCCESS;
        }));
    }
}
