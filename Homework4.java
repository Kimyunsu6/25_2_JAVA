import java.util.Scanner;
public class Homework4 {
    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    /*
    while (b!=0) {
        int temp = b;
        b = a%b;
        a = temp;
    }
    return a;
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 수를 입력하세요");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Homework4 hw = new Homework4();
        int greatest = hw.gcd(a, b);
        System.out.println("두 수의 최대공약수는 " + greatest + "입니다.");
        sc.close();
    }

}



