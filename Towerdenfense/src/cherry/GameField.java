package cherry;


        import Gametile.Mountain;
        import Gametile.Road;
        import Gametile.Target;
        import Gametile.tower.NormalTower;
        import Spawer.Spawer;
        import javafx.animation.AnimationTimer;
        import javafx.application.Application;
        import javafx.scene.Group;
        import javafx.scene.Scene;
        import javafx.scene.canvas.Canvas;
        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.control.Button;
        import javafx.scene.image.*;
        import javafx.scene.media.Media;
        import javafx.scene.media.MediaPlayer;
        import javafx.stage.Stage;

        import Bullet.*;
        import Enemy.*;
        import Gametile.*;
        import Gametile.tower.*;
        import Spawer.*;


        import java.io.File;
        import java.net.URL;
        import java.util.ArrayList;
        import java.util.List;



public class GameField extends Application {
 //   boolean inGame=true;
    GameStage gameStage = new GameStage();

    final int screenWidth= Config.SCREEN_WIDTH;
    final int screenHeight= Config.SCREEN_HEIGHT;

    int isChoosed=0;
    GraphicsContext gc;

    //tạo dữ liệu người chơi
      Player player = new Player();


    List<GameEntity> entities = new ArrayList<>();// danh sách thực thể

    Road road = new Road();// đường
    Mountain mountain = new Mountain();// núi
    List<Abstractbullet> bullets = new ArrayList<>();// đạn
    //    NormalBullet bullets = new NormalBullet();
    NormalTower normalTower = new NormalTower();//tháp
    SniperTower sniperTower= new SniperTower();
    MachineGunTower machineGunTower=new MachineGunTower();

    List<AbstractTower> towers= new ArrayList<>();

    Spawer spawer = new Spawer();// sinh ra quân địch
    Target target = new Target();// điểm kết thúc
    List<AbstractEnemy> enemies = spawer.doSpawer();// cho tất cả quân địch vào cùng 1 list
  //  Player playerr=new Player();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {


        String musicFile = "nhacnen.mp3";     // For example

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();
        // Tao Canvas
        Canvas canvas =  new Canvas(screenWidth, screenHeight);
        gc = canvas.getGraphicsContext2D();

        //tạo nút để nhấn chọn thêm tháp normal
        Button normalTowerButton= new Button();
        normalTowerButton.setLayoutX(screenWidth);
        normalTowerButton.setLayoutY(100);
        ImageView gunImgNormal = new ImageView("file:Image/plant1.gif");
        gunImgNormal.setFitWidth(50);
        gunImgNormal.setFitHeight(50);
        normalTowerButton.setGraphic(gunImgNormal);
// tạo nút chọn thêm tháp sniper

        Button sniperTowerButton= new Button();
        sniperTowerButton.setLayoutX(screenWidth);
        sniperTowerButton.setLayoutY(200);
        ImageView gunImgSniper = new ImageView("file:Image/plant2.gif");
        gunImgSniper.setFitWidth(50);
        gunImgSniper.setFitHeight(50);
        sniperTowerButton.setGraphic(gunImgSniper);
// tạo  nút tạo thêm tháp machineGun

        Button machineGunTowerButton= new Button();
        machineGunTowerButton.setLayoutX(screenWidth);
        machineGunTowerButton.setLayoutY(300);
        ImageView gunImgMachine = new ImageView("file:Image/plant3.png");
        gunImgMachine.setFitWidth(50);
        gunImgMachine.setFitHeight(50);
        machineGunTowerButton.setGraphic(gunImgMachine);



        //tạo nút menu để quay về lúc bắt đầu chơi
        Button menuButton= new Button();
        menuButton.setLayoutX(screenWidth);
        menuButton.setLayoutY(0);
        ImageView menu = new ImageView("file:Image/back.png");
        menu.setFitWidth(50);
        menu.setFitHeight(60);
        menuButton.setGraphic(menu);
// nhấn menu quay về scene ban đầu
        menuButton.setOnAction(event-> {
            gameStage.start(stage);
        });

        // Tao root container
        Group root = new Group();
        root.getChildren().addAll(canvas,normalTowerButton,sniperTowerButton,machineGunTowerButton,menuButton);

        player.addPlayer(root);

        // Tao scene
        Scene scene = new Scene(root);

        // Them scene vao stage
        stage.setScene(scene);
        stage.show();

        // khi kick chuột vào button
        // tạo tháp
        normalTowerButton.setOnAction(event->{
            entities.add(normalTower);//});
           // entities.add(sniperTower);
            //entities.add(machineGunTower);
            // AbstractBullet normalBullet = new NormalBullet()

         sniperTowerButton.setOnAction(event1 -> entities.add(sniperTower));
         machineGunTowerButton.setOnAction(event1 -> entities.add(machineGunTower));
        // sniperTowerButton.setOnAction((event1 -> entities.add(sniperTower)));

            isChoosed=1;
            System.out.println("is choose");
        });
        //***

        // update khung theo thời gian tính bằng nano giây
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                render();
                update();
            }
        };

        timer.start();
        Normalbullet bullet = new Normalbullet(normalTower.getPosX(), normalTower.getPosY(),Config.NORMAL_BULLET_SPEED,Config.NORMAL_BULLET_IMAGE);
       bullets.add(bullet);

        Sniperbullet sniperbullet=new Sniperbullet(sniperTower.getPosX(),sniperTower.getPosY(),Config.SNIPER_BULLET_SPEED,Config.SNIPER_BULLET_IMAGE);
        bullets.add(sniperbullet);

        MachineGunBullet bulletmachine=new MachineGunBullet(machineGunTower.getPosX(),machineGunTower.getPosY(),Config.MACHINE_GUN_BULLET_SPEED,Config.MACHINE_GUN_BULLET_IMAGE);
        bullets.add(bulletmachine);


       // bullets.addAll(bullet,bulletmachine,sniperbullet);
//
        entities.add(road);//thêm đường
        entities.add(mountain);//thêm núi
        entities.addAll(enemies);




    }


    public void impact(AbstractEnemy abstractEnemy ,AbstractTower abstractTower, Abstractbullet abstractBullet) {
        if (isChoosed == 1) {
            System.out.println("is choosedddd");
            abstractBullet.shoot(abstractEnemy, abstractTower, gc);// nếu tháp đã được xây quân địch đến gần đạn sẽ bắn ra
            if(isDie(abstractEnemy, abstractBullet)) abstractEnemy.update();// quân địch chết update lại tọa độ
            //player.setMoney(m+=abstractEnemy.getMoney());
            player.update();
            System.out.println("Money   "+player.getMoney());
           // player.addPlayer(r);
        }
    }

    public static boolean isDie(AbstractEnemy abstractEnemy , Abstractbullet abstractBullet){
        int health= getHealthUpdate(abstractEnemy, abstractBullet);
        if(health==0) return true;
        return false;
    }
    public static  int getHealthUpdate(AbstractEnemy abstractEnemy, Abstractbullet abstractBullet) {
        int health= abstractEnemy.getHealth();

        if (Math.abs(abstractEnemy.getPosX() - abstractBullet.getPosX()) <= 40
                && Math.abs(abstractEnemy.getPosY() - abstractBullet.getPosY()) <= 40) {

            abstractEnemy.setHealth(health-=50);

            //System.out.println("Money"+player.getMoney());
        }
        return health;
    }
    public void update() {

            for (int i = 0; i < enemies.size(); i++) {

                impact(enemies.get(i), normalTower, bullets.get(0));
                // impact(enemies.get(i),sniperTower,bullets.get(0));
                //  impact(enemies.get(i),machineGunTower,bullets.get(0));
                //target.goEnd(enemies,i,player);


                // impact(enemies.get(i),normalTower, bullets.get(0));
//            System.out.println("health             "+ player.getHealth());

            }
            for (int i = 0; i < enemies.size(); i++) {
                impact(enemies.get(i), sniperTower, bullets.get(1));
                // target.goEnd(enemies,i,player);
            }
            for (int i = 0; i < enemies.size(); i++) {
                impact(enemies.get(i), machineGunTower, bullets.get(2));
                target.goEnd(enemies, i, player);
            }

            // impact(normalEnemy,normalTower,bullet);
//        System.out.println("up date enemy"+ normalEnemy.getHealth()+ " "+ normalEnemy.getPosX()+" "+ normalEnemy.getPosY());
//        if((normalEnemy.getPosX()>= Config.FINAL_X-20 & normalEnemy.getPosY() >= Config.FINAL_Y-20)) {
//            System.out.println("tạo lại normal enemy");
//            normalEnemy.update();
//             entities.forEach(gameEntity -> gameEntity.update());// còn k update lại
//        }
            // entities.forEach(gameEntity -> gameEntity.update());

    }
    public void render() {
        System.out.println("update gameEntiny");
        entities.forEach(gameEntity -> gameEntity.render(gc));

//        Duration.millis(10000);
    }
}
