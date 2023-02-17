package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter krwConverter = new KRWConverter();
        krwConverter.convert(1);

        System.out.println("======================");

        //convertUSD(USD -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원") , 1);
        Convertible convertible = USD -> System.out.println(USD + "달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible, 1);
        
        // 전달 값이 없다면
        ConvertibleWithNoParams c1 = () -> System.out.println("1달러 = 1400원");
        c1.convert();

        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + "달러 = " + (USD * KRW) + "원 입니다.");
        };

        c1.convert();

        System.out.println("======================");

        ConvertibleWithTwoParams c2 = (USD, KRW) -> {
            System.out.println(USD + "달러 = " + (USD * KRW) + "원 입니다.");
        };

        c2.convert(2, 1400);

        System.out.println("======================");

        ConvertibleWithReturn c3 = (USD, KRW) -> USD * KRW;
        int result = c3.convert(3, 1400);
        System.out.println(result);
        System.out.println("======================");
    }

    public static void convertUSD(Convertible convertible, int USD){
        convertible.convert(USD);
    }
}
