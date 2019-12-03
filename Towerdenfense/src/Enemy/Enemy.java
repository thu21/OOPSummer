package Enemy;


        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.image.Image;
        import cherry.GameEntity;

public interface Enemy extends GameEntity {
    public void render(GraphicsContext g);
    public void update() ;
}
