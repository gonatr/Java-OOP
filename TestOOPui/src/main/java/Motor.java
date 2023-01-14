public class Motor {

    // attribute/field
    int speed;
    double regularPrice;
    String color;
    String name;

    public Motor(int speed, String color, double regularPrice) {
        this.speed = speed;
        this.color = color;
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {
        return 0;
    }

    void display() {
        System.out.println(">>>>>>>>Ini class Supper<<<<<<<<");
        System.out.println("Speed        : " + this.speed);
        System.out.println("Harga        : " + this.regularPrice);
        System.out.println("Warna        : " + this.color);
        System.out.println("Diskon Harga : " + this.getSalePrice());
    }

}
