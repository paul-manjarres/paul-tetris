package org.yagamipaul.games.tetris.utils

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.viewport.Viewport
import javax.print.attribute.IntegerSyntax

/**
 * Created by JeanPaul on 20/07/2017.
 */

class ViewportUtils {


    /**
     * Cell size
     */
    private var CELL_SIZE = 1


    fun drawGrid(viewport: Viewport, renderer: ShapeRenderer, cellSize: Int ){



        val oldColor = renderer.color
        val worldWidth: Int =  viewport.worldWidth.toInt()
        val worldHeight: Int = viewport.worldHeight.toInt()
        val doubleWorldWidth: Int = worldWidth * 2
        val doubleWorldHeight: Int = worldHeight * 2

        renderer.projectionMatrix = viewport.camera.combined

        renderer.begin(ShapeRenderer.ShapeType.Line)
        renderer.color = Color.WHITE

        for( x in -doubleWorldWidth..doubleWorldWidth step cellSize){
            renderer.line(x.toFloat(), -doubleWorldHeight.toFloat(), x.toFloat(), doubleWorldHeight.toFloat())
        }

        for( y in -doubleWorldHeight..doubleWorldHeight step cellSize){
            renderer.line( -doubleWorldWidth.toFloat(), y.toFloat(), doubleWorldWidth.toFloat(), y.toFloat())
        }

        renderer.end()
        renderer.color = oldColor



    }







}
