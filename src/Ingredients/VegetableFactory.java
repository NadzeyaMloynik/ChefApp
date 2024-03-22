package Ingredients;

import java.util.Random;

public class VegetableFactory {
    public static Vegetable getVegetableFromFactory(int choice){
        String[] colors = {"Красный", "Зелёный", "Черный", "Желтый"};
        int indexColor = new Random().nextInt(colors.length);
        int grams = new Random().nextInt(1000);
        boolean is = new Random().nextBoolean();
        switch (choice){
            case 0:
                return new Tomato(22, grams, colors[indexColor], is);
            case 1:
                return new Cucumber(14, grams, "Зелёный", is);
            case 2:
                return new Pepper(40, grams, colors[indexColor], is);
            default:
                throw new IllegalArgumentException("error");
        }
    }
}
