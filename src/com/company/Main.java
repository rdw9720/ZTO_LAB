package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal("canis","Szarik");
    System.out.println("pies nazywa się " + dog.name);
    System.out.println("pies waży " + dog.getWeight());
    System.out.println(dog.species);
    dog.feed(0.1, Animal.FoodType.ALL);
    dog.feed(0.1, Animal.FoodType.ALL);
    dog.feed(0.1, Animal.FoodType.ALL);
    dog.feed(0.1, Animal.FoodType.ALL);
    dog.feed(0.1, Animal.FoodType.ALL);
    dog.feed(0.1, Animal.FoodType.ALL);

    System.out.println("Pies waży " + dog.getWeight());

    Human me = new Human("Robert","Wenta");
    System.out.println(me.getWeight());
    System.out.println(me.species);
    System.out.println(me.name);
    Phone nokia = new Phone();
    nokia.operationSystem = Phone.OperationSystem.WINDOWS;
    }
}
