package ru.netology.stat;

public class StatsService {
    public static void main(String[] args) {

    }

    public int findSum(int[] purchases) {
        int sum = 0;
        for (int pruchase : purchases) {
            sum += pruchase;
        }
        return sum;
    }


    public int findAverage(int[] purchases) {
        return findSum(purchases) / purchases.length;
    }


    public int findMax(int[] purchases) {
        int max = purchases[0];
        int number = 0;
        int numberMax = 0;
        for (int purchase : purchases) {
            number++;
            if (max <= purchase) {
                max = purchase;
                numberMax = number;
            }
        }
        return numberMax;


    }


    public int findMin(int[] purchases) {
        int min = purchases[0];
        int number = 0;
        int numberMin = 0;
        for (int purchase : purchases) {
            number++;
            if (min >= purchase) {
                min = purchase;
                numberMin = number;
            }
        }
        return numberMin;
    }


    public int findUnderAverage(int[] purchases) {
        int average = findAverage(purchases);
        int month = 0;
        int quantityUnder = 0;
        for (int purchase : purchases) {
            if (purchase < average) {
                month++;
                quantityUnder = month;
            }
        }
        return quantityUnder;

    }


    public int findOverAverage(int[] purchases) {
        int averge = findAverage(purchases);
        int month = 0;
        int quantityOver = 0;
        for (int purchase : purchases) {
            if (purchase > averge) {
                month++;
                quantityOver = month;
            }
        }
        return quantityOver;
    }
}
