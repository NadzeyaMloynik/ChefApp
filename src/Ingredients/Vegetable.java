package Ingredients;

import javax.swing.*;

public abstract class Vegetable {
    protected int calorie_gr;
    private int calorie;
    private int grams;
    private String color;
    public Vegetable() {}
    public Vegetable(int calorie_gr,int grams, String color) {
        this.calorie_gr = calorie_gr;
        this.grams = grams;
        this.color = color;
        countCalorie();
    }
    public boolean getSomeVegetable(float count) {
        if(grams <= 0)
            return false;
        else {
            if(grams - count < 0)
                return false;
            grams -= count;
            return true;
        }
    }

    public void setColor(String color) { this.color = color; }
    public void setGrams(int grams) { this.grams = grams; }
    public void countCalorie(){this.calorie = (int)grams * calorie_gr / 100;}
    public int getCalorie() {
        return calorie;
    }
    public int getGrams() {
        return grams;
    }
    public String getColor(){ return color; }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Vegetable vegetable = (Vegetable) obj;
        if(color != vegetable.color)
            return false;
        else return true;
    }

    @Override
    public int hashCode() {
        return 73 + color.length()*7;
    }
}
