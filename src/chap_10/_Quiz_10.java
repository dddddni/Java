package chap_10;

import java.util.ArrayList;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {
        // 스트림을 이용하여 미술관 방문 손님에게 적절한 입장료를 안내하는 프로그램을 작성
        // 손님 이름, 나이 정보를 위한 Customer 클래스 생성
        // 입장료 1인당 5000
        // 20세이상만 입장료 부과, 그 외에는 무료
        Customer c1 = new Customer("김서현", 19);
        Customer c2 = new Customer("춘식이", 70);
        Customer c3 = new Customer("어피치", 54);
        Customer c4 = new Customer("라이언", 30);
        Customer c5 = new Customer("곰돌이", 4);

        // 데이터 생성
        List<Customer> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        // 스트림 생성
        list.stream().map( x -> x.age < 20 ? x.name + ": 0원" : x.name + ": 5000원").forEach(System.out::println);
        

    }
}

class Customer{
    String name;

    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
