package org.yagamipaul.games.tetris.desktop

import com.badlogic.gdx.tools.texturepacker.TexturePacker

/**
 * Created by JeanPaul on 29/07/2017.
 */

const val RAW_ASSETS_PATH = "desktop/raw_assets"
const val ASSETS_PATH = "android/assets"


fun main(args: Array<String>) {

    var settings: TexturePacker.Settings = TexturePacker.Settings()

    println("Start texture processing")
    TexturePacker.process(settings, RAW_ASSETS_PATH, ASSETS_PATH+"/game", "game")
    println("Texture processing finished")



}




