class Harley extends Motor {
    int weight;

    public Harley(int weight) {
        super(1100, "Hijau", 5000000);
        this.weight = weight;
    }

    public double getSalePrice() {
        if (weight >= 2000) {
            return regularPrice * 0.1;
        } else {
            return regularPrice * 0.2;
        }
    }

    public double totalHarga() {
        return regularPrice - getSalePrice();
    }

    void display() {
        System.out.println("Jenis Motor  : " + this.name);
        System.out.println("Weight       : " + this.weight);
        System.out.println("Speed        : " + super.speed);
        System.out.println("Harga        : " + super.regularPrice);
        System.out.println("Warna        : " + super.color);
        System.out.println("Harga Diskon : " + this.getSalePrice());
        System.out.println("Total Price  : " + this.totalHarga());
    }
}
