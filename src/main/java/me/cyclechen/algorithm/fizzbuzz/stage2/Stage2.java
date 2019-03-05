package me.cyclechen.algorithm.fizzbuzz.stage2;

public class Stage2 {

    private Convertor convertor;

    public Stage2() {

        convertor = new FizzConvertor();
        Convertor buzzConvertor = new BuzzConvertor();
        Convertor fizzBuzzConvertor = new FizzBuzzConvertor();
        Convertor defaultConvert = new DefaultConvertor();

        convertor.setNextConvertor(buzzConvertor);
        buzzConvertor.setNextConvertor(fizzBuzzConvertor);
        fizzBuzzConvertor.setNextConvertor(defaultConvert);

    }
    public String convert(int number) {
        return convertor.convert(number);
    }

    public void print(int number) {
        System.out.println(convert(number));
    }

}
