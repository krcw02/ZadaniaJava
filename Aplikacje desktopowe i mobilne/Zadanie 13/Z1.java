public class Z1{
    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat(2, 4);
        System.out.println("p:"+ prostokat.p());
        System.out.println("ob:"+ prostokat.ob());
        System.out.println("p:"+ prostokat.d());
    }
    
}
class Prostokat{
    double a;
    double b;
    public Prostokat(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double p(){
        return a*b;
    }
    public double ob(){
        return ((2*a)+(2*b));
    }
    public double d(){
        return Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
    }
}