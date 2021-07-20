package com.statefarm;

public class SumOfPositivesCLI {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {

            if (Integer.parseInt(args[i]) > 0) {
                System.out.println(args[i]);
            }
        }
    }
}
