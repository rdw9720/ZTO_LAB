package com.company;

public class Animal {
    public enum FoodType {
        MEET,
        CORPS,
        ALL
    }
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 3.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 3.0;

    final String species;
    String name;
    Integer age;
   private Double weight;
   private Boolean alive;
   public final FoodType foodType;

    Animal(String species, String name) {
        this.alive = true;
        this.species = species;
        this.name = name;
        if (species.equals("canis")) {
            this.foodType = FoodType.ALL;
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("felis")) {
            this.foodType = FoodType.MEET;
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.foodType = FoodType.CORPS;
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        else {
            this.foodType = FoodType.ALL;
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public Double getWeight(){
        return this.weight;
    }
    public void feed(Double foodWeight, FoodType foodType){
        switch (foodType) {
            case ALL -> this.weight += 0.5 * foodWeight;
            break;
            case MEET -> this.weight += 0.7 * foodWeight;
            break;
            case CORPS -> this.weight += 0.3 * foodWeight;
            break;
        }
        System.out.println("thx for food");
    }
}

