package com.company;

public class Main {

    public static void main(String[] args) {
        int Number = 4;
        int finishNumber = 20;
        int count = 0;

        while (Number <= finishNumber) {
            Number++;
            if (!isEvenNumber(Number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + Number);

            if (count >= 5) {
                break;
            }
        }
        System.out.println("Total Even numbers are " + count);
    }


    public static boolean isEvenNumber(int Number) {
        if (Number % 2 == 0) {
            return true;
        }
        return false;
    }

}
