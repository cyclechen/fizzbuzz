package me.cyclechen.algorithm.fizzbuzz.stage2;

public class BuzzConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        // a number is divisible by 5 or has a 5 in it
        return number % 5 == 0 || String.valueOf(number).contains("5");
    }

    @Override
    public String execute(int number) {
        return "Buzz";
    }
}
