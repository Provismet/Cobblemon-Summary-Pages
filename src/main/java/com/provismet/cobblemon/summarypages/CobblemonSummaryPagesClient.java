package com.provismet.cobblemon.summarypages;

import com.provismet.cobblemon.summarypages.api.SummaryPagesInitialiser;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonSummaryPagesClient implements ClientModInitializer {
	public static final String MODID = "cobblemon-summary-pages";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public static Identifier identifier (String path) {
        return Identifier.of(MODID, path);
    }

    @Override
    public void onInitializeClient () {
        FabricLoader.getInstance().getEntrypointContainers(MODID, SummaryPagesInitialiser.class).forEach(
            initializer -> {
                try {
                    initializer.getEntrypoint().onInitialise();
                }
                catch (Throwable e) {
                    LOGGER.error("Summary Pages failed to initialise sidemod entrypoint from {} due to errors provided by it:", initializer.getProvider().getMetadata().getName(), e);
                }
            }
        );
    }
}