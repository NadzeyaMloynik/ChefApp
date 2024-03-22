package Chef;

import Ingredients.Vegetable;

import java.util.ArrayList;

public class Salad {
    private float weight = 0;
    private float calorie = 0;
    private ArrayList<Vegetable> vegetables = new ArrayList<>();
    public Salad(ArrayList<Vegetable> vegetables){
        this.vegetables = vegetables;
    }
    public void  addVegetable(Vegetable vegetable){
        vegetables.add(vegetable);
    }
    public void countCalorie() {
        for (Vegetable vegetable: vegetables){
            vegetable.countCalorie();
            calorie += vegetable.getCalorie();
        }
    }
    public void countWeight() {
        for(Vegetable vegetable: vegetables){
            weight += vegetable.getGrams();
        }
    }
    public float getCalorie() {
        return calorie;
    }

    public ArrayList<Vegetable> getVegetables() {
        return vegetables;
    }

    @Override
    public String toString() {
        String string = "Общий вес: " + weight + "\nОбщая калорийность: " + calorie + "\nСалат содержит следующие овощи: \n";
        for(Vegetable vegetable: vegetables)
            string += vegetable;
        return string;
    }
}
