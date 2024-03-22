package Chef;
import Ingredients.Vegetable;
import checks.Check;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chef {
    private Salad salad;
    private ArrayList<Vegetable> selectedVegetables = new ArrayList<Vegetable>();
    public void prepareVegetables(ArrayList<Vegetable> vegetables){
        selectedVegetables = Prepare.chooseVegetables(vegetables);
    }
    public void prepareVegetablesByColor(ArrayList<Vegetable> vegetables){
        vegetables = Prepare.sortVegetablesByColor(vegetables, Prepare.chooseColor());
        selectedVegetables = Prepare.chooseVegetables(vegetables);
    }
    public void makeSalad() {
        if(selectedVegetables.size() == 0){
            System.out.println("Я не приготовил салатик, потому что не выбрал овощи :(");
            return;
        }
        salad = new Salad(selectedVegetables);
        salad.countCalorie();
        salad.countWeight();
    }
    public void lookAtVegetables(ArrayList<Vegetable> vegetables){
        System.out.println("Овощи в наличии: ");
        for (Vegetable vegetable: vegetables){
            System.out.println(vegetable);
        }
    }
    public void getSalad() {
        if(salad == null)
            System.out.println("Салат не готов, может попробуем еще раз его приготовить?");
        else System.out.println(salad);
    }
    private int[] chooseInterval() {
        Scanner scan = new Scanner(System.in);
        int interval[] = new int[2];
        while (true) {
            try {
                System.out.print("Введите нижнюю границу: ");
                int a = scan.nextInt();
                System.out.print("Введите верхнюю границу: ");
                int b = scan.nextInt();
                interval[0] = a;
                interval[1] = b;
                Check.checkInterval(interval);
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Число введено некорректно");
            } catch (RuntimeException exception) {
                System.out.println(exception.getMessage());
            }
        }
        return interval;
    }
    public ArrayList<Vegetable> findVegetablesInSalad(){
        int[] interval = chooseInterval();
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>();
        if (salad == null) {
            System.out.printf("Салата нет, чё ищешь? а?");
            return null;
        }
        for(Vegetable vegetable: salad.getVegetables()){
            if(vegetable.getCalorie() >= interval[0] && vegetable.getCalorie() <= interval[1])
                vegetables.add(vegetable);
        }
        return vegetables;
    }
}
