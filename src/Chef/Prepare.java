package Chef;

import Ingredients.Vegetable;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prepare {
    public static void showAllVegetables(ArrayList<Vegetable> vegetables) {
        for (int i = 0; i < vegetables.size(); i++){
            System.out.print("№" + (i + 1) + "\n");
            System.out.println(vegetables.get(i));
        }
    }
    public static ArrayList<Vegetable> chooseVegetables(ArrayList<Vegetable> vegetables) {
        ArrayList<Vegetable> selectedVegetables = new ArrayList<Vegetable>();
        Scanner scan = new Scanner(System.in);
            System.out.println("Выберите овощи для салата: ");
            showAllVegetables(vegetables);
            while(true){
                System.out.println("Введите номер овоща и количество грамм\nВведите 0 для выхода");
                try{
                    System.out.print("Номер: ");
                    int number = scan.nextInt();
                    if (number == 0)
                        break;
                    else
                    if (number <= 0 || number > vegetables.size())
                        throw new RuntimeException("Число выходит за пределы");
                    System.out.print("Граммы: ");
                    int grams = scan.nextInt();
                    if(grams<=0)
                        throw new RuntimeException("Число выходит за пределы");
                    if(vegetables.get(number- 1).getSomeVegetable(grams)) {
                        selectedVegetables.add(vegetables.get(number - 1));
                        selectedVegetables.get(selectedVegetables.size()-1).setGrams(grams);
                    }
                    else System.out.println("Это слишком много...");
                }
                catch (InputMismatchException exception){
                    System.out.println("Число введенно некорректно");
                    scan.nextLine();
                }
                catch (RuntimeException exception){
                    System.out.println(exception.getMessage());
                }
            }
            return selectedVegetables;
    }
    public static ArrayList<Vegetable> sortVegetablesByColor(ArrayList<Vegetable> startVegetables, String color) {
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
        try {
            for(Vegetable vegetable: startVegetables){
                if(vegetable.getColor().equals(color))
                    vegetables.add(vegetable);
            }
            if (vegetables.size() == 0) throw new RuntimeException("Овощей такого цвета нет :(");
        }
        catch (RuntimeException exception){
            System.out.println(exception.getMessage());
        }
        finally {
            return vegetables;
        }
    }
    public static String chooseColor(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите цвет: ");
        String color = scan.nextLine();
        return color;
    }

}
