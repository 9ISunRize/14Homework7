public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int month = 0;
        while (total<2459000) {
            month++;
            total= total+total/100;
            total=total+salary;
            System.out.println("Месяц "+month+" , сумма накоплений равна "+total+" рублей");

        }
    }

    public static void task2 () {
        System.out.println("Задача  2 ");
        int lin1 =0;
        while  (lin1<10) {
            lin1++;
            System.out.print ( lin1+" ");
        }
        System.out.println("         ");
        int  lin2=11;
        while ( lin2>1 ) {
            lin2--;
            System.out.print ( lin2+" ");
        }
    }
    public static void task3 () {
        System.out.println("Задача  3 ");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        int year = 0;
        while (year<10){
            year++;
            population+=population*dif/1000;
            System.out.println ("Год "+year+", численность населения составляет " +population);
        }
    }
    public static void task4 () {
        System.out.println("Задача  4 ");
        int salary= 15000;
        int total= 0;
        int month=0;
        while (total<12_000_000){
            month++;
            total+=total/100*7;
            total=total+salary;
            System.out.println("Месяц "+month+" , сумма накоплений равна "+total+" рублей");
        }
        System.out.println("Кол-во месяцев = "+month);
    }
    public static void task5 () {
        System.out.println("Задача  5 ");
        int salary= 15000;
        int total= 0;
        int month=0;
        while (total<12_000_000){
            month++;
            total+=total/100*7;
            total=total+salary;
            if (month % 6 == 0) {
                System.out.println("Месяц "+month+" , сумма накоплений равна "+total+" рублей");
            }
        }
        System.out.println("Кол-во месяцев = "+month);
    }
    public static void task6 () {
        System.out.println("Задача  6 ");
        int salary= 15000;
        int total= 0;
        int month=0;
        while (month <=108){
            month++;
            total+=total/100*7;
            total=total+salary;
            if (month % 6 == 0) {
                System.out.println("Месяц "+month+" , сумма накоплений равна "+total+" рублей");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7 ");
        int FirstFridayOfTheMonth = 7;
        while (FirstFridayOfTheMonth<=31) {
            System.out.println("Сегодня пятница, "+FirstFridayOfTheMonth+" -е число. Необходимо подготовить отчет");
            FirstFridayOfTheMonth = FirstFridayOfTheMonth + 7;
        }
    }
    public static void task8 () {
        System.out.println("Задача 8 ");
        int comeTrajectory = 79;
        for ( int year1 = 1823; year1 <= 2123; year1++) {
            if (year1 % comeTrajectory == 0) {
                System.out.println(year1);
            }
        }
    }
}