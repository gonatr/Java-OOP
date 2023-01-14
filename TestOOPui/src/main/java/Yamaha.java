class Yamaha extends Motor {
    int cubicalCentimeter;

    public Yamaha(int cubicalCentimeter) {
        super(125, "Biru", 3000000);
        this.cubicalCentimeter = cubicalCentimeter;
    }

    public double getSalePrice() {
        if (cubicalCentimeter >= 250) {
            return regularPrice * 0.15;
        } else {
            return regularPrice * 0.1;
        }
    }

    public double totalHarga() {
        return regularPrice - getSalePrice();
    }

    void display() {
        System.out.println("Jenis Motor  : " + this.name);
        System.out.println("CCentimeter  : " + this.cubicalCentimeter);
        System.out.println("Speed        : " + super.speed);
        System.out.println("Harga        : " + super.regularPrice);
        System.out.println("Warna        : " + super.color);
        System.out.println("Harga Diskon : " + this.getSalePrice());
        System.out.println("Total Price  : " + this.totalHarga());
    }
}
