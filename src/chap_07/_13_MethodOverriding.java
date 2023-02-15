package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩
        // 자식에서 부모클래스 메소드 재정의
        Camera camera = new Camera();
        SpeedCam speedCam = new SpeedCam();
        FactoryCam factoryCam = new FactoryCam();

        camera.showMainFeature();
        speedCam.showMainFeature();
        factoryCam.showMainFeature();
    }
}
