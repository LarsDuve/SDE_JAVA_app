package com.hz;

import com.hz.facade.TravelFacade;
import com.hz.factory.BoatCreator;
import com.hz.factory.CarCreator;
import com.hz.factory.PlaneCreator;
import com.hz.factory.TransportCreator;
import com.hz.strategy.CalculatorContext;
import com.hz.strategy.MinusOperationStrategy;
import com.hz.strategy.MultiplicationOperationStrategy;

public class Main {

    public static void main(String[] args) {

        // --TRANSPORT--

        // distance: km                     DONE

        // type of transport                DONE

        // capacity: number of people       Redundant

        // ecofriendly: A to F              Redundant

        // fuel price                       DONE

        // discount calculator

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();

        // Ask user which type of transport they want to use
        String q1 = "What type of transport do you need? [car, plane, boat...]";
        writer.write(q1);

        String choiceTransport = reader.readLine();

        // "Better" if statement
        TransportCreator transportCreator = null;
        switch (choiceTransport) {
            case "car" -> transportCreator = new CarCreator();
            case "plane" -> transportCreator = new PlaneCreator();
            case "boat" -> transportCreator = new BoatCreator();
            default -> writer.write("invalid choice, you broke it");
        }


        // Ask user how far they would like to travel
        String q2 = "How many kilometers would you like to travel?";
        writer.write(q2);

        String choiceDistance = reader.readLine();


        // Ask user how far they would like to travel
        String q3 = "How many percent of discount would you like?";
        writer.write(q3);

        double choiceDiscount = Double.parseDouble(reader.readLine()); // Discount must be provided between 100 and 0

        assert transportCreator != null;
        CalculatorContext halfPrice = new CalculatorContext(new MultiplicationOperationStrategy(transportCreator.getPrice(), choiceDiscount));


//        Facade does not get used
//        TravelFacade.startTravel(choiceDistance, transportCreator.getPrice());

        System.out.println("Price for travelling:");
        halfPrice.compute(); // Discounted price is written

        System.out.println("type of transport: " + transportCreator.getTransport() + "  chosen distance: " + choiceDistance + "  fuel price (per km): €" + transportCreator.getPrice());
    }

}