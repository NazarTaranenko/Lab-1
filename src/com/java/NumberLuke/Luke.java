package com.java.NumberLuke;

import java.util.Scanner;

/**
 * Клас, який містить інофрмацію про числа Люка
 */
public  class Luke {
    private int Value;
    private int Index;

    public Luke() {
        Index=0;
        Value =0;
    }

    /**
     *Конструктор класа com.java.NumberLuke.Main.Luke
     * @param value Значення числа
     * @param index Його порядок в ряді
     */
    public Luke(int value, int index) {
        Value = value;
        Index = index;
    }

    /**
     * Getter поля Value
     * @return значення value
     */
    public int getValue() {
        return Value;
    }

    /**
     * Getter поля Index
     * @return значення Index
     */
    public int getIndex() {
        return Index;
    }

    /**
     * Setter поля Value
     * @param value значення числа
     */
    public void setValue(int value) {

        Value = value;
    }

    /**
     * Setter поля Index
     * @param index порядок числа в ряді Люка
     */
    public void setIndex(int index) {
        Index = index;
    }

    /**
     * Перегружений метод для виводу класу
     * @return Строку з інформацією про клас com.java.NumberLuke.Main.Luke
     */
    @Override
    public String toString() {
        return "Index(n)=" + Index +
                ", Value(Ln)=" + Value;
    }

    /**
     * Метод обчислення значення числа в ряді Люка та присвоєння його в поле Value
     *  Метод нічого не вертає
     */
    public void calcValue() {
        int a1 = 2, a2 = 1, a3;

        for (int i = 0; i < getIndex(); i++) {
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
        }
        Value =a1;

    }

    /**
     * Метод вводу користуввачем інформації про число(його індекс)
     * Метод нічого не вертає
     */
    public void entIndex(){
        System.out.print("Введіть індекс(n) числа в ряді Люка- ");
        Scanner in1= new Scanner(System.in);
        int in2= in1.nextInt();
        if(in2>0)
            setIndex(in2);
        else {
            System.out.println("Ви ввели не коректні дані спробуйте ще раз");
            entIndex();
        }
    }
}
