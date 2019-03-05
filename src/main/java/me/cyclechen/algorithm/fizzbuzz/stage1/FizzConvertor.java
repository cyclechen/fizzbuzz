package me.cyclechen.algorithm.fizzbuzz.stage1;

public class FizzConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        // a number is divisible of both 3
        return number % 3 == 0;
    }

    @Override
    public String execute(int number) {
        return "Fizz";
    }
}
