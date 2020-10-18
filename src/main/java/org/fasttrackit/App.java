package org.fasttrackit;


import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer();
        rescuer.name = "Lucky";
        rescuer.money = 400;

        Animal animal = new Animal();
        animal.name = "Luna";
        animal.age = 2.5;
        animal.healhLevel = 10;
        animal.happinessLevel = 10;
        animal.favoriteFoodName = "Running";
        animal.favoriteActivityName = "Cookies";
        EntertainmentActivity activity = new EntertainmentActivity();
        activity.name = "Running";

        Food food = new Food();
        food.name = "Purina";
        food.quantity = 10;
        food.price = 78.99;
        food.inStock= true;
        food.expiryDate = LocalDateTime.of(2021, 12, 31, 0, 0);

        MedicalStaff medic = new MedicalStaff();
        medic.name = "Dr. Lu";
        medic.specialization = "General Medicine";

        Game game = new Game();
        game.rescuer = rescuer;
        game.animal = animal;
        game.medic = medic;
    }

    {




    }
}
