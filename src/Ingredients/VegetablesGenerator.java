package Ingredients;

import java.util.ArrayList;
import java.util.Random;

public class VegetablesGenerator{
    public static ArrayList<Vegetable> generateVegetables(final int NUMBER_VEG, int maxChoice){
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
        for(int i = 0; i < NUMBER_VEG; i++){
            int choice = new Random().nextInt(maxChoice);
            vegetables.add(VegetableFactory.getVegetableFromFactory(choice));
        }
        return vegetables;
    }
}
