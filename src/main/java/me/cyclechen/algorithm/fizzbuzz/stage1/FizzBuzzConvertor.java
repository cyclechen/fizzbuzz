package me.cyclechen.algorithm.fizzbuzz.stage1;

public class FizzBuzzConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        // a number is divisible of both 3 and 5
        return number % 15 == 0;
    }

    @Override
    public String execute(int number) {
        return "FizzBuzz";
    }
}
