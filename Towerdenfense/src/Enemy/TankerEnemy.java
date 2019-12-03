package Enemy;


        import javafx.scene.image.Image;
        import cherry.Config;

public class TankerEnemy extends AbstractEnemy implements Enemy{

    public TankerEnemy(int posX, int posY, int health, int speed, int money) {
        super(posX, posY, Config.TANKER_EMEMY_HEALTH, Config.TANKER_ENEMY_SPEED, Config.TANKER_ENEMY_MONEY);
    }

    Image enemyImg =Config.TANKER_ENEMY_IMAGE;


    public Image getEnemyImg() {
        return enemyImg;
    }

    public void setEnemyImg(Image enemyImg) {
        this.enemyImg = enemyImg;
    }


    @Override
    public void update() {
        this.setPosX(Config.START_X);
        this.setPosY(Config.START_Y);
        this.setHealth(Config.TANKER_EMEMY_HEALTH);

    }
}
