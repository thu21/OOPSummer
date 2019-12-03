package Gametile.tower;


        import javafx.scene.image.Image;
        import javafx.scene.canvas.GraphicsContext;
        import cherry.Config;
        import Bullet.Abstractbullet;

public class NormalTower extends AbstractTower implements Tower {
    public  int posX=70*12;
    public  int posY=70*1;
    public NormalTower(){}

    public NormalTower(int posX, int posY){
        this.posX=posX;
        this.posY=posY;
    }

    Image towerImg = Config.NORMAL_TOWER_IMAGE;


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