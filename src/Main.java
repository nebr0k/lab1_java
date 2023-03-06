import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        double x, y, A, B;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("x = ");
//        x = scanner.nextDouble();
//        A = x + 1;
//        // спосіб 1
//        if (x <= 4) {
//            B = Math.exp(Math.log(2 + 2 * x) + 2 * x);
//        } else if (x > 7) {
//            B = 1 - 7 * x + x * x - 2 * x * x * x;
//        } else {
//            B = 1 / Math.tan((1 + x) / 9 + 8 * x);
//        }
//
//        y = A + B;
//        System.out.println("1) y = " + y);
//
//        // спосіб 2
//        if (x <= 4) {
//            B = Math.exp(Math.log(2 + 2 * x) + 2 * x);
//        } else if (x > 7) {
//            B = 1 - 7 * x + x * x - 2 * x * x * x;
//        } else {
//            B = 1 / Math.tan((1 + x) / 9 + 8 * x);
//        }
//
//        y = A + B;
//        System.out.println("2) y = " + y);
//
//        scanner.close();
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int N, i;
//        double S;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("N = ");
//        N = scanner.nextInt();
//
//        // цикл while
//        S = 0;
//        i = 1;
//        while (i <= N) {
//            S += (1 + 1.0 * i / N) / (1.0 * i * i);
//            i++;
//        }
//        System.out.println(S);
//
//        // цикл do-while
//        S = 0;
//        i = 1;
//        do {
//            S += (1 + 1.0 * i / N) / (1.0 * i * i);
//            i++;
//        } while (i <= N);
//        System.out.println(S);
//
//        // цикл for
//        S = 0;
//        for (i = 1; i <= N; i++) {
//            S += (1 + 1.0 * i / N) / (1.0 * i * i);
//        }
//        System.out.println(S);
//
//        // зворотній цикл for
//        S = 0;
//        for (i = N; i >= 1; i--) {
//            S += (1 + 1.0 * i / N) / (1.0 * i * i);
//        }
//        System.out.println(S);
//
//        scanner.close();
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        double x, xp, xk, dx, A, B, y;
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("xp = ");
//        xp = input.nextDouble();
//
//        System.out.print("xk = ");
//        xk = input.nextDouble();
//
//        System.out.print("dx = ");
//        dx = input.nextDouble();
//
//        System.out.println("---------------------------");
//        System.out.println("|    x    |     y     |");
//        System.out.println("---------------------------");
//
//        x = xp;
//        while (x <= xk) {
//            A = x + 1;
//            if (x <= 4)
//                B = Math.exp(Math.log(2 + 2 * x) + 2 * x);
//            else if (x > 7)
//                B = 1 - 7 * x + x * x - 2 * x * x * x;
//            else
//                B = 1 / Math.tan((1 + x) / 9 + 8 * x);
//            y = A + B;
//            System.out.printf("|%8.2f |%10.3f |\n", x, y);
//            x += dx;
//        }
//
//        System.out.println("---------------------------");
//
//        input.close();
//    }
//}
