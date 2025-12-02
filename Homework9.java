import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Homework9 {

    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(new FileInputStream("db.txt"));
            while (fileScanner.hasNext()) {
                String id = fileScanner.next();
                String password = fileScanner.next();
                userMap.put(id, password);
            }

            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        String inputId = "";
        String inputPassword = "";


        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            inputId = scanner.nextLine().trim();

            if (!userMap.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            System.out.print("password : ");
            inputPassword = scanner.nextLine().trim();
            String storedPassword = userMap.get(inputId);

            if (storedPassword.equals(inputPassword)) {
                System.out.println("id와 비밀번호가 일치합니다.");

                break;


            } else {

                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }

        scanner.close();
    }
}