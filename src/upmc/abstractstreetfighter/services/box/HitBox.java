package upmc.abstractstreetfighter.services.box;

public interface HitBox {
	int getX();

	int getY();

	boolean isBelongsTo(int x, int y);

	boolean isCollidesWith(HitBox box);

	boolean equals(HitBox box);// TODO : useless

	void init(int x, int y);

	void moveTo(int x, int y);

}
