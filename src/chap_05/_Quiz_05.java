package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {

        int[] size = new int[10];

        for (int i = 0; i < size.length ; i++) {
            size[i] = 250 + (i * 5);
        }

        for (int i = 0; i < size.length ; i++) {
            System.out.println(size[i]);
        }
    }
}
