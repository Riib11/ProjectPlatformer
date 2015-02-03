package system;

import screens.GameScreen;
import screens.OptionsScreen;
import screens.StartScreen;

public enum ActiveComponents {
	START {
		public StartScreen component() {
			return MainOperator.startScreen;
		}
	},
	OPTIONS {
		public OptionsScreen component() {
			return MainOperator.optionsScreen;
		}
	},
	GAME {
		public GameScreen component() {
			return MainOperator.gameScreen;
		}
	}
}
