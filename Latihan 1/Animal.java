// Animal.java
public abstract class Animal {
    protected HealthRecord record;

    public Animal(HealthRecord record) {
        this.record = record;
    }

    public abstract void makeSound();

    public HealthRecord getHealthRecord() {
        return record;
    }
}
