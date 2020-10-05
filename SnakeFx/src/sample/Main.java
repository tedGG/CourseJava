package sample;


import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class Main extends Application {
    static int block_size = 20;
    int width = 30,height = 20;
    int il =10;
    long then = System.nanoTime();
    boolean changed =false;
    int nextUpdate;
    boolean hasNext = false;
    Controller f;

    @Override
    public void start(Stage primaryStage) throws Exception{

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

       f = new Controller(width,height);
        f.addSnake(new Snake(il,f));
        Label score = new Label("Score: 0");
        score.setFont(Font.font("tahoma",23));




        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                if (now-then>1000000000/8){
                    f.update();
                    then=now;
                    score.setText("Score: " + f.score);
                    changed = false;
                    if(hasNext){
                        setDirection(f.snake,nextUpdate);
                        hasNext = false;
                    }
                    if(f.isDead()){
                        stop();
                        Alert al =  new Alert(Alert.AlertType.INFORMATION);
                        al.setHeaderText("You lost");
                        al.setContentText("Your score is " + f.score);
                        Platform.runLater(al::showAndWait);
                        al.setOnHidden(event -> {

                            root.getChildren().clear();
                            f=  new Controller(width,height);
                            f.addSnake(new Snake(il,f));
                            score.setText("Score: 0");
                            root.getChildren().addAll(f,score);
                            start();
                        });

                    }
                }
            }
        };
        timer.start();

        root.getChildren().addAll(f,score);


        Scene scene = new Scene(root);


        scene.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.UP)&& f.snake.getDirection()!=Block.DOWN){
                setDirection(f.snake,Block.UP);
            }
            if(event.getCode().equals(KeyCode.DOWN)&& f.snake.getDirection()!=Block.UP){
                setDirection(f.snake,Block.DOWN);
            }
            if(event.getCode().equals(KeyCode.RIGHT)&&f.snake.getDirection()!=Block.LEFT){
                setDirection(f.snake,Block.RIGHT);
            }
            if(event.getCode().equals(KeyCode.LEFT)&& f.snake.getDirection()!=Block.RIGHT){
                setDirection(f.snake,Block.LEFT);
            }
        });
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Snake");

        primaryStage.show();
    }
    public void setDirection(Snake s,int d){
        if(!changed) {
            s.setDirection(d);
            changed =true;
        }else
        {
            hasNext =true;
            nextUpdate = d;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
