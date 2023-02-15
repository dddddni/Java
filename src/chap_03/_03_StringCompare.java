package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {

        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Java"));

        // 대소문자 구별 없이 비교
        System.out.println(s2.equalsIgnoreCase("python"));

        s1 = "1234";
        s2 = "1234"; // s1, s2 동일한 곳을 참조하고 있음.
        System.out.println(s1.equals(s2)); // 내용 비교
        System.out.println(s1 == s2);  // 참조 비교

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 참조가 다르므로 false
    }
}
