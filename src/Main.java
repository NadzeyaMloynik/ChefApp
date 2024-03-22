import Chef.Chef;
import Ingredients.Cucumber;
import Ingredients.Tomato;
import Ingredients.Vegetable;
import Ingredients.VegetablesGenerator;
import Menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vegetable> availableVegetables = VegetablesGenerator.generateVegetables(7, 3);
        Chef chef = new Chef();
        Menu menu = new Menu();
        menu.showMenu(availableVegetables, chef);
    }
}