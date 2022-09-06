package com.java.NumberLuke;

import java.util.Scanner;

/**
 * Клас, в якому описані функція перевірки умови задачі
 */
public  class Function {
    /**
     * Функція для перевірки умови задачі( n*L(n+1)>(n+1)*Ln)
     * @param luke1 Число задане користувачем
     */
    public static void function(Luke luke1){
        /**
         * @param luke2 Число під індексом n+1
         */
        Luke luke2= new Luke( );
        luke2.setIndex(luke1.getIndex()+1);
        luke2.calcValue();
        System.out.println(luke2);
        System.out.println("Перевірка умови задачі n*L(n+1)>(n+1)*Ln");
        int num1 = luke1.getIndex()*luke2.getValue();
        int num2 = luke2.getIndex()*luke1.getValue();

        System.out.println("n*L(n+1)= " +num1 );
        System.out.println("(n+1)*Ln= " +num2 );

        if(num1>num2)
            System.out.println("Умова задачі виконується ");
        else
            System.out.println("Умова задачі не виконується ");

    }
}

