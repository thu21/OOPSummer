package cherry;



import javafx.scene.image.Image;

public final class Config {
    public static final int SCREEN_WIDTH= 70*16;//x
    public static final int SCREEN_HEIGHT=70*10;//y


    public static final int START_X= 70*16;
    public static final int START_Y=20;

    public static final int SECOND_X= 70*14-60;
    public static final int SECOND_Y=20;


    public static final int THIRD_X= 70*14-60;
    public static final int THIRD_Y=70*3-30;


    public static final int FOURTH_X= 70*8-50;
    public static final int FOURTH_Y=70*3-30;


    public static final int FIVE_X=70*8-50;
    public static final int FIVE_Y=70*5-50;


   public static final int SIXTH_X= 70*5-30;
    public static final int SIXTH_Y=70*5-50;

    public static final int SEVENT_X= 70*5-30;
    public  static  final  int SEVENT_Y=70*7-40;

    public static final int EIGHT_X= 70*3-30;
    public  static  final  int EIGHT_Y=70*7-40;

    public static  final  int NIGHT_X=70*3-30;
    public  static  final  int NIGHT_Y=70*8+30;


    public static final int FINAL_X= 70*1;
    public static final int FINAL_Y=70*8+30;



    public static final int NORMAL_EMEMY_HEALTH= 100;
    public static final int NORMAL_ENEMY_SPEED=10;
    public static final int NORMAL_ENEMY_MONEY=100;

    public static final int TANKER_EMEMY_HEALTH= 200;
    public static final int TANKER_ENEMY_SPEED=10;
    public static final int TANKER_ENEMY_MONEY=200;

    public static final int SMALLER_EMEMY_HEALTH= 100;
    public static final int SMALLER_ENEMY_SPEED=10;
    public static final int SMALLER_ENEMY_MONEY=300;

    public static final int BOSS_EMEMY_HEALTH= 500;
    public static final int BOSS_ENEMY_SPEED=10;
    public static final int BOSS_ENEMY_MONEY=500;


    public static final int NORMAL_BULLET_SPEED=10;
    public static final int MACHINE_GUN_BULLET_SPEED=10;
    public static final int SNIPER_BULLET_SPEED=10;


    public static final Image NORMAL_BULLET_IMAGE = new Image("file:Image/bullet1.png");
    public static final Image SNIPER_BULLET_IMAGE = new Image("file:Image/bullet2.png");
    public static final Image MACHINE_GUN_BULLET_IMAGE = new Image("file:Image/bullet3.png");



    public static Image NORMAL_ENEMY_IMAGE =new Image("file:Image/zombie1.png");


    public static Image SMALLER_ENEMY_IMAGE =new Image("file:Image/zombie2.png");


    public static Image TANKER_ENEMY_IMAGE =new Image("file:Image/zombie3.png");


    public static Image BOSS_ENEMY_IMAGE =new Image("file:Image/zombie4.png");

    public static Image NORMAL_TOWER_IMAGE =new Image("file:Image/plant1.gif");

    public static Image SNIPER_TOWER_IMAGE =new Image("file:Image/plant2.gif");

    public static Image MACHINE_GUN_TOWER_IMAGE =new Image("file:Image/plant3.png");

}
