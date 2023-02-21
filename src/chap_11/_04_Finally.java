package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다");
            throw new Exception("오늘은 휴무 택시 입니다.");
            //System.out.println("택시에 탑승한다.");
        }catch (Exception e){
            System.out.println("!! 문제 발생 : " + e.getMessage());
        }finally {
            System.out.println("택시의 문을 닫는다");
        }
    }
}
