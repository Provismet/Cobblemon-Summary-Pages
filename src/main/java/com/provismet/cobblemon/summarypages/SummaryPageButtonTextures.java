package com.provismet.cobblemon.summarypages;

import net.minecraft.util.Identifier;

public interface SummaryPageButtonTextures {
    Identifier NEXT_PAGE = CobblemonSummaryPagesClient.identifier("textures/gui/summary/next_feature_page.png");
    Identifier NEXT_PAGE_HOVER = CobblemonSummaryPagesClient.identifier("textures/gui/summary/next_feature_page_hover.png");
    Identifier PREV_PAGE = CobblemonSummaryPagesClient.identifier("textures/gui/summary/prev_feature_page.png");
    Identifier PREV_PAGE_HOVER = CobblemonSummaryPagesClient.identifier("textures/gui/summary/prev_feature_page_hover.png");

    int DIMENSIONS = 6;
}
