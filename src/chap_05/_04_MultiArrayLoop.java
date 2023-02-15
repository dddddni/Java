package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][] {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===================================");
        for (String[] row : seats) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }

        System.out.println("===================================");

        String[][] seats2 = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("===================================");
        for (String[] row : seats2) {
            for (String seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }

        // 10 x 15 좌석 배정
        char seatC = 'A';

        String[][] seat3 = new String[10][15];
        for (int i = 0; i < seat3.length ; i++) {
            for (int j = 0; j < seat3[i].length ; j++) {
                seat3[i][j] = String.valueOf(seatC)  + (j + 1);
            }
            seatC++;
        }

        System.out.println("======================================");

        for (int i = 0; i < seat3.length ; i++) {
            for (int j = 0; j < seat3[i].length ; j++) {
                System.out.print(seat3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
