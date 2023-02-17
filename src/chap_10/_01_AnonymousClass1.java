package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스
        Coffee c1 = new Coffee();
        c1.order("아이스 아메리카노");

        System.out.println("============================");

        Coffee c2 = new Coffee();
        c2.order("따뜻한 라떼");
        c2.retrunTray();

        System.out.println("============================");

        // 친구 방문
        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 딸기 케이크는 서비스입니다.");
            }

            @Override
            public void retrunTray() {
                System.out.println("(귓속말) 자리에 두시면 제가 치울께요");
            }
        };

        specialCoffee.order("아이스 바닐라라떼");
        specialCoffee.retrunTray();

    }
}

class Coffee{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void retrunTray(){
        System.out.println("커피 반납이 완료되었습니다.");
    }
}
