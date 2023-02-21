package chap_12.clean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CleanRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("===== 직원 청소 시작 (Runnable) =====" + new Date());
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원) " + i + "번방 청소 중 (Runnable) " + new Date());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("===== 직원 청소 완료 (Runnable) =====" + new Date());
    }
}
