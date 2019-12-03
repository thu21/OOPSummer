package cherry;



import Enemy.AbstractEnemy;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class Player  {
    int money ;
    int health = 100;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public  int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void addPlayer(Group root)
    {
        Label pointMoney = new Label("MONEY: "+getMoney() );
        pointMoney.setLayoutX(Config.SCREEN_WIDTH );
        pointMoney.setLayoutY(Config.SCREEN_HEIGHT -50);
        Label pointHealth = new Label("HEALTH: "+getHealth());
        pointHealth.setLayoutX(Config.SCREEN_WIDTH );
        pointHealth.setLayoutY(Config.SCREEN_HEIGHT -100);
       // Group root =new Group();
        root.getChildren().add(pointMoney);
        root.getChildren().add(pointHealth);
    }

    public  void update (){
        this.money+= Config.NORMAL_ENEMY_MONEY;
    }
}
