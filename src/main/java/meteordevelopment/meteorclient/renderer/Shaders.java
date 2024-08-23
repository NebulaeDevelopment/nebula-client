/*
 * This file is part of the Nebula Client distribution (https://github.com/NebulaeDevelopment/nebula-client).
 * Copyright (c) Nebulae Development & Meteor Development.
 */

package meteordevelopment.meteorclient.renderer;

import meteordevelopment.meteorclient.utils.PreInit;

public class Shaders {
    public static Shader POS_COLOR;
    public static Shader POS_TEX_COLOR;
    public static Shader TEXT;

    private Shaders() {
    }

    @PreInit
    public static void init() {
        POS_COLOR = new Shader("pos_color.vert", "pos_color.frag");
        POS_TEX_COLOR = new Shader("pos_tex_color.vert", "pos_tex_color.frag");
        TEXT = new Shader("text.vert", "text.frag");
    }
}
