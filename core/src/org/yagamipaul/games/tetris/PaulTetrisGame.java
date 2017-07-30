package org.yagamipaul.games.tetris;


import com.badlogic.gdx.Game;

import org.yagamipaul.games.tetris.screens.MainGameScreen;

public class PaulTetrisGame extends Game {


    @Override
    public void create() {
        setScreen(new MainGameScreen());
    }


}
