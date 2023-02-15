package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // 1등 : 전액
        // 2등 : 반액
        // 3등 : 반액
        // 그외 : 대상 아님

        int rank = 2;
        if(rank == 1){
            System.out.println("전액 장학금");
        }else if(rank == 2 ){
            System.out.println("반액 장학금");
        }else if (rank == 3){
            System.out.println("반액 장학금");
        }else{
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        switch (rank){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고 등급에 따른 가격 책정 (1급 : 최상, 4급 : 최하)
        int grade = 2;
        int price = 7000;
        switch (grade){
            case 1:
            case 2:
            case 3:
                price += 1000;
        }
        System.out.println(grade + "등급의 제품의 가격은 :" + price + "원");

    }
}
