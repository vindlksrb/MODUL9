class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }
@Override
public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.20; // +20%
}
    public double hitungHargaTiket(String kelasLayanan) {
        double basePrice = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Ekonomi")) return basePrice;
        else if (kelasLayanan.equalsIgnoreCase("Bisnis")) return basePrice * 1.25;
        else if (kelasLayanan.equalsIgnoreCase("VIP")) return basePrice * 1.50;
        return basePrice;
    }
}