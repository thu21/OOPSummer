package cherry;


import javafx.scene.canvas.GraphicsContext;

    public interface GameEntity {
        public abstract void render(GraphicsContext g);
        public abstract void update();
    }


