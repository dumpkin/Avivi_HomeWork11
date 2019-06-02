//Створити класи Pair<L, R>, Triple<L, M, R>. Описати в ньому дженеріками – поля,  гетери/сетери, toString.

//Створити Main клас в якому створити Pair, Triple різних типів і вивести їхні значення в консоль

public class Main {

    public static void main(String[] args) {
        System.out.println("Homework 11 Avivi\n");

        Pair<Integer, Integer> twins = new Pair(45, 22);
        Pair<String, Boolean> twins2 = new Pair("Bla-Bla", false);


        homework_11(twins,twins2);


    }

    public static void homework_11 (Object... input){
        for (Object object:input) {
            System.out.println(object.toString()+"\n");

        }

    }
}
