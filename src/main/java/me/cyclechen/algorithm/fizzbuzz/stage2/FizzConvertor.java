package me.cyclechen.algorithm.fizzbuzz.stage2;

public class FizzConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        // a number is divisible by 3 or has a 3 in it.
        return number % 3 == 0 || String.valueOf(number).contains("3");
    }

    @Override
    public String execute(int number) {
        return "Fizz";
    }
}
