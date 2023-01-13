public class Main {
    public static void main(String[] args) {
        task1();
       // task2();
       // task3();
       // task4();
       // task5();
    }
    public static void task1 () {
    //Задача 1
        System.out.println("Задача №1");
        int salary = 0;
        int deposit = 2_459_000;
        int month = 0;
        while (salary < deposit){
        System.out.println("«Месяц "+month+" , сумма накоплений равна "+salary+" рублей»");
        salary = salary + 15_000;
        month = month + 1;
        }System.out.println("«Месяц "+month+" , сумма накоплений равна "+salary+" рублей»");
    }
}