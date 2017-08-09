package org.yagamipaul.games.tetris.utils

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.math.Vector2
import javafx.scene.Camera

/**
 * Created by paul-mac on 8/08/17.
 */
class CameraConfig {

    val MAX_ZOOM_IN = 0.2f
    val MAX_ZOOM_OUT = 30.0f
    var MOVE_SPEED = 20.0f
    var ZOOM_SPEED = 2.0f


    fun isUpPressed(): Boolean {
        return Gdx.input.isKeyPressed(Input.Keys.U)
    }

    fun isLeftPressed(): Boolean {
        return Gdx.input.isKeyPressed(Input.Keys.H)
    }

    fun isDownPressed(): Boolean {
        return Gdx.input.isKeyPressed(Input.Keys.J)
    }

    fun isRightPressed(): Boolean {
        return Gdx.input.isKeyPressed(Input.Keys.K)
    }


}