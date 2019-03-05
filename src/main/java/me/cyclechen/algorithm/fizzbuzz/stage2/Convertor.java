package me.cyclechen.algorithm.fizzbuzz.stage2;

public abstract class Convertor {

    private Convertor nextConvertor;

    public final String convert(int number) {
        return verify(number) ? execute(number) : nextConvertor.convert(number);
    }

    public void setNextConvertor(Convertor nextConvertor) {
        this.nextConvertor = nextConvertor;
    }

    public abstract boolean verify(int number);

    public abstract String execute(int number);

}
