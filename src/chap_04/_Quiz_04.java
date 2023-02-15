package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 주차요금은 시간당 4000원(최대 30000원)
        // 경차, 장애인 차량은 최종요금 50% 할인
        // 일반 차량 5시간 주차시 20,000원
        // 경차 5시간 주차 시 10,000원
        // 장애인 차량 10시간 주차시 15,000원

        boolean normal = false;
        boolean small = true;
        boolean disabled = false;

        int hour = 0;
        double pay = 0;

        for (int i = 0; i < 10; i++) {
            hour++;
            System.out.println("주차 " + hour + "시간 경과");
            pay = hour * 4000;
        }

        // 총금액 절삭
        if(pay > 30000){
            pay = 30000;
        }

        // 할인
        if(small || disabled){
            pay = pay * 0.5;
        }

        System.out.println("총 주차 " + hour + " 시간");
        System.out.println("경차 할인 : " + small);
        System.out.println("장애인 할인 : " + disabled);
        System.out.println("총 요금 : " + pay +"원");

    }
}
