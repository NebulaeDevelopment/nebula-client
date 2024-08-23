/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.mixin;

import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.item.CrossbowItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(CrossbowItem.class)
public interface CrossbowItemAccessor {
    @Invoker("getSpeed")
    static float getSpeed(ChargedProjectilesComponent itemStack) { return 0; }
}
