package day02;

public class MathAlgorithms {

    public int findGreatestCommonDivisor(int numberA, int numberB) {
        int greatestCommonDivisor = 1;
        for (int i = 2; i <= Math.min(numberA, numberB); i++) {
            if (numberA % i == 0 && numberB % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}