// Cat.java
public class Cat extends Animal {
    public Cat(HealthRecord record) {
        super(record);
    }

    @Override
    public void makeSound() {
        System.out.println("Meong!");
    }
}
