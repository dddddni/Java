package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        // 인기많은 상품이 선착순으로 판매되는 쇼핑몰에서 예외처리
        // 상품 구매 가능 시간 (9시이후)
        // 상품 매진

        int hour = 9;
        int stock = 0;

        try {
            if (hour < 9) {
                throw new ProductPurchaseTimeOutExecption("구매 가능 시간이 아닙니다.");
            }
            if (stock <= 0) {
                throw new ProductSoldOut("품절된 상품입니다.");
            }

            System.out.println("상품 구매에 성공했습니다.");
        } catch (ProductPurchaseTimeOutExecption e) {
            e.printStackTrace();
        } catch (ProductSoldOut e) {
            e.printStackTrace();
        }
    }
}

class ProductPurchaseTimeOutExecption extends Exception{

    public ProductPurchaseTimeOutExecption(String message) {
        super(message);
    }
}

class ProductSoldOut extends Exception{
    public ProductSoldOut(String message) {
        super(message);
    }
}
