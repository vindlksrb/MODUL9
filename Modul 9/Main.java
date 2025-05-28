public class Main {
    public static void main(String[] args) {
        Transportasi[] transports = new Transportasi[3];
        transports[0] = new Bus("Bus Trans", 40, "Bandung");
        transports[1] = new Kereta("Kereta Api", 100, "Surabaya");
        transports[2] = new Pesawat("Pesawat Air", 150, "Medan");
        for (Transportasi t : transports) {
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket
            String kelas = t instanceof Bus ? "Bisnis" : (t instanceof Kereta ? "VIP"
            System.out.println(t.getNama() + " ke " + t.getTujuan() + " - Harga tiket
        }
    }
}