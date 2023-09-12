package com.cs.hr.stackQueue;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class AnimalQueue {
    private LinkedList<Animal> dogs;
    private LinkedList<Animal> cats;

    public AnimalQueue(){
        this.dogs=new LinkedList<>();
        this.cats=new LinkedList<>();
    }
    private int counter=0;

    public void enqueue(Animal animal){
        animal.setOrder(counter);
        counter++;
        if (animal instanceof Dog){
            dogs.push(animal);
        }else {
            cats.push(animal);
        }
    }

    public Animal dogDeque(){
        return dogs.pop();
    }

    public Animal catDeque(){
       return cats.pop();
    }

    public Animal anyDeque(){

        if(dogs.size()==0 && cats.size()>0)
            cats.pop();
        else if(dogs.size()>0 && cats.size()==0)
            dogs.pop();
        else if(dogs.size()==0 && cats.size()==0)
            throw new EmptyStackException();

        if (cats.peek().getOrder() > dogs.peek().getOrder()) {
            return cats.pop();
        } else {
            return dogs.pop();
        }
    }

}
