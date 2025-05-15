// Main.java
public class Main {
    public static void main(String[] args) {
        HealthRecord dogRecord = new HealthRecord("Anjing sehat, divaksin", "2025-05-01");
        HealthRecord catRecord = new HealthRecord("Kucing sehat, belum divaksin", "2025-05-10");

        Animal dog = new Dog(dogRecord);
        Animal cat = new Cat(catRecord);

        Owner owner1 = new Owner("Budi", dog);
        Owner owner2 = new Owner("Siti", cat);

        owner1.showPetInfo();
        owner2.showPetInfo();
    }
}

