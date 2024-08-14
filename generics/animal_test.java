class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
class AnimalShelter<T extends Animal> {

    public void makeSound(T shelter) {
        shelter.sound();
    }
}
class AnimalAdder<T> {

    // 這裡使用 <? super Dog>，表示可以接受 Dog 或 Dog 的任何父類型
    public void add(T animal) {
        System.out.println("Adding animal: " + animal);
    }

    public static void addAnimal(AnimalAdder<? super Dog> shelter) {
        shelter.add(new Dog()); // 這裡可以添加 Dog 或 Dog 的子類型
    }
}

public class animal_test {
    public static void main(String[] args) {
        AnimalShelter<Animal> shelter = new AnimalShelter<>();
        shelter.makeSound(new Dog());
        shelter.makeSound(new Cat());

        AnimalAdder.addAnimal(new AnimalAdder<Animal>());
        AnimalAdder.addAnimal(new AnimalAdder<Animal>());
    }
}   

