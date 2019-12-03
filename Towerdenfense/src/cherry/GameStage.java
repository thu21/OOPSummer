package cherry;


        import javafx.application.Application;
        import javafx.scene.Group;
        import javafx.scene.Scene;
        import javafx.scene.canvas.Canvas;
        import javafx.scene.canvas.GraphicsContext;
        import javafx.scene.media.Media;
        import javafx.scene.media.MediaPlayer;
        import javafx.stage.Stage;
        import javafx.scene.control.Button;
        import javafx.scene.image.Image;
        import javafx.scene.image.ImageView;
        import java.awt.*;
        import java.io.File;
        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.net.URL;

        import  javafx.scene.layout.AnchorPane;
        import cherry.Config;

public class GameStage extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
     /*   String musicFile = "BAT.mp3";     // For example

        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();*/


        final int screenWidth= Config.SCREEN_WIDTH;
        final int screenHeight= Config.SCREEN_HEIGHT;


        Canvas canvas0= new Canvas(screenWidth, screenHeight);

        //FileInputStream input = new FileInputStream("Image/tt.jpg");
       // Image image = new Image(input);

     /*   final URL resource = getClass().getResource("a.mp3");
        final Media media = new Media(resource.toString());
        final MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();*/


        ImageView background = new ImageView("file:Image/bac.gif");
        background.setFitHeight(screenHeight);
        background.setFitWidth(screenWidth);


        Button playGame= new Button();
        playGame.setLayoutX(70*4);
        playGame.setLayoutY(70*6);
        ImageView imagePlay = new ImageView("file:Image/play.gif");
        imagePlay.setFitWidth(400);
        imagePlay.setFitHeight(150);
        playGame.setGraphic(imagePlay);

        Group root= new Group();
        root.getChildren().addAll(canvas0,background, playGame);
        Scene scene1= new Scene(root);

        stage.setScene(scene1);
        stage.show();

        GameField field= new GameField();

        playGame.setOnAction(event->{
            field.start(stage);
        });
    }
}
