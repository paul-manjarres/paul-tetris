package org.yagamipaul.games.tetris.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.yagamipaul.games.tetris.PaulTetrisGame;
import org.yagamipaul.games.tetris.config.TetrisGameConfig;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = (int)TetrisGameConfig.WIDTH;
		config.height = (int)TetrisGameConfig.HEIGHT;

		new LwjglApplication(new PaulTetrisGame(), config);
	}
}
