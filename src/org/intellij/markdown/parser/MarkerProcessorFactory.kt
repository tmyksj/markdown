package org.intellij.markdown.parser

public interface MarkerProcessorFactory {
    fun createMarkerProcessor(productionHolder: ProductionHolder, tokensCache: TokensCache): MarkerProcessor
}

