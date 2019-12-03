package  Enemy;



import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

import cherry.Config;

public abstract class AbstractEnemy implements Enemy{
    int posX = Config.START_X;
    int posY = Config.START_Y;

    int health;
    int speed;
    int money;

    public  AbstractEnemy(){}
    public AbstractEnemy (int posX, int posY, int health, int speed, int money) {
        this.posX = posX;
        this.posY = posY;
        this.health = health;
        this.speed = speed;
        this.money = money;
    }

    int gunRotation =-90;
    int enemyRotation = 90;

    Image enemyImg ;
    Image gunImage ;

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGunRotation() {
        return gunRotation;
    }

    public void setGunRotation(int gunRotation) {
        this.gunRotation = gunRotation;
    }

    public int getEnemyRotation() {
        return enemyRotation;
    }

    public void setEnemyRotation(int enemyRotation) {
        this.enemyRotation = enemyRotation;
    }

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

  /*  public void deleteMob() {
        //inGame = false;

        speed = 0;
        this.setEnemyImg(null);


    }
    public void loseHealth(int t) {
        health -= t;

        checkDeath();
    }

    public void checkDeath() {
        if (getHealth() == 0) {
            deleteMob();
        }
    }*/


    public Image rotate(Image im,int rotation)//ham xoay hinh, rotation la do xoay
    {
        ImageView iv = new ImageView(im);
        iv.setRotate(rotation);
        SnapshotParameters params = new SnapshotParameters();
        params.setFill(Color.TRANSPARENT);
        Image img = iv.snapshot(params, null);
        return img;
    }

    public void render(GraphicsContext g) {
        g.drawImage(rotate(getEnemyImg(),enemyRotation),getPosX(),getPosY());
     //   g.drawImage(rotate(getGunImage(),gunRotation),getPosX(),getPosY());
        if(getPosX()>Config.SECOND_X && getPosY()== Config.SECOND_Y)
        {
            posX-= getSpeed();
            enemyRotation = 0;
            System.out.print( health+ "   no           " + getPosX()+" "+getPosY()+"\n");
          //  gunRotation = -90;
        }
        else if(getPosX()==Config.THIRD_X&&getPosY()<Config.THIRD_Y)
        {
            posY+=getSpeed();
            enemyRotation = -90;
            System.out.print( health+ "  3            " + getPosX()+" "+getPosY()+"\n");
          //  gunRotation = 0;

        }
        else if(getPosX()>Config.FOURTH_X && getPosY()==Config.FOURTH_Y)
        {
            posX-=getSpeed();
           // gunRotation =90;
            enemyRotation =0;
            System.out.print( health+ "         4     " + getPosX()+" "+getPosY()+"\n");
        }
        else if(getPosX()== Config.FIVE_X&&getPosY()<Config.FIVE_Y)
        {
            posY+=getSpeed();
          //  gunRotation =0;
            enemyRotation =-90;
            System.out.print( health+ "     5         " + getPosX()+" "+getPosY()+"\n");
        }
       else if(getPosX()>Config.SIXTH_X && getPosY()== Config.SIXTH_Y)
        {
            posX-=getSpeed();
           // gunRotation =90;
            enemyRotation =0;
            System.out.print( health+ "   6           " + getPosX()+" "+getPosY()+"\n");
        }
        else if(getPosX()== Config.SEVENT_X&&getPosY()<Config.SEVENT_Y)
        {
            posY+=getSpeed();
          //  gunRotation =0;
            enemyRotation =-90;
            System.out.print( health+ "    7          " + getPosX()+" "+getPosY()+"\n");
        }
        else if(getPosX()>Config.EIGHT_X && getPosY()== Config.EIGHT_Y)
        {
            posX-=getSpeed();
           // gunRotation =90;
            enemyRotation =0;
            System.out.print( health+ "      8        " + getPosX()+" "+getPosY()+"\n");
        }
        else if(getPosX()== Config.NIGHT_X&&getPosY()<Config.NIGHT_Y)
        {
            posY+=getSpeed();
            //  gunRotation =0;
            enemyRotation =-90;
            System.out.print( health+ "     9         " + getPosX()+" "+getPosY()+"\n");
        }
        else if(getPosX()>Config.FINAL_X&&getPosY()==Config.FINAL_Y)
        {
            posX-=getSpeed();
           // gunRotation = 0;
            enemyRotation = 0;
            System.out.print( health+ "             " + getPosX()+" "+getPosY()+"\n");
        }
        System.out.print( health+ "              " + getPosX()+" "+getPosY()+"\n");
    }
    public abstract void update();

    //   public abstract void isDestroy();
}
