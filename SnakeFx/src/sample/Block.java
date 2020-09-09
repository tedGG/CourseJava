package sample;

import java.awt.*;
import javafx.scene.shape.Rectangle;

public class Block extends Rectangle {
    static final int UP = 0,RIGHT = 1, DOWN = 2,LEFT = 3;
    int direction= LEFT;
    int posX,posY,oldPosX,oldPosY;
    int maxX,maxY;

    Block previous;
    public Block(int x,int y,Block p,Controller f){
        super(Main.block_size,Main.block_size);
        posX = x;
        posY = y;

        setTranslateX(posX * Main.block_size);
        setTranslateY(posY * Main.block_size);

        previous = p;
        maxX=f.getW();
        maxY= f.getH();
    }
    public void update(){
        oldPosX = posX;
        oldPosY = posY;
        if(previous==null){
            switch (direction){
                case UP: {
                    moveUp();
                    break;
                }
                case DOWN: {
                    moveDown();
                    break;
                }
                case LEFT: {
                    moveLeft();
                    break;
                }
                case RIGHT: {
                    moveRight();
                    break;
                }
            }
        }else{
            posX = previous.oldPosX;
            posY = previous.oldPosY;
        }
        updatePosition();
    }
    public void moveUp(){
        posY--;
        if(posY<0){
            posY = maxY-1;
        }
    }

    public void moveDown(){
        posY++;
        if(posY>= maxY){
            posY = 0;
        }
    }
    public void moveLeft(){
        posX--;
        if(posY<0){
            posX = maxX-1;
        }
    }
    public void moveRight(){
        posX++;
        if(posX>=maxX){
            posX= 0;
        }
    }
    public void updatePosition(){

        setTranslateX(posX*Main.block_size);
        setTranslateY(posY*Main.block_size);
    }
}
