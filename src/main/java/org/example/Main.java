package org.example;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {


        try {
            // Цикл для продолжения работы программы или выхода из нее
            while (true) {
                // Создается объект "Scanner" с именем "number", который читает данные из стандартного ввода
                var number = new Scanner(System.in);
                // Переменная для хранения символа перехода на новую строку
                String newLine = System.lineSeparator();
                // Вывод запроса пользователю с вариантами выбора
                System.out.print(newLine + "Если хотите завершить программу - введите 1" + "\n" + "Если хотите продолжить или начать - 2: ");
                // Считывание выбора пользователя
                int numberEx = number.nextInt();

                if (numberEx == 2) {
                    // Создается объект "Scanner" с именем "storona", который читает данные из стандартного ввода
                    var storona = new Scanner(System.in);

                    // Вывод запроса на ввод первой стороны треугольника
                    System.out.print("Введите первую сторону треугольника:");

                    // Считывание первой стороны треугольника
                    int firstStorona = (storona.nextInt());

                    // Вывод запроса на ввод второй стороны треугольника
                    System.out.print("Введите вторую сторону треугольника:");

                    // Считывание второй стороны треугольника
                    int secondStorona = (storona.nextInt());

                    // Вывод запроса на ввод третьей стороны треугольника
                    System.out.print("Введите третью сторону треугольника:");

                    // Считывание третьей стороны треугольника
                    int thirdStorona = (storona.nextInt());

                    // Проверка, является ли треугольник прямоугольным
                    if ((Math.pow(firstStorona, 2) + Math.pow(secondStorona, 2)) == Math.pow(thirdStorona, 2)) {
                        System.out.print("a, b и c являются сторонами прямоугольного треугольника");
                    }
                    // Проверка, является ли треугольник равносторонним
                    else if (firstStorona == secondStorona && secondStorona == thirdStorona) {
                        System.out.print("a, b и c являются сторонами равностороннего треугольника");
                    }
                    // Проверка, является ли треугольник равнобедренным
                    else if (firstStorona == secondStorona || secondStorona == thirdStorona || thirdStorona == firstStorona) {
                        System.out.print("a, b и c являются сторонами равнобедренного треугольника");
                    }
                    // Проверка, является ли треугольник невозможным
                    else if (firstStorona + secondStorona <= thirdStorona || secondStorona + thirdStorona <= firstStorona || thirdStorona + firstStorona <= secondStorona) {
                        System.out.print("a, b и c не являются сторонами треугольника");
                    }
                    // В противном случае треугольник является обычным
                    else {
                        System.out.print("a, b и c являются сторонами обычного треугольника");
                    }
                } else {
                    // Выход из программы
                    break;
                }
            }

            // Обработка исключений
        } catch (Exception e) {
            System.out.print(e);// Вывод описания ошибки
        }
    }
}
