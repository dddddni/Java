package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Else if
        // 한라봉 에이드가 있다면
        // 또는 망고 주스가 있다면
        // 또는 아이스 아메리카노
        boolean hallabongAde = true;
        boolean mangoJuice = true;
        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        }else if (mangoJuice){
            System.out.println("망고 주스 +1");
        }else{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if 여러번 사용가능
        hallabongAde = false;
        mangoJuice = false;
        boolean oragneJuice = true;

        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        }else if (mangoJuice){
            System.out.println("망고 주스 +1");
        }else if (oragneJuice){
            System.out.println("오렌지 주스 +1");
        }else{
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료 #2");
        
        // else 생략 가능
        hallabongAde = false;
        mangoJuice = false;
        oragneJuice = false;

        if(hallabongAde){
            System.out.println("한라봉 에이드 +1");
        }else if (mangoJuice){
            System.out.println("망고 주스 +1");
        }else if (oragneJuice){
            System.out.println("오렌지 주스 +1");
        }
        System.out.println("커피 주문 완료 #3");
    }

}
