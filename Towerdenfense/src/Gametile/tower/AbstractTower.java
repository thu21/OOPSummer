package Gametile.tower;


        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.image.Image;
        import cherry.GameTile;
        import Bullet.Abstractbullet;

public class AbstractTower implements GameTile {
    public  int posX;
    public  int posY;
    public  int speed;
    public  Image imgBullet;
    Image towerImg ;
    Image gunImg ;

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

    public Image getGunImg() {
        return gunImg;
    }

    public void setGunImg(Image gunImg) {
        this.gunImg = gunImg;
    }
    @Override
    public void render(GraphicsContext g) {
        g.drawImage(getTowerImg(),getPosX(),getPosY());
        g.drawImage(getGunImg(),getPosX(),getPosY());
    }

    @Override
    public void update() {}

    public void shoot(GraphicsContext g, Abstractbullet abstractBullet){
        abstractBullet.render(g);
        abstractBullet.update();
    }

}
