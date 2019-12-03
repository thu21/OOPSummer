package Bullet;


        import cherry.GameEntity;
        import javafx.scene.image.Image;
        import cherry.Config;

        import Enemy.*;
       import Gametile.tower.*;

public class Normalbullet extends Abstractbullet implements GameEntity {
    int posX;
    int posY;
    int speed;
    Image img = Config.NORMAL_BULLET_IMAGE;
    ;

    public Normalbullet() {
    }

    public Normalbullet(int posX, int posY, int speed, Image img) {
        this.posX = posX;
        this.posY = posY;
        this.speed = speed;
        this.img = img;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

}
