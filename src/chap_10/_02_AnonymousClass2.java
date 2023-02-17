package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("=======================");
        
        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();
    }

    public static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 양배추 샐러드, 치즈, 계란, 딸기잼");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 패티, 해쉬브라운, 피클, 양상추");
            }
        };
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();
}