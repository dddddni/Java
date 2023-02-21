package chap_13;

import java.io.*;
import java.util.Scanner;

public class _Quiz_13 {
    public static void main(String[] args) {
        // saying.txt라는 이름 파일
        // 문제와 정답이 각각 한줄로 구성. (퀴즈 3개 문장 6줄)
        // 사용자로 부터 값을 입력 받아 정답여부 확인
        // 오답인 경우 정답 안내
        // 퀴즈가 없을 때까지 반복

        // 속담 파일 생성
        File file = new File("saying.txt");
        try {
            if(file.createNewFile()){
                System.out.println("파일 생성에 성공했습니다. " + file.getAbsolutePath());
            }else{
                System.out.println("파일 생성에 실패했습니다.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        // 파일에 내용 작성
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("saying.txt"))){
            bw.write("세 살 __ 여든까지 간다");
            bw.newLine();
            bw.write("버릇");
            bw.newLine();

            bw.write("소 잃고 ___ 고친다");
            bw.newLine();
            bw.write("외양간");
            bw.newLine();

            bw.write("천 리 길도 한 __ 부터");
            bw.newLine();
            bw.write("걸음");

        }catch (IOException e){
            e.printStackTrace();
        }

        // 문제 내기
        // 파일 읽기
        try(BufferedReader br = new BufferedReader(new FileReader("saying.txt"))){
            String quiz, answer;
            Scanner sc = new Scanner(System.in);

            while(true){
                quiz = br.readLine();
                answer = br.readLine();

                if(quiz == null || answer == null){
                    break;
                }

                System.out.println("(문제) " + quiz);
                System.out.print("정답 >> ");
                String input = sc.nextLine();
                if(answer.equals(input)){
                    System.out.println("정답입니다!!");
                }else {
                    System.out.println("틀렸습니다. 정답은 " + answer + " 입니다.");
                }

                System.out.println("퀴즈 완료");

            }

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
