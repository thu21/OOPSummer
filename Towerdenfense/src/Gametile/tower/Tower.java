package Gametile.tower;


        import javafx.scene.canvas.GraphicsContext;
        import cherry.GameTile;
        import Bullet.Abstractbullet;

public interface  Tower extends GameTile {
    public void render(GraphicsContext g);
    public void update() ;
    public void shoot(GraphicsContext g, Abstractbullet abstractbullet);
}
