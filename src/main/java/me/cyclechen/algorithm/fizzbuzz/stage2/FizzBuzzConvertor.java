package me.cyclechen.algorithm.fizzbuzz.stage2;

public class FizzBuzzConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        // a number is divisible by 3 or 5 or has a 3 or 5 in it
        return String.valueOf(number).contains("3") || String.valueOf(number).contains("5") || number % 3 == 0 || number % 5 == 0;
    }

    @Override
    public String execute(int number) {
        return "FizzBuzz";
    }
}
