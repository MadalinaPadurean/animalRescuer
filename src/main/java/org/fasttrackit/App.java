package org.fasttrackit;


import java.time.LocalDateTime;

public class App {

    public static void main(String[] args) {
        Rescuer rescuer = new Rescuer();
        rescuer.setName("Lucky");
        rescuer.setMoney(400);

        Animal animal = new Animal();
        animal.setName("Luna");
        animal.setAge(2.5);
        animal.setHealhLevel(10);
        animal.setHappinessLevel(10);
        animal.setFavoriteActivityName("Running");
        animal.setFavoriteFoodName("Cookies");


        EntertainmentActivity activity = new EntertainmentActivity("Running");
        activity.setName("Running");

        Food food = new Food("Purina");
        food.setName("Purina");
        food.setQuantity(10);
        food.setPrice(78.99);
        food.setInStock(true);
        food.setExpiryDate(LocalDateTime.of(2021,12,31,0,0));

        MedicalStaff medic = new MedicalStaff();
        medic.setName("Dr. Lu");
        medic.setSpecialization("General Medicine");


        Game game = new Game();
        game.setRescuer(rescuer);
        game.setAnimal(animal);
        game.setMedic(medic);
    }

    {

    }
}
