package org.example;

import static java.lang.Math.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int a = 15;
            int b = 3;
            double c = 5.0;

            System.out.println("Арифмитические операции над типами int: ");
            System.out.println("Сложение:"+ (a+b));
            System.out.println("Вычитание:"+(a-b));
            System.out.println("Умножение:"+(a*b));
            System.out.println("Деление:"+ (a/b)+"\n");

            System.out.println("Сложение int и double:" + (a+c)+"\n");

            System.out.print("Логические операции:");
            if (a >= 5 && a<= 20)
                System.out.println(a+ "\n");
            else
                System.out.println(b + "\n");

            System.out.println("Вещественный тип:");
            System.out.println("Максимальное позитивное значение:" + Double.MAX_VALUE);
            System.out.println("Минимальное позитивное значение:" + Double.MIN_VALUE);
            System.out.println("Минимальное значение double:" + (-Double.MAX_VALUE) + "\n");
            double posInf = Double.POSITIVE_INFINITY;
            System.out.println("Положительная бесконечность:" + posInf);
            double negInf = Double.NEGATIVE_INFINITY;
            System.out.println("Отрицательная бесконечность:" + negInf);
            System.out.println("Переполнение при арифметической операции:");
            double perebor =1.0/0.0;
            System.out.println(perebor);

        }
    }
