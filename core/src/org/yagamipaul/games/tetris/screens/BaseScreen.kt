package org.yagamipaul.games.tetris.screens

import com.badlogic.gdx.Screen

/**
 * Created by JeanPaul on 20/07/2017.
 */
open class BaseScreen : Screen{

    /** Called when this screen is no longer the current screen for a [Game].  */
    override fun hide() {

    }

    /** Called when this screen becomes the current screen for a [Game].  */
    override fun show() {

    }

    /** Called when the screen should render itself.
     * @param delta The time in seconds since the last render.
     */
    override fun render(delta: Float) {

    }

    /** @see ApplicationListener.pause
     */
    override fun pause() {

    }

    /** @see ApplicationListener.resume
     */
    override fun resume() {

    }

    /** @see ApplicationListener.resize
     */
    override fun resize(width: Int, height: Int) {

    }

    /** Called when this screen should release all resources.  */
    override fun dispose() {

    }
}