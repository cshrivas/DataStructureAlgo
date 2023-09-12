package com.cs.hr.stackQueue;

public class Problem36 {
    public static void main(String[] args) {
        Animal dog1= new Dog("olie");
        Animal dog2= new Dog("jimmy");
        Animal dog3= new Dog("cookie");
        Animal cat1= new Cat("meow");
        Animal cat2= new Cat("pussy");
        Animal cat3= new Cat("billy");

        AnimalQueue animalQueue= new AnimalQueue();
        animalQueue.enqueue(dog1);
        animalQueue.enqueue(cat1);
        animalQueue.enqueue(dog2);
        animalQueue.enqueue(cat2);
        animalQueue.enqueue(dog3);
        animalQueue.enqueue(cat3);

        System.out.println(animalQueue.dogDeque());
        System.out.println(animalQueue.anyDeque());
        System.out.println(animalQueue.catDeque());


    }
}
