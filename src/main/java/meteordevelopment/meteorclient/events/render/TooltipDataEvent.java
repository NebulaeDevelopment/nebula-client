/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.events.render;

import net.minecraft.item.tooltip.TooltipData;
import net.minecraft.item.ItemStack;


public class TooltipDataEvent {
    private static final TooltipDataEvent INSTANCE = new TooltipDataEvent();

    public TooltipData tooltipData;
    public ItemStack itemStack;

    public static TooltipDataEvent get(ItemStack itemStack) {
        INSTANCE.tooltipData = null;
        INSTANCE.itemStack = itemStack;
        return INSTANCE;
    }
}
