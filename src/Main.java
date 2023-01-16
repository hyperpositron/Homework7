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

    public static void task1() {
        System.out.println("Задача №1");   //Задача 1
        int salary = 0;
        int deposit = 2_459_000;
        int month = 0;
        while (salary < deposit) {
            System.out.println("«Месяц " + month + " , сумма накоплений равна " + salary + " рублей»");
            salary = salary + 15_000;
            month = month + 1;
        }
        System.out.println("«Месяц " + month + " , сумма накоплений равна " + salary + " рублей»");
    }

    public static void task2() {
        System.out.println("Задача №2");   //Задача 2
        int i = 0;
        int b = 10;
        while (i < b) {
            i = i + 1;
            System.out.print(" " + i);
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача №3");   //Задача 3
        double populationPeople = 12_000_000; //В стране Y население равно 12 миллионов человек.
        float birthCount = (float) 17 / 1000;//рождаемость человек на 1000
        float deathCount = (float) 8 / 1000;//смертность
        float deathAndBirth = birthCount - deathCount;
        int year = 0;
        while (year < 10) {
            populationPeople = (populationPeople + populationPeople * deathAndBirth);
            year = year + 1;
            System.out.println("« Год " + year + " , численность населения составляет " + (populationPeople) + " человек »");
        }
    }

    public static void task4() {
        System.out.println("Задача №4");   //Задача 4
        double sumDeposit = 15000d;
        double percent = 0.07d;
        int mounth = 1;
        int criticalSum = 12_000_000;

        while (sumDeposit <= criticalSum) {
            sumDeposit = sumDeposit * percent + sumDeposit;
            mounth = mounth + 1;
            System.out.println(mounth + " Месяц " + sumDeposit + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача №5");   //Задача 5
        double sumDeposit = 15000d;
        double percent = 0.07d;
        int mounth = 1;
        int criticalSum = 12_000_000;

        while (sumDeposit <= criticalSum) {
            sumDeposit = sumDeposit * percent + sumDeposit;
            mounth = mounth + 1;
            if (mounth % 6 == 0) {
                System.out.println(mounth + " Месяц " + sumDeposit + " рублей");
            }
        }

    }

    public static void task6() {
        System.out.println("Задача №6");   //Задача 6
        double sumDeposit = 15000d;
        double percent = 0.07d;
        int mounth = 1;
        int criticalSum = 12_000_000;

        while (sumDeposit < criticalSum) {
            sumDeposit = sumDeposit * percent + sumDeposit;
            mounth = mounth + 1;
            if (mounth % 6 == 0) {
                System.out.println(mounth + " Месяц " + sumDeposit + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача №7");   //Задача 7
        int friday = 7;
        int dayPerMounth = 30;
        int day = 0;
        while (day <= dayPerMounth) {
            day = day + 1;
            if (day % friday == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

    }

    public static void task8() {
        System.out.println("Задача №8");   //Задача 8
        int cometFlies = 79;/*комета пролетает каждый 79й год*/
        int yearToDate = 1823;/*начало года*/
        int presentYear = 2123;/*конец года*/

        while (presentYear > yearToDate) {
            yearToDate++;
            if (yearToDate % cometFlies == 0) {
                System.out.println(yearToDate);
            }
        }
    }


}
