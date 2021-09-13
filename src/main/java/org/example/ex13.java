/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 McGreggor Kennison
 */


package org.example;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex13 {

    // main
    public static void main(String[] args) {

        // initialize variables, convert rate from percent, and calculate final total
        double principal = get_principal();
        double rate = get_rate();
        double years = get_years();
        double compound = get_compound();
        double calc_rate = rate / 100.0;
        double A = principal * Math.pow((1 + (calc_rate / compound)), (compound * years));

        // set formats for principal/years/compound and final, and set rounding mode
        DecimalFormat df_no_zero = new DecimalFormat("0.##");
        DecimalFormat df_final = new DecimalFormat("#.00");
        df_final.setRoundingMode(RoundingMode.CEILING);

        // print output
        System.out.println("$" + df_no_zero.format(principal) + " invested at "
                + rate + "% for " + df_no_zero.format(years) + " years compounded "
                + df_no_zero.format(compound) + " times per year is $"
                + df_final.format(A) + ".");

    }

    // gets principal
    public static double get_principal() {

        // prompts for input and returns scan
        System.out.print("Enter the principal: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets rate in percent
    public static double get_rate() {

        // prompts for input and returns scan
        System.out.print("Enter the rate of interest: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets time in years
    public static double get_years() {

        // prompts for input and returns scan
        System.out.print("Enter the number of years: ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

    // gets times compounded
    public static double get_compound() {

        // prompts for input and returns scan
        System.out.print("What is the number of times the interest is compounded per year? ");
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }

}
