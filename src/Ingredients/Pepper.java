package Ingredients;

public class Pepper extends Vegetable{
    private boolean isSpicy;
    public Pepper() {}
    public Pepper(int calorie_gr, int grams, String color, boolean isSpicy ){
        super(calorie_gr ,grams, color);
        this.isSpicy = isSpicy;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Pepper pepper = (Pepper) obj;
        if(getColor() == pepper.getColor() && isSpicy == pepper.isSpicy)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return 73 + getColor().length()*7 + (isSpicy == true ? 1 : 3) * 11;
    }

    @Override
    public String toString() {
        return "Перец " + (isSpicy == true ? "острый" : "") + "\nМасса: " + this.getGrams() + "\nКаллорийность на 100г: " + this.calorie_gr
                + "\n" + "Общая калорийность: " + getCalorie() + "\n" + "Цвет: " + this.getColor() + "\n";
    }
}
