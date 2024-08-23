/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.tooltip;

import net.minecraft.client.gui.tooltip.OrderedTextTooltipComponent;
import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;

public class TextTooltipComponent extends OrderedTextTooltipComponent implements MeteorTooltipData {
    public TextTooltipComponent(OrderedText text) {
        super(text);
    }

    public TextTooltipComponent(Text text) {
        this(text.asOrderedText());
    }

    @Override
    public TooltipComponent getComponent() {
        return this;
    }
}
