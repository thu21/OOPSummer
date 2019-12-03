package Gametile;


        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.image.Image;
        import cherry.GameTile;

public class Mountain implements GameTile {

    @Override
    public void render(GraphicsContext g) {

        g.drawImage(new Image("file:Image/coo.png"), 70*14,70*5);
        g.drawImage(new Image("file:Image/coo.png"), 70*1,70*3);
        g.drawImage(new Image("file:Image/coo.png"), 70*10,0);
        g.drawImage(new Image("file:Image/coo.png"), 70*14,70*10);
        g.drawImage(new Image("file:Image/start1.png"), 15*70,0);
        g.drawImage(new Image("file:Image/star.png"), 70*9,70*9);
        g.drawImage(new Image("file:Image/star.png"), 70*13,70*6 );
        g.drawImage(new Image("file:Image/star.png"), 70*1,70*4 );
        g.drawImage(new Image("file:Image/star.png"), 70*3,70*3 );
        g.drawImage(new Image("file:Image/star.png"), 70*2,70*4 );
        g.drawImage(new Image("file:Image/star.png"), 70*12,0 );
        g.drawImage(new Image("file:Image/star.png"), 0,0 );
        g.drawImage(new Image("file:Image/star.png"), 70*4,70*8 );
        g.drawImage(new Image("file:Image/suoix.png"), 70*10,70*5.3 );

    }
    @Override
    public void update() {

    }
}