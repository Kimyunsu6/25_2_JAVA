import java.util.Scanner;

public class Homework3 {
    public static void main(String[]args){
        System.out.println("몇 개의 수를 입력할 예정인가요?");
        Scanner sc = new Scanner(System.in);
        int numberOfInt = sc.nextInt();
        int arrNum[] = new int[numberOfInt];
        sc.nextLine();

        System.out.println("수를 입력하세요");
        String stringOfNums = sc.nextLine();
        String[] numbers = stringOfNums.split(" ");

        for (int i=0; i< numberOfInt; i++){
            arrNum[i] = Integer.parseInt(numbers[i]);
        }
        int maxNum = arrNum[0];
        int minNum = arrNum[0];

        for(int i = 1; i<arrNum.length;i++){
            int compareNum = arrNum[i];
            if (compareNum >maxNum){
                maxNum = compareNum;
            }
            if (compareNum <minNum){
                minNum = compareNum;
            }
        }
        System.out.println("최대값: "+maxNum);
        System.out.println("최소값: "+minNum);


    }
}
