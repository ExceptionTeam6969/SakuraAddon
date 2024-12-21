package dev.exceptionteam.addon

import dev.exceptionteam.sakura.Sakura
import dev.exceptionteam.sakura.addons.SakuraAddon
import dev.exceptionteam.sakura.features.modules.AbstractModule
import dev.exceptionteam.sakura.translation.TranslationKey

object Addon: SakuraAddon() {
    override fun getLanguageData(): Map<String, Map<TranslationKey, String>> {
        return mapOf()
    }

    override fun onInitialize() {
        Sakura.logger.warn("Addon is enabled!")
    }

    override fun getModules(): List<AbstractModule> {
        return emptyList()
    }
}