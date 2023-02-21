package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        // A, B 상품 5개씩 준비
        // A, B가 모두 준비된 이후 세트 상품 포장
        // 포장이 필요한 세트상품은 5개

        ProductA productA = new ProductA();
        ProductB productB = new ProductB();

        Thread threadA = new Thread(productA);
        Thread threadB = new Thread(productB);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {
            System.out.println("===== 세트 상품 준비 시작 =====");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 개수 : " + i + "/5");
                if(i == 5){
                    System.out.println("===== 세트상품 준비 완료 =====");
                }
            }
        };
        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}

class ProductA implements Runnable{

    @Override
    public void run() {
        System.out.println("===== A상품 준비 시작 =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("A상품 개수 : " + i + "/5");
            if(i == 5){
                System.out.println("===== A상품 준비 완료 =====");
            }
        }
    }
}

class ProductB implements Runnable{

    @Override
    public void run() {
        System.out.println("===== B상품 준비 시작 =====");
        for (int i = 1; i <= 5; i++) {
            System.out.println("B상품 개수 : " + i + "/5");
            if(i == 5){
                System.out.println("===== B상품 준비 완료 =====");
            }
        }
    }
}