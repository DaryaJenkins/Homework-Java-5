package ru.netology.services;

public class CalculationService {
    public int calculate(int income, int expenses, int threshold) {

        int months = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                months++;

            } else {
                money += income;
                money -= expenses;
            }
        }

        return months;
    }
}