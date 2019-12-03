package Gametile.tower;


        import javafx.scene.image.Image;
        import javafx.scene.canvas.GraphicsContext;
        import cherry.Config;
        import Bullet.Abstractbullet;

        import java.util.ConcurrentModificationException;

public class SniperTower extends AbstractTower implements Tower {
    public  int posX=70*6;
    public  int posY=70*3;
    public SniperTower(){}

    public SniperTower(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
    }

    Image towerImg = Config.SNIPER_TOWER_IMAGE;


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

    public Image getTowerImg() {
        return towerImg;
    }

    public void setTowerImg(Image towerImg) {
        this.towerImg = towerImg;
    }



}