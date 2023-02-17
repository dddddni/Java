package chap_09;

import java.util.ArrayList;
import java.util.Iterator;

public class _Quiz_09 {
    public static void main(String[] args) {
        // ArrayList를 이용하여, 학생별 자격증 취득정보 관리하고, 자바 자격증 보유 학생 이름 출력
        // 학생 이름, 자격증 취득정보를 위한 Student클래스 생성
        // 학생 1명당 자격증 1개로 제한
        // 모든 클래스 1개파일에 정의

        // 학생 정보 생성
        Student student1 = new Student("김서현", "Java");
        Student student2 = new Student("라이언", "Python");
        Student student3 = new Student("춘식이", "C++");
        Student student4 = new Student("어피치", "정보처리기사");

        // list 추가
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        // 전체 출력
        for (Student student : students) {
            System.out.println(student.name + " : " + student.certification);
        }

        System.out.println("==================================");

        // 리터레이터 사용
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.certification.equals("Java")){
                System.out.println(student.name + "님이 " + student.certification + " 자격증을 보유하고 있습니다. ");
            }
        }

        System.out.println("==================================");

        // 리터레이터 없이
        for (Student student : students) {
            if (student.certification.equals("Java")) {
                System.out.println(student.name + "님이 " + student.certification + " 자격증을 보유하고 있습니다.");
            }
        }

    }
}

class Student{
    String name;
    String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}

//