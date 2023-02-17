package chap_10;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림
        // 스트림 생성
        int [] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"python", "java", "javascript", "c", "c++", "c#"};
        Stream<String> stream = Arrays.stream(langs);

        // ArrayList
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");
//        langList.add("javascript");
//        langList.add("c");
//        langList.add("c++");
//        langList.add("c#");

        langList = Arrays.asList("python", "java", "javascript", "c", "c++", "c#");
        System.out.println(langList.size());

        // Collection Stream
        Stream<String> langListStream = langList.stream();
        Stream<String> langListStreamOf = Stream.of("python", "java", "javascript", "c", "c++", "c#");
        
        // 스트림 사용
        // 중간 연산 : filter, map, skip, sorted, distinct...
        // 최종 연산 : count, min, max, foreach, anyMatch, allMatch...

        // 90점 이상만 출력
        System.out.println("============================");
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        //Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("============================");

        // 90점 이상의 사람 수
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("============================");

        // 90점 이상인 사람들의 점수 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println(sum);
        System.out.println("============================");

        // 90 점 이상인 점수들의 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("============================");

        // python", "java", "javascript", "c", "c++", "c#"
        // c로 시작하는 언어 출력
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("============================");

        // java를 포함한 언어 출력
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("============================");

        // 4글자 이하의 언어를 정렬해서 출력
        Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("============================");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함한 언어
        Arrays.stream(langs).filter(x -> x.length() <= 4).filter(x -> x.contains("c")).forEach(System.out::println);
        System.out.println("============================");

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어가 하나라도 있는지
        boolean anyMatch = Arrays.stream(langs).filter(x -> x.length() <= 4).anyMatch(x -> x.contains("c"));
        if(anyMatch){
            System.out.println("데이터가 존재합니다.");
        }

        System.out.println("============================");

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어가 모두 인지.
        boolean allMatch = Arrays.stream(langs).filter(x -> x.length() <= 4).allMatch(x -> x.contains("c"));
        if(allMatch){
            System.out.println("데이터가 존재합니다.");
        }else{
            System.out.println("모두 c라는 글자를 포함하지는 않습니다.");
        }

        System.out.println("============================");

        // 4글자 이하의 언어 중에서 c라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        Arrays.stream(langs).filter( x -> x.length() <= 4).filter(x -> x.contains("c")).map(x -> x + " 어려워요").forEach(System.out::println);

        System.out.println("============================");

        // c라는 언어를 포함한 글자를 대문자로 출력
        langList.stream().filter(x -> x.contains("c")).map(x -> x.toUpperCase()).forEach(System.out::println);

        System.out.println("============================");

        // c라는 언어를 포함한 글자를 대문자로 변경하여 리스트에 저장
        List<String> langListStartWithC = langList.stream().filter(x -> x.contains("c")).map(x -> x.toUpperCase()).collect(Collectors.toList());
        langListStartWithC.stream().forEach(System.out::println);

    }
}
