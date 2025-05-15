// Dog.java
public class Dog extends Animal {
    public Dog(HealthRecord record) {
        super(record);
    }

    @Override
    public void makeSound() {
        System.out.println("Guk-Guk!");
    }
}

