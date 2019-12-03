package Spawer;


        import javafx.scene.canvas.GraphicsContext;
        import cherry.GameTile;
        import Enemy.AbstractEnemy;

        import java.util.List;

public interface EnemySpawer extends GameTile {
    public abstract List<AbstractEnemy> doSpawer();
    public abstract void render(GraphicsContext g);
    public abstract void update() ;
}
