public class CilsyAutoShop {
    public static void main(String[] args) {
        /*
         * Class Motor tidak ada diskon
         * diskon diberikan hanya kepada class Yamaha, Honda, dan Harley
         */
        Motor motor1 = new Motor(125, "Hitam", 1000000);
        motor1.display();

        System.out.println();
        System.out.println("============================");

        Honda motor2 = new Honda(2015, 50000);
        motor2.name = "Honda 11";
        motor2.display();

        System.out.println();
        System.out.println("============================");

        /*
         * Class Yamaha, Contoh Sepesifikasi yang sama
         * berbeda di CCuntimeter, Nama, dan Warna
         */
        Yamaha motor3 = new Yamaha(251);
        motor3.name = "Yamaha NX";
        motor3.display();

        System.out.println();

        Yamaha motorY = new Yamaha(150);
        motorY.name = "Yamaha Y";
        motorY.color = "Merah";
        motorY.display();

        System.out.println();
        System.out.println("============================");

        /*
         * Class Harley, Contoh Sepesifikasi yang sama
         * berbeda di Weight, Nama, dan Warna
         */
        Harley motor4 = new Harley(1000);
        motor4.name = "Harley Sporter NX";
        motor4.display();

        System.out.println();

        Harley motorH = new Harley(2100);
        motorH.name = "Harley HH";
        motorH.color = "Pink";
        motorH.display();

    }
}
