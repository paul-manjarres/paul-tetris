package org.yagamipaul.games.tetris.utils

import com.badlogic.gdx.Application
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Logger

/**
 * Created by paul-mac on 8/08/17.
 */
class CameraController {

    private val logger: Logger = Logger("CameraController",Logger.DEBUG)

    private val zoom = 1.0f
    private val position: Vector2 = Vector2()
    private val startPosition: Vector2 = Vector2()
    private val config:CameraConfig = CameraConfig()


    fun applyTo(camera: OrthographicCamera){

        camera.position.set(position, 0F)
        camera.zoom = zoom
        camera.update()

    }


    fun setPosition(x:Float, y:Float){
        position.set(x,y)
    }


    fun handleInput(delta:Float){

        if ( Gdx.app.type != Application.ApplicationType.Desktop ){
            return
        }


        var moveSpeed = config.MOVE_SPEED * delta
        var zoomSpeed = config.ZOOM_SPEED * delta

        if(config.isLeftPressed()){
            moveLeft(moveSpeed)
        }
        else if(config.isRightPressed()){
            moveRight(moveSpeed)
        }
        else if(config.isUpPressed()){
            moveUp(moveSpeed)
        }
        else if(config.isDownPressed()){
            moveDown(moveSpeed)
        }




    }

    fun moveCamera(xSpeed: Float, ySpeed: Float){
        setPosition(position.x + xSpeed, position.y+ySpeed)
    }


    fun moveLeft(speed:Float){
        moveCamera(-speed, 0F)
    }

    fun moveRight(speed:Float){
        moveCamera(speed, 0F)
    }

    fun moveDown(speed:Float){
        moveCamera(0F, -speed)
    }

    fun moveUp(speed:Float){
        moveCamera(0F, speed)
    }

}