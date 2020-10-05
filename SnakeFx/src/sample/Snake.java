package sample;

import javafx.scene.paint.Color;

import java.util.ArrayList;

public class Snake {
    ArrayList<Block> blocks = new ArrayList<>();
    Block head;
    Block tail;
    public Snake(int il,Controller f){
        int ipx = f.getW()/2;
        int ipy = f.getH()/2;

        head =  new Block(ipx,ipy,null,f);
        blocks.add(head);
        head.setFill(Color.BLUE);
        tail = head;
        for(int i = 1;i<il;i++){
            Block b =  new Block(ipx + i,ipy,tail,f);
            blocks.add(b);
            tail = b;
        }
    }
    public int getDirection(){
        return head.direction;
    }
    public void setDirection(int d){
        head.direction = d;

    }


}
