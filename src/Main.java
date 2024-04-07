import java.util.Scanner;

public class Main {
    public static int function1(int[] m, int n) {
        if (n == 1) {
            return m[0];
        }
        int min = m[0];
        for (int num : m) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        int minvalue = function1(m, n);
        System.out.println(minvalue);


    }
    public static double function2(int n, int[] m){
        if (n == 0){
            return 0;
        }
        double avgnumbers = 0;
        for (int numbers : m){
            avgnumbers += numbers;
        }
        double avgvalue =(double) avgnumbers / n;

        return avgvalue;
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m[] = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = scanner.nextInt();
        }
        double avgvalue;
        avgvalue = function2(n, m);
        System.out.println(avgvalue);
    }

    public static String function3(int n){
        if (n == 1 || n == 2){
            return "prime";
        }
        for (int i = 3; i < n; i++){
            if (n % 3 != 0){
                return "prime";

            }
        }
        return "complex";
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1 || n == 2){

        }
        System.out.println(function3(n));

    }

    public static int function4(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * function4(n-1);
    }
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(function4(n));


    }

    public static int function5(int n){
        if (n <= 1){
            return n;
        }
        else {
            return function5(n - 1) + function5(n - 2);
        }
    }
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(function5(n));

    }

    public static int function6(int a, int n){
        if (n == 0){
            return 1;
        }
        else{
            return a * function6(a, n- 1);
        }
    }
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(function6(a, n));
    }



    public static String function8(String s){
        if (s == null){
            return "empty";
        }
        for (char c: s.toCharArray()){
            if (!Character.isDigit(c));
            return "no";
        }
        return "yes";
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(function8(s));
    }




    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task8();

    }
}
