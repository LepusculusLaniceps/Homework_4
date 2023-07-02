public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();


    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 23;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");

        }

        int age1 = 4;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.");
        }
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", он не достиг совершеннолетия, нужно немного подождать.");
            // Блок if выполнится в любом случае, у нас есть два true-варианта
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int t = 0;
        if (t >= 5) {
            System.out.println("На улице " + t + " градусов, можно идти без шапки.");
        } else {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку.");

        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int v = 70;
        if (v < 60) {
            System.out.println("Если скорость " + v + ", то можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + v + ", то придется заплатить штраф.");

        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 60;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");

        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");

        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");

        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете.");

        } else if (age > 24 && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");

        } else if (age >= 60) {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
        }


    }

    public static void task5() {
        System.out.println("Задача 5");

        int age = 10;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");

        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");

        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения.");

        }

    }

    public static void task6() {
        System.out.println("Задача 6");

        byte capacity = 102;
        byte sit = 60;
        int occupied = 54;

        if (occupied < 60) {
            System.out.println("Если в вагоне " + occupied + " человек(-а), то есть сидячие места.");

        } else if (occupied >= 60 && occupied < 102) {
            System.out.println("Если в вагоне " + occupied + " человек(-а), то остались только стоячие места.");

        } else if (occupied >= 102) {
            System.out.println("Если в вагоне " + occupied + " человек(-а), то мест не осталось.");

        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int one = 56;
        int two = 520;
        int three = 73;

        if (one > two && one > three) {
            System.out.println("Самое большое число из трех - " + one + ".");

        } else if (two > three && two > one) {
            System.out.println("Самое большое число из трех - " + two + ".");

        } else {
            System.out.println("Самое большое число из трех - " + three + ".");

        }
    }
}

