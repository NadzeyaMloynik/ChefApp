package Menu;

import Chef.Chef;
import Ingredients.Vegetable;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String menu = "1.Посмотреть на доступные овощи\n" +
            "2.Выбрать овощи по цвету\n" +
            "3.Выбрать овощи\n" +
            "4.Сделать салат\n" +
            "5.Подать салат\n" +
            "6.Найти овощи в салате по калорийносии\n" +
            "0.Отпустить повара домой\n";

    public void showMenu(ArrayList<Vegetable> availableVegetables, Chef chef) {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println(menu);
            String choice = scan.nextLine();
            switch (choice){
                case "1":
                    chef.lookAtVegetables(availableVegetables);
                    break;
                case "2":
                    chef.prepareVegetablesByColor(availableVegetables);
                    break;
                case "3":
                    chef.prepareVegetables(availableVegetables);
                    break;
                case "4":
                    chef.makeSalad();
                    break;
                case "5":
                    chef.getSalad();
                    break;
                case "6":
                    chef.lookAtVegetables(chef.findVegetablesInSalad());
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Пункт выбран неверно");
            }
        }

    }
}
