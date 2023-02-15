package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        int max = 20;
        int sold = 0;
        int noshow = 17;
        for (int i = 0; i < 50 ; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");
            if(noshow == i){
                System.out.println(i + "번 손님 No Show");
                continue;
            }
            if(sold == max){
                System.out.println("치킨 품절");
                break;
            }
            sold++;
        }

        System.out.println("치킨 판매 완료");

        int index = 0;
        sold = 0;
        while(true){
            index++;
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");

            if(noshow == index){
                System.out.println(index + "번 손님 No Show");
                continue;
            }
            sold++;

            if(max == sold){
                System.out.println("치킨 품절");
                break;
            }
        }

        System.out.println("치킨 판매 완료");

    }
}
