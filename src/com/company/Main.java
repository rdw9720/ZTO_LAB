package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Animal("canis","Szarik");
    System.out.println("pies nazywa się " + dog.name);
    System.out.println("pies waży " + dog.getWeight());
    System.out.println(dog.species);
    dog.feed();
    dog.feed();
    dog.feed();
    System.out.println("Pies waży " + dog.getWeight());
    }
}
