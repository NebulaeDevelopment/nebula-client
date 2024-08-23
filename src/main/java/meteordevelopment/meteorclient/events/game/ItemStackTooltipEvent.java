/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.game;

import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;

import java.util.List;

public record ItemStackTooltipEvent(ItemStack itemStack, List<Text> list) {}
