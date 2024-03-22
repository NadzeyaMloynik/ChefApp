package checks;

public class Check {
    public static void checkInterval (int interval[]) throws RuntimeException {
        if(interval.length != 2)
            throw new RuntimeException("Интервал неверен");
        else if(interval[0] > interval[1])
            throw new RuntimeException("Первое число интервала не может быть больше второго");
        else if(interval[0] == interval[1])
            throw new RuntimeException("Интервал не может состоять из одинаковых чисел");
    }
}
