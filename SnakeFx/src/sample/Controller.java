package sample;

import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;


public class Controller extends Pane {
    private int w,h;
    ArrayList<Block> blocks =  new ArrayList<>();
    int score = 0;
    Food f;
    Snake snake;

    public Controller(int width, int height) {
        this.w = width;
        this.h = height;
        setMinSize(w * Main.block_size ,h * Main.block_size);
        setBackground(new Background(new BackgroundFill(Color.WHITE,null,null)));
        setBorder(new Border(new BorderStroke(Color.BLACK,BorderStrokeStyle.SOLID,null,new BorderWidths(1))));
        addFood();
    }
    public void addSnake(Snake s){
        snake = s;
        for(Block b: s.blocks){
            addBlock(b);
        }
    }
    public void update(){
        for(Block b : blocks){
            b.update();
        }
        if (isEaten(f)){
            score+=20;
            addFood();
            addNewBlock();
        }
    }
    public void addNewBlock(){
        Block b =  new Block(snake.tail.oldPosX,snake.tail.oldPosY,snake.tail,this);
        snake.tail=b;
        addBlock(b);
    }

    public void addFood(){
        int randomX = (int) (Math.random()*w);
        int randomY= (int) (Math.random()*h);

        Food food = new Food(randomX,randomY);
        getChildren().add(food);
        getChildren().remove(f);
        f=food;

    }
    private void addBlock(Block b){
        getChildren().add(b);
        blocks.add(b);
    }
    public boolean isDead(){
        for(Block b: blocks){
            if (b!=snake.head){
                if(b.posX==snake.head.posX && b.posY==snake.head.posY){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isEaten(Food f){
        if(f==null) {
            return false;
        }
        return f.getPosX() == snake.head.posX && f.getPosY()==snake.head.posY;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }
}
