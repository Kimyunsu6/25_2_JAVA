import java.util.Scanner;
import java.lang.Long;

class Student {
    String studentId;
    String name;
    String major;
    long phoneNumber;

    public Student(String stId, String name, String major, String phoneNumberStr) {
        this.studentId = stId;
        this.name = name;
        this.major = major;
        this.phoneNumber = Long.parseLong(phoneNumberStr);
    }
    String getStudentId() { return studentId; }
    void setStudentId(String studentId) { this.studentId = studentId; }
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    String getMajor() { return major; }
    void setMajor(String major) { this.major = major; }
    long getPhoneNumberLong() { return phoneNumber; }
    void setPhoneNumberLong(long phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPhoneNumber() {
        String numStr = Long.toString(this.phoneNumber);

        if (numStr.length() == 10) {
            String middle = numStr.substring(2, 6);
            String last = numStr.substring(6);
            return "010-" + middle + "-" + last;
        }//1011111111과같은 맨앞0제외입력
        else if (numStr.length() == 11 && numStr.startsWith("010")) {
            return "010-" + numStr.substring(3, 7) + "-" + numStr.substring(7);
        }//01011111111과같은 맨앞0포함입력

        return numStr;
    }

    public String toString() {
        return this.studentId + " " + this.name + " " + this.major + " " + getPhoneNumber();
    }
}

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1;
        Student student2;
        Student student3;

        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

        String stId1 = scanner.next();
        String name1 = scanner.next();
        String major1 = scanner.next();
        String phoneNum1 = scanner.next();
        student1 = new Student(stId1, name1, major1, phoneNum1);


        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        String stId2 = scanner.next();
        String name2 = scanner.next();
        String major2 = scanner.next();
        String phoneNum2 = scanner.next();
        student2 = new Student(stId2, name2, major2, phoneNum2);


        System.out.printf("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
        String stId3 = scanner.next();
        String name3 = scanner.next();
        String major3 = scanner.next();
        String phoneNum3 = scanner.next();
        student3 = new Student(stId3, name3, major3, phoneNum3);

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        System.out.printf("첫번째 학생: %s%n", student1.toString());
        System.out.printf("두번째 학생: %s%n", student2.toString());
        System.out.printf("세번째 학생: %s%n", student3.toString());

        scanner.close();
    }
}