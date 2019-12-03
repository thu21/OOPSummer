package Enemy;

        import javafx.scene.image.Image;
        import cherry.Config;

public class SmallerEnemy extends AbstractEnemy implements Enemy  {

    public SmallerEnemy(int posX, int posY, int health, int speed, int money) {
        super(posX, posY,Config.SMALLER_EMEMY_HEALTH, Config.SMALLER_ENEMY_SPEED, Config.SMALLER_ENEMY_MONEY);
    }


    Image enemyImg =Config.SMALLER_ENEMY_IMAGE;

    public Image getEnemyImg() {
        return enemyImg;
    }



    @Override
    public void update() {
        this.setPosX(Config.START_X);
        this.setPosY(Config.START_Y);
        this.setHealth(Config.SMALLER_EMEMY_HEALTH);

    }
}
