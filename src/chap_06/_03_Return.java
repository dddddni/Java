package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber(){
        String phoneNumber =  "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress(){
        return "서울시";
    }
    // 호텔 액티비티
    public static String getActivity(){
        return "볼링장, 탁구장, 수영장";
    }

    public static void main(String[] args) {
        // 반환값
        String number = getPhoneNumber();
        System.out.println("호텔 전화 번호 : " + number);
        String address = getAddress();
        System.out.println("호텔 주소 : " + number);
        System.out.println("호텔 액티비티 : " + getActivity());
    }
}
