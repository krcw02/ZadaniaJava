public class Z1 {
    public static void main(String[] args) {
        SamochodOsobowy auto1 = new SamochodOsobowy(x,"456", "456", "czarny", 20000, 4.5, 10, 120000, 50, new SilnikBenzynowy());

        auto1.jedz(300);
        auto1.tankuj(5);

        System.out.println(auto1);
    }
}
