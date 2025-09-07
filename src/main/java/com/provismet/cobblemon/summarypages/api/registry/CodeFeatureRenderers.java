package com.provismet.cobblemon.summarypages.api.registry;

import com.cobblemon.mod.common.pokemon.Pokemon;
import com.provismet.cobblemon.summarypages.api.CodeFeatureRenderer;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public abstract class CodeFeatureRenderers {
    private static final List<CodeFeatureRenderer> renderers = new ArrayList<>();

    public static void register (CodeFeatureRenderer renderer) {
        renderers.add(renderer);
    }

    public static int size (Pokemon pokemon) {
        return getFor(pokemon).size();
    }

    public static CodeFeatureRenderer get (int index, Pokemon pokemon) {
        List<CodeFeatureRenderer> validRenderers = getFor(pokemon);
        if (validRenderers.size() > index && index >= 0) return validRenderers.get(index);
        return null;
    }

    private static List<CodeFeatureRenderer> getFor (Pokemon pokemon) {
        return renderers.stream().filter(renderer -> renderer.shouldRender(pokemon)).toList();
    }
}
