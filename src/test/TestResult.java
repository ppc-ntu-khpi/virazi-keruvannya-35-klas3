package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        System.out.println(Exercise.Calculate(new long[]{ 1, 1, 3, 4, 10, 46, 3, 4, 3, 10 }));
        System.out.println(Exercise.Calculate(new long[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        System.out.println(Exercise.Calculate(new long[]{ 1, 2, -3, 4, 5, -3, -3, 8, 9, 10 }));
        System.out.println(Exercise.Calculate(new long[]{}));
    }
}
