package Enemy;


        import javafx.scene.SnapshotParameters;
        import javafx.scene.canvas.GraphicsContext;

        import java.awt.*;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import javafx.scene.paint.Color;
        import javafx.scene.transform.Rotate;
        import javafx.scene.image.ImageView;
        import cherry.Config;
//import sample.spawer.NormalEnemySpawer;

public class NormalEnemy extends AbstractEnemy implements Enemy {
//    int posX = Config.START_X;
//    int posY = Config.START_Y;
////
//    int health=100;
//    int speed =5;
//    int gunRotation =-90;
//    int enemyRotation = 90;

    public NormalEnemy(int posX, int posY, int health, int speed, int money) {
        super(posX, posY, Config.NORMAL_EMEMY_HEALTH, Config.NORMAL_ENEMY_SPEED, Config.NORMAL_ENEMY_MONEY);
    }

    Image enemyImg = Config.NORMAL_ENEMY_IMAGE;// hinh anh cua quan dich


    public Image getEnemyImg() {
        return enemyImg;
    }

    public void setEnemyImg(Image enemyImg) {
        this.enemyImg = enemyImg;
    }

    public Image getGunImage() {
        return gunImage;
    }

    public void setGunImage(Image gunImage) {
        this.gunImage = gunImage;
    }

    @Override
    public void update() {
        this.setPosX(Config.START_X);
        this.setPosY(Config.START_Y);
        this.setHealth(Config.NORMAL_EMEMY_HEALTH);
    }


}