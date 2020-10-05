package sample;

import java.awt.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Food extends Rectangle {
    int posX,posY;
    public Food(int x,int y){
        super(Main.block_size,Main.block_size);
        posX = x;
        posY = y;
        setTranslateX(posX * Main.block_size);
        setTranslateY(posY * Main.block_size);

        setFill(Color.LIGHTGREEN);
        setStroke(Color.GREEN);

    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
