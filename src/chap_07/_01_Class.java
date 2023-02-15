package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (oop - object - oriented programming)
        // 유지보수 용이
        // 높은 재 사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";
        
        // 새로운 제품 개발
        // 모델명, 해상도, 가격, 색상
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        BlackBox bbox = new BlackBox();
        // BlackBox클래스로 부터 bbox라는 객체를 생성
        // bbox는 BlackBox의 인스턴스
    }
}
