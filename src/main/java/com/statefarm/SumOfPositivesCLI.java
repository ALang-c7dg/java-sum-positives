package com.statefarm;

public class SumOfPositivesCLI {

    public static void main(String[] args) {

        int sumOfPositives = 0;
        for (int i = 0; i < args.length; i++) {

            int argAsNumber = Integer.parseInt(args[i]);
            if (argAsNumber > 0) {
                sumOfPositives += argAsNumber;
            }
        }
        System.out.println(sumOfPositives);
    }
}
