package upmc.abstractstreetfighter.services.engine;

import upmc.abstractstreetfighter.services.character.Character;

public interface Engine {// TODO : maybe should add status : stop, pause, play

	int getHeight();

	int getWidth();

	Character[] getCharacters();

	boolean isGameOver();

	void init(int height, int width, int sps/* step per second */);

	default void step() {
		for (Character character : getCharacters()) {
			character.step();
		}
	}

	void play();

	void pause();

	void stop();
}
