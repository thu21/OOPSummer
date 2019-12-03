package Spawer;

    import javafx.scene.canvas.GraphicsContext;
        import cherry.Config;
        import Enemy.*;

        import java.util.ArrayList;
        import java.util.List;

public  class Spawer implements EnemySpawer {
    int startX = Config.START_X;
    int startY = Config.START_Y;

    public Spawer() {
    }

    @Override
    public List<AbstractEnemy> doSpawer() {
        List<AbstractEnemy> enemies = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (i < 4) {
                NormalEnemy normalEnemy = new NormalEnemy(startX, startY , Config.NORMAL_EMEMY_HEALTH, Config.NORMAL_ENEMY_SPEED, Config.NORMAL_ENEMY_MONEY);

                enemies.add(normalEnemy);

                startX += 100;
            } else if (i < 8) {
                SmallerEnemy smallerEnemy = new SmallerEnemy(startX-300, startY, Config.SMALLER_EMEMY_HEALTH, Config.SMALLER_ENEMY_SPEED, Config.SMALLER_ENEMY_MONEY);
                enemies.add(smallerEnemy);
               startX += 100;
            } else if (i < 30) {
                TankerEnemy tankerEnemy = new TankerEnemy(startX-300, startY, Config.TANKER_EMEMY_HEALTH, Config.TANKER_ENEMY_SPEED, Config.TANKER_ENEMY_MONEY);

                enemies.add(tankerEnemy);
               // startY += 100;
            } else {
                BossEnemy bossEnemy = new BossEnemy(startX, startY, Config.BOSS_EMEMY_HEALTH, Config.BOSS_ENEMY_SPEED, Config.BOSS_ENEMY_MONEY);

                enemies.add(bossEnemy);

            }

        }
        return enemies;
    }



    @Override
    public void render(GraphicsContext g) {

    }

    @Override
    public void update() {

    }
}
