package me.cyclechen.algorithm.fizzbuzz.stage1;

public class Stage1 {

    private Convertor convertor;

    public Stage1() {
        convertor = new FizzBuzzConvertor();
        Convertor fizzConvertor = new FizzConvertor();
        Convertor buzzConvertor = new BuzzConvertor();
        Convertor defaultConvert = new DefaultConvertor();

        convertor.setNextConvertor(fizzConvertor);
        fizzConvertor.setNextConvertor(buzzConvertor);
        buzzConvertor.setNextConvertor(defaultConvert);
    }

    public String convert(int number) {
        return convertor.convert(number);
    }

    public void print(int number) {
        System.out.println(convert(number));
    }
}
