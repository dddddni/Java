package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (key, value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("총 고객 수 : " + map.size());
        System.out.println("==========================");

        // 조회
        System.out.println("유재석의 포인트 : " + map.get("유재석"));
        System.out.println("박명수의 포인트 : " + map.get("박명수"));
        System.out.println("==========================");

        // 데이터 조회
        if(map.containsKey("서장훈")){
           int point = map.get("서장훈");
           map.put("서장훈", ++point);
        }else{
            map.put("서장훈", 1);
        }
        System.out.println("서장훈의 포인트 : " + map.get("서장훈"));
        System.out.println("==========================");
        
        // 데이터 삭제
        map.remove("유재석");
        System.out.println(map.get("유재석"));

        System.out.println("==========================");

        // 데이터 전체 삭제
        map.clear();
        if(map.isEmpty()){
            System.out.println("남은 고객 수 : " + map.size());
        }

        System.out.println("==========================");
        
        // 다시 고객 방문
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        // key
        for (String s : map.keySet()) {
            System.out.print(s + "\t");
        }

        System.out.println();

        // value
        for (Integer i : map.values()) {
            System.out.print(i + "\t");
        }

        System.out.println("==================================");

        // key and value
        for (String s : map.keySet()) {
            System.out.println("고객 이름 : " + s + " 포인트 : " + map.get(s));
        }

    }

}
