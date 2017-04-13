package upmc.abstractstreetfighter.services.character;

import upmc.abstractstreetfighter.services.box.HitBox;

public interface Character {// matrix of future steps in impl 
	public static enum FaceSide {
		RIGHT_SIDE, LEFT_SIDE
	}

	HitBox getBox(); // TODO : maybe must be RectangleHitBox

	int getLife();

	int getSpeed();

	FaceSide getFaceSide();

	boolean isCrouch();
	
	String getName();
	
	void init(String name ,HitBox box, int life, int speed, FaceSide side);

	void moveRight();

	void moveLeft();

	void jump();

	void crouch();

	void raise();

	void switchSide();

	void step();
}
