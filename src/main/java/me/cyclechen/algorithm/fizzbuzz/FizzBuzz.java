package me.cyclechen.algorithm.fizzbuzz;

import me.cyclechen.algorithm.fizzbuzz.stage1.Stage1;
import me.cyclechen.algorithm.fizzbuzz.stage2.Stage2;

public class FizzBuzz {
    public static void main(String[] args) {
        Stage1 stage1 = new Stage1();
        for (int i = 1; i < 100; i++) {
            stage1.print(i);
        }

        Stage2 stage2 = new Stage2();
        for (int i = 1; i < 100; i++) {
            stage2.print(i);
        }
    }
}