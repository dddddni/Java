package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        System.out.println("========== 정수 ==========");
        System.out.printf("%d%n", 10);
        System.out.printf("%d %d %d %n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234);  // __1234
        System.out.printf("%06d%n", 1234);  // 001234
        System.out.printf("%6d%n", -1234);  // _-1234
        System.out.printf("%+6d%n", 1234);  // _+1234
        System.out.printf("%,15d%n", 1000000000);  // __1,000,000,000
        System.out.printf("%-6d%n", 1234);  // 1234__

        System.out.println("========== 실수 ==========");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI);
        System.out.printf("%6.2f%n", Math.PI);  // __3.14
        System.out.printf("%-6.2f%n", Math.PI);  // 3.14__
        System.out.printf("%06.2f%n", Math.PI);  // 003.14
        System.out.printf("%+6.2f%n", Math.PI);  // _+3.14

        System.out.println("========== 문자열 ==========");
        System.out.printf("%s%n", "JAVA");
        System.out.printf("%6s%n", "JAVA"); // __JAVA
        System.out.printf("%-6s%n", "JAVA"); // JAVA__
        System.out.printf("%6.2s%n", "JAVA"); // ____JA
        System.out.printf("%-6.2s%n", "JAVA"); // JA____

        System.out.println("========== 응용 1==========");
        System.out.println("이름 \t 영어\t 수학\t 평균");
        System.out.println("강백호 \t " + 90  + " \t " + 80  + " \t " + 85);
        System.out.println("서태웅 \t " + 100 + " \t " + 100 + " \t " + 100);
        System.out.println("채치수 \t " + 95  + " \t " + 100 + " \t " + 97.5);

        System.out.println("========== 응용 2==========");
        System.out.println("이름      영어   수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 90, 100, 97.5);
    }
}
