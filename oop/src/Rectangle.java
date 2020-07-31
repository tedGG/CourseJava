public class Rectangle {
    int height;
    int width ;


    Rectangle(int height,int width){
        this.height = height;
        this.width  = width;
    }
    Rectangle(){

    }
    public void Plowa(){
        int s = height + width;
        System.out.println("Площа прямокутника = "+s);
    }
    public void Perumetr(){
        int p = 2*(height + width);
        System.out.println("Периметр прямокутника = "+p);
    }
}
