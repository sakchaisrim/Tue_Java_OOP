package tue10;

public class Main {

    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        Sedan s = new Sedan();
        System.out.println(s.cashRate());

        Vehicle v = new Sedan(); // using an Interface as a Type
        System.out.println(v.ePassRate());
    }
    public static void demo2() {
        SedanAbstract s = new SedanAbstract();
        System.out.println(s.cashRate());

        VehicleAbstract v = new SedanAbstract(); // using Abstract
        System.out.println(v.ePassRate());
    }
}
