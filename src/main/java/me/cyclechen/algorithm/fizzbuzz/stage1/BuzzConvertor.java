package me.cyclechen.algorithm.fizzbuzz.stage1;

public class BuzzConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        // mutiples of 5
        return number % 5 == 0;
    }

    @Override
    public String execute(int number) {
        return "Buzz";
    }
}
