package org.yagamipaul.games.tetris.screens

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Camera
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.viewport.FitViewport
import com.badlogic.gdx.utils.viewport.Viewport
import org.yagamipaul.games.tetris.utils.ViewportUtils


/**
 * Created by JeanPaul on 20/07/2017.
 */
class MainGameScreen : BaseScreen() {


    private lateinit var viewPortUtils:ViewportUtils
    private var renderer:ShapeRenderer = ShapeRenderer()
    private var camera:Camera?=null
    private lateinit  var viewport:Viewport

    private val WORLD_WIDTH = 6.0f
    private val WORLD_HEIGHT = 10.0f

    /** Called when this screen becomes the current screen for a [Game].  */
    override fun show() {

        viewPortUtils = ViewportUtils()
        camera = OrthographicCamera()
        viewport = FitViewport(WORLD_WIDTH, WORLD_HEIGHT, camera)

    }

    /** @see ApplicationListener.resize
     */
    override fun resize(width: Int, height: Int) {
        viewport.update(width, height)

    }

    /** Called when this screen is no longer the current screen for a [Game].  */
    override fun hide() {

    }

    /** Called when the screen should render itself.
     * @param delta The time in seconds since the last render.
     */
    override fun render(delta: Float) {

        Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);



        viewPortUtils.drawGrid(viewport, renderer, 1)

    }
}