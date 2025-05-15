// Owner.java
public class Owner {
    private String name;
    private Animal pet;

    public Owner(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void showPetInfo() {
        System.out.println("Nama Pemilik: " + name);
        System.out.print("Suara Hewan: ");
        pet.makeSound();
        System.out.println("Jenis Hewan: " + pet.getClass().getSimpleName());
        System.out.println("Rekam Medis: " + pet.getHealthRecord().getMedicalRecord());
        System.out.println("Tanggal Rekam Medis: " + pet.getHealthRecord().getDateCreated());
        System.out.println("--------------------------------");
    }
}
