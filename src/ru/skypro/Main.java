package ru.skypro;

public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.print(+i);
        }
        System.out.println();
        for (int a = 10; a >= 1; a--) {
            System.out.print(a);
        }
        System.out.println();





        for (int i = 5;i < 31; i = i + 7) {
            System.out.println("Сегодня пятница "+i+"-е число.Необходимо подготовить отчет.");
        }




        int a = 2022;
        int b = a - 200;
        int c = a + 100;
        int d = 0;


        while (true) {
            d = d + 79;
            if (d < b) {
                continue;
            }
            if (d > c) {
                break;
            }
            System.out.println(d);
        }
    }
}




















































