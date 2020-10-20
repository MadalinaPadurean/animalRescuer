package org.fasttrackit;

public class Rescuer {
   private String name;
   private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void feed(Animal animal, Food food) {
        System.out.println(this.name + "just gave some" + food.getName() + "food to" + animal.getName());

        double hungerLevel = animal.getHungerLevel();
        hungerLevel--;
        animal.setHungerLevel(hungerLevel);

        System.out.println(animal.getName() + "'s hunger level is new: " + animal.getHungerLevel());

        if (food.getName().equals(animal.getFavoriteFoodName())) {
            animal.setHappinessLevel(animal.getHappinessLevel() + 1);
            System.out.println(animal.getName() + "'s happyness level is now:" + animal.getHappinessLevel());
        }
    }
    public void entertain(Animal animal, EntertainmentActivity activity) {
        System.out.println(this.name + " just dit/played some " + activity.getName() + " with " + animal.getName());
        int incrememt;

        if (activity.getName().equals(animal.getFavoriteFoodName())) {
            incrememt = 2;
        } else {
            incrememt = 1;
        }
        animal.setHappinessLevel(animal.getHappinessLevel() + incrememt);

        System.out.println(animal.getName() + "'s happiness level is now :" + animal.getHappinessLevel());
    }
}
