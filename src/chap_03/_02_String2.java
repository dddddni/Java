package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ","));
        System.out.println(s.substring(7));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.length() - 1));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작위치 부터 끝 위치 직전까지

        // 공백
        s = "        I love Java.           ";
        System.out.println(s);
        System.out.println(s.trim());

        //문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat("Python"));
    }
}
