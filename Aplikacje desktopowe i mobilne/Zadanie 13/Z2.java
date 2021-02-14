public class Z2 {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(2);
        System.out.println("is odd "+number.isOdd());
        System.out.println("is even "+number.isEven());
        System.out.println("sqrt "+number.sqrt());
        System.out.println("pow "+number.pow(2));
        System.out.println("add "+number.add(5));
        System.out.println("subtract "+number.subtract(4));
    }
}

class MyNumber {
    int a;

    public MyNumber(int a) {
        this.a = a;
    }

    public boolean isOdd() {
        if (a % 2 != 0)
            return true;
        else
            return false;
    }
    public boolean isEven() {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }
    public double sqrt(){
        return Math.sqrt(a);
    }
    public double pow(int x){
        return Math.pow(a, x);
    }
    public double add(int x){
        return a+x;
    }
    public double subtract(int x){
        return a/x;
    }
}
