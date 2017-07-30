package org.yagamipaul.games.tetris.utils

import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.viewport.Viewport


/**
 * Created by JeanPaul on 20/07/2017.
 */

class ViewportUtils {




    fun drawGrid(viewport: Viewport, renderer: ShapeRenderer, cellSize: Int ){



        val oldColor = renderer.color
        val worldWidth =  viewport.worldWidth.toInt()
        val worldHeight = viewport.worldHeight.toInt()
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


        // Draw world lines
        renderer.color = Color.RED
        renderer.line(0F, -doubleWorldHeight.toFloat(), 0F, doubleWorldHeight.toFloat())
        renderer.line(-doubleWorldWidth.toFloat(), 0F, doubleWorldWidth.toFloat(), 0F)

        // Draw world bounds

        renderer.color = Color.GREEN
        renderer.line(0F, worldHeight.toFloat(), worldWidth.toFloat(), worldHeight.toFloat())
        renderer.line(worldWidth.toFloat(), 0F , worldWidth.toFloat(), worldHeight.toFloat())




        renderer.end()
        renderer.color = oldColor



    }







}
