package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드
        //cleanBySelf();

        CleanThread cleanThread = new CleanThread();
        cleanThread.run();
        cleanThread.start();
        cleanByBoss();
    }

    public static void cleanBySelf(){
        System.out.println("===== 혼자 청소 시작 =====");
        for (int i = 1; i <= 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("===== 혼자 청소 완료 =====");
    }

    public static void cleanByBoss(){
        System.out.println("===== 사장 청소 시작 =====");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("===== 사장 청소 완료 =====");
    }

    
}
