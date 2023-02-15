package chap_06;

public class _Quiz_06 {
    public static void encryption(String name, String num, String phone){
        name = name.substring(0,1 ) + "**";
        num = num.substring(0, num.indexOf("-") + 2) + "******";
        phone = phone.substring(0, phone.lastIndexOf("-") + 1) + "****";

        System.out.println(name + " " + num + " " + phone);

    }
    public static void main(String[] args) {
        String name = "나코딩";
        String num = "990130-1234567";
        String phone = "010-1234-5678";

        encryption(name, num, phone);


    }
}
