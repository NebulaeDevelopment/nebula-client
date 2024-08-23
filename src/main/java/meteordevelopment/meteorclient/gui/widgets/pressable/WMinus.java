/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.gui.widgets.pressable;

public abstract class WMinus extends WPressable {
    @Override
    protected void onCalculateSize() {
        double pad = pad();
        double s = theme.textHeight();

        width = pad + s + pad;
        height = pad + s + pad;
    }
}
