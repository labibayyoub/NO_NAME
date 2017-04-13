package upmc.abstractstreetfighter.services.box;

public interface RectangleHitBox extends HitBox {
	int getHeight();

	int getWidth();

	void init(int x, int y, int height, int width);
}
