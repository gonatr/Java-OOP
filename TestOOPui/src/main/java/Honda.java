class Honda extends Motor {
    int year;
    int manufacturerDiscount;

    public Honda(int year, int manufacturerDiscount) {
        super(125, "Kuning", 7000000);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    public double getSalePrice() {
        return regularPrice - manufacturerDiscount;
    }

    void display() {
        System.out.println("Jenis Motor  : " + this.name);
        System.out.println("Tahun        : " + this.year);
        System.out.println("Manufaktur   : " + this.manufacturerDiscount);
        System.out.println("Speed        : " + super.speed);
        System.out.println("Harga        : " + super.regularPrice);
        System.out.println("Warna        : " + super.color);
        System.out.println("Harga Diskon : " + this.getSalePrice());
    }

}
