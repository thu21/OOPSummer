package Bullet;


        import cherry.GameEntity;
        import cherry.Player;
        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.image.Image;
        import cherry.Config;


        import Enemy.*;
       import Gametile.tower.*;

public abstract class  Abstractbullet implements GameEntity {
    int posX;
    int posY;
    int speed;
    Image img;

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

    public void render(GraphicsContext g) {
        g.drawImage(this.getImg(), this.getPosX()+20, this.getPosY());
        System.out.println("bullet" + this.getPosX() + " " + this.getPosY());
    }

    public void update() {
    }


   // Player player=new Player();
   /// int m=player.getMoney();
  // AbstractEnemy abstractEnemy=new AbstractEnemy() ;
    //set phạm vi khi địch gần đến tháp thì bắn
    public void shoot(AbstractEnemy enemy, AbstractTower tower, GraphicsContext g) {
        if (Math.abs(enemy.getPosX() - tower.getPosX()) <= 300 && enemy.getPosY() <= tower.getPosY()) {
            {
                render(g);
                int x = getPosX();
                this.setPosX(x += this.getSpeed());
            }
          //  if (this.getPosX() == enemy.getPosX()) {
            if(Math.abs(this.getPosX()-enemy.getPosX())==50){
                //this.update();
                this.setPosX(tower.getPosX());
                this.setPosY(tower.getPosY());
               // enemy.loseHealth(50);
                //enemy.setHealth()
                //Player player=new Player();
               // int m=
              //  player.setMoney(m+=50);
               // System.out.println("health"+enemy.getHealth());
            }
        }
        System.out.println("health"+enemy.getHealth());
        System.out.println("shoot");
    }
}
