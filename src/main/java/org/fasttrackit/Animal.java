package org.fasttrackit;

public class Animal {
   private String name;
   private double age;
   private double healhLevel;
   private double hungerLevel;
   private double happinessLevel;
   private String favoriteActivityName;
   private String favoriteFoodName;

   public void expressJoy() {
       System.out.println(name + " is feeling good.");
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHealhLevel() {
        return healhLevel;
    }

    public void setHealhLevel(double healhLevel) {
        this.healhLevel = healhLevel;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public double getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(double happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavoriteActivityName() {
        return favoriteActivityName;
    }

    public void setFavoriteActivityName(String favoriteActivityName) {
        this.favoriteActivityName = favoriteActivityName;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }
}
