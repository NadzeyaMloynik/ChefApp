package Ingredients;

public class Tomato extends Vegetable{
    private boolean isCherry;
    public Tomato(){}
    public Tomato(int calorie_gr,int grams, String color, boolean isCherry){
        super(calorie_gr, grams, color);
        this.isCherry = isCherry;
    }
    public boolean isCherry() {
        return isCherry;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;
        Tomato tomato = (Tomato) obj;
        if(this.getColor() == tomato.getColor() && this.isCherry == tomato.isCherry)
            return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return 73 + this.getColor().length()*7 + (isCherry == true ? 1 : 3) * 5;
    }

    @Override
    public String toString() {
        return "Помидор " + (isCherry == true ? "черри" : "") + "\nМасса: " + this.getGrams() + "\nКаллорийность на 100г: " + this.calorie_gr
                + "\n" + "Общая калорийность: " + getCalorie() + "\n" + "Цвет: " + this.getColor() + "\n";
    }
}
