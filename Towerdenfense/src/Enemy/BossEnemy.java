package Enemy;




        import javafx.scene.image.Image;
        import cherry.Config;

public class BossEnemy extends AbstractEnemy implements Enemy {
    public BossEnemy(int posX, int posY, int health, int speed, int money) {
        super(posX, posY, Config.BOSS_EMEMY_HEALTH, Config.BOSS_ENEMY_SPEED, Config.BOSS_ENEMY_MONEY);
    }
    Image enemyImg =Config.BOSS_ENEMY_IMAGE;
  //  Image gunImage = Config.BOSS_GUN_IMAGE;

    public Image getEnemyImg() {
        return enemyImg;
    }

    public void setEnemyImg(Image enemyImg) {
        this.enemyImg = enemyImg;
    }

   // public Image getGunImage() {
   //     return gunImage;
   // }

  //  public void setGunImage(Image gunImage) {
  //      this.gunImage = gunImage;
   // }

    @Override
    public void update() {
        this.posX = Config.START_X;
        this.posY = Config.START_Y;
        this.health = Config.BOSS_EMEMY_HEALTH;

    }
}
