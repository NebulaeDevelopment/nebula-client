/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.utils.notebot.instrumentdetect;

import net.minecraft.block.NoteBlock;
import net.minecraft.client.MinecraftClient;

public enum InstrumentDetectMode {
    BlockState(((noteBlock, blockPos) -> noteBlock.get(NoteBlock.INSTRUMENT))),
    BelowBlock(((noteBlock, blockPos) -> MinecraftClient.getInstance().world.getBlockState(blockPos.down()).getInstrument()));

    private final InstrumentDetectFunction instrumentDetectFunction;

    InstrumentDetectMode(InstrumentDetectFunction instrumentDetectFunction) {
        this.instrumentDetectFunction = instrumentDetectFunction;
    }

    public InstrumentDetectFunction getInstrumentDetectFunction() {
        return instrumentDetectFunction;
    }
}
