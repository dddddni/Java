package chap_06;

public class _02_Parameter {

    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent ; i++) {
            result *= number;
        }
        System.out.println(number +"의 " + exponent + "승은 " + result );
    }

    public static void main(String[] args) {
        // 2 -> 4
        // 3 -> 9
        power(4);
        power(600);
        powerByExp(2,6);
        powerByExp(3,4);
        powerByExp(0,1);
    }
}
