//Створити класи Pair<L, R>, Triple<L, M, R>. Описати в ньому дженеріками – поля,  гетери/сетери, toString.

//Створити Main клас в якому створити Pair, Triple різних типів і вивести їхні значення в консоль

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework 11 Avivi\n");

        Pair<Integer, Integer> twins = new Pair(45, 22);
        Pair<String, Boolean> twins2 = new Pair("Bla-Bla", false);

        Triple <? extends Number, ? extends Number, ? extends Integer> mathematic =
                new Triple<Number, Number, Integer>  (23, 457.4, 34, Operations.multiple);

        Triple <String, String, Boolean> lirics =
                new Triple <String, String, Boolean>  ("All your bases", "are belong to us", true);

        System.out.println("\n ________________Pair generics_____________\n");

        homework_11(twins, twins2);
        System.out.println("\n_______________ TripPle generics______________\n");
        homework_11(mathematic,lirics);


    }

    private static void homework_11(Object... input) {
        for (Object object : input) {
            System.out.println(object.toString() + "\n");

        }

    }
}
