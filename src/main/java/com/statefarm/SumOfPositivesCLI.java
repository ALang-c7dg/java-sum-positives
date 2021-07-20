package com.statefarm;

public class SumOfPositivesCLI {

    public static void main(String[] args) {

        int sumOfPositives = 0;
        for (int i = 0; i < args.length; i++) {

            if (Integer.parseInt(args[i]) > 0) {
                sumOfPositives += Integer.parseInt(args[i]);
            }
        }
        System.out.println(sumOfPositives);
    }
}
