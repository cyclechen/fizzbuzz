package me.cyclechen.algorithm.fizzbuzz.stage2;

public class DefaultConvertor extends Convertor {

    @Override
    public boolean verify(int number) {
        return true;
    }

    @Override
    public String execute(int number) {
        return String.valueOf(number);
    }
}
