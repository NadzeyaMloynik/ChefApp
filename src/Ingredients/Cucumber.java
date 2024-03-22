package Ingredients;

public class Cucumber extends Vegetable{
    private boolean isPimples;
    public Cucumber() {

    }
    public Cucumber(int calorie_gr, int grams, String color, boolean isPimples ){
        super(calorie_gr ,grams, color);
        this.isPimples = isPimples;
    }

    public boolean isPimples() {
        return isPimples;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Cucumber cucumber = (Cucumber) obj;
        if(getColor() == cucumber.getColor() && isPimples == cucumber.isPimples)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return 73 + getColor().length()*7 + (isPimples == true ? 1 : 3) * 7;
    }

    @Override
    public String toString() {
        return "Огурец " + (isPimples == true ? "пупырчатый" : "") + "\nМасса: " + this.getGrams() + "\nКаллорийность на 100г: " + this.calorie_gr
                + "\n" + "Общая калорийность: " + getCalorie() + "\n" + "Цвет: " + this.getColor() + "\n";
    }
}
