package com.java.NumberLuke;

import java.util.Scanner;
/**
 * @author Taranenko Nazar
 */

/**
 * Головний клас, в якому оголошуються об'єкти та їх методи
 */
public class Main {

    public static void main(String[] args) {
        Luke A = new Luke();
        A.entIndex();
        A.calcValue();

        System.out.println(A.toString());
        Function.function(A);
    }
}

