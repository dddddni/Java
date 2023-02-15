package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;
        int height = 2;
        while(height + move < distance){
            System.out.println("발차기를 합니다.");
            System.out.println("height : " + height + ", move : " + move);
            move +=3;
        }

        System.out.println("도착");

        System.out.println("--- 반복문 ---");

        // 키가 엄청나게 큰 사람
        height = 25;
        while(height + move < distance){
            System.out.println("발차기를 합니다.");
            System.out.println("height : " + height + ", move : " + move);
            move +=3;
        }
        System.out.println("도착");

        System.out.println("--- 반복문 ---");
        // DoWhile
        do{
            System.out.println("발차기를 합니다.");
            System.out.println("height : " + height + ", move : " + move);
            move +=3;
        }while(height + move < distance);
        System.out.println("도착");
    }
}
