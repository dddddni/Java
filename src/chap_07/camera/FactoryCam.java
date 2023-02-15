package chap_07.camera;

public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
        super("공장 카메라");
    }

    public void recordVideo(){
        super.recordVideo();
        detectFire();
    }

    public void detectFire(){
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능은 : 화재 감지");
    } 

}
