public class Sircle {
    double radius;
    double diametr;

    Sircle(int radius,int diametr){
        this.radius = radius;
        this.diametr = diametr;
    }
    public void Dov(){
        double c = 2*Math.PI * radius;
        System.out.printf("Довжина круга = %.2f",c);
    }
    public void plowa(){
        double plo = Math.PI * Math.pow(diametr,2);
        System.out.printf("Площа круга = %.2f \n",plo);
    }
}
