package org.fasttrackit;

public class Rescuer {
   private String name;
   private double money;

    public String getName(String cookis) {
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

        System.out.println(animal.getName() + " 's hunger level is now: " + animal.getHungerLevel());
    }
    public void entertain(Animal animal, EntertainmentActivity activity) {
        System.out.println(this.name+"just played some" + activity.getName() + "with" + animal.getName());
        animal.setHappinessLevel(animal.getHappinessLevel() + 1);
        System.out.println(animal.getName() + " 's happines level is now: " + animal.getHappinessLevel());

    }
}
