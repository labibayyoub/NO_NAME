package upmc.abstractstreetfighter.services.commande;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public interface Commande extends EventHandler<KeyEvent> {
	public static enum CommandeType {
		UP, DOWN, LEFT, RIGHT, UP_RIGHT, UP_LEFT, DOWN_RIGHT, DOWN_LEFT, NONE
	}

	void init(KeyCode up, KeyCode down, KeyCode right, KeyCode left);

	CommandeType consume();

	void handle(KeyEvent event);
}
