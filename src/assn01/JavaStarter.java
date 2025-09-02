package assn01;
import java.util.Scanner;

public class JavaStarter {
    public static double quadFun(double a, double b, int m){
        return a*(m*m)+b;
    }
    public static String stringFun1(String s1){
        return s1.toUpperCase();
    }
    public static String stringFun2(String s1, int i1, int i2, int i3, int i4){
        String sA = s1.substring(i1, i2);
        String sB = s1.substring(i3, i4);
        return sA + sB;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n == 1){
            System.out.println("Hello, Universe!");
        } else if (n == 2){
            double a = input.nextDouble();
            double b = input.nextDouble();
            int m = input.nextInt();
            System.out.println("a = " + a + ", b = " + b + ", m = " + m);
        } else if (n == 3){
            double a = input.nextDouble();
            double b = input.nextDouble();
            int m = input.nextInt();
            double answer = quadFun(a,b,m);
            System.out.println(answer);
        } else if (n == 4){
            String s1 = input.next();
            System.out.println(stringFun1(s1));
        } else if (n == 5){
            String s1 = input.next();
            int i1 = input.nextInt();
            int i2 = input.nextInt();
            int i3 = input.nextInt();
            int i4 = input.nextInt();
            System.out.println(stringFun2(s1, i1, i2, i3, i4));
        } else if (n == 6){
            int m = input.nextInt();
            double[] arr = new double[m];
            double sum = 0.0;

            for (int i = 0; i < m; i++){
                arr[i] = input.nextDouble();
                sum += arr[i];
            }
            System.out.printf("Average = %.2f%n", sum/m);
            for (int i = m - 1; i >= 0; i--){
                System.out.println("arr[" +i+"]=" + arr[i]);
            }
        }
    }
}
