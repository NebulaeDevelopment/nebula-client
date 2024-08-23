/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixininterface;

import net.minecraft.item.ItemStack;

// Using accessor causes a stackoverflow for some fucking reason
public interface IAbstractFurnaceScreenHandler {
    boolean isItemSmeltable(ItemStack itemStack);
}
