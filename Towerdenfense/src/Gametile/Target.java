package Gametile;

  import javafx.scene.canvas.GraphicsContext;
        import cherry.Config;
        import cherry.GameTile;
        import cherry.Player;
        import Enemy.AbstractEnemy;
        import Enemy.NormalEnemy;
        import Gametile.tower.AbstractTower;

        import java.util.List;

public class Target implements GameTile {


    @Override
    public void render(GraphicsContext g) {

    }

    @Override
    public void update() {

    }
    public void goEnd(List<AbstractEnemy> enemies, int index, Player player){
        if(enemies.get(index).getPosX()== Config.FINAL_X && enemies.get(index).getPosY()==Config.FINAL_Y){
            AbstractEnemy enemy = enemies.get(index);
            enemy.setPosX(-50);
            enemy.setPosY(-50);
            enemy.setSpeed(0);

            enemies.remove(index);
            player.setHealth(player.getHealth()-10);



        }
    }
}
