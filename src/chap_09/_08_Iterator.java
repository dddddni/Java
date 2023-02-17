package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 리터레이터
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for(String s : list){
            System.out.println(s);
        }

        System.out.println("====================");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("====================");

        // 커서 처음으로 이동
        it = list.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }

        it = list.iterator();
        while(it.hasNext()){
            if(it.next().contains("(알 수 없음)")){
                it.remove();
            }
        }

        System.out.println("====================");

        it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("====================");

        HashSet<String> set = new HashSet<>();
        set.add("박명수");
        set.add("유재석");

        Iterator<String> itSet = set.iterator();
        while (itSet.hasNext()){
            System.out.println(itSet.next());
        }

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);
        map.put("김종국", 3);
        map.put("서장훈", 15);

        System.out.println("====================");

        //map.iterator(); // 사용불가
        Iterator<String> itMapKey = map.keySet().iterator();
        while (itMapKey.hasNext()){
            System.out.println(itMapKey.next());
        }

        System.out.println("====================");

        Iterator<Integer> itMapValue = map.values().iterator();
        while (itMapValue.hasNext()){
            System.out.println(itMapValue.next());
        }

        System.out.println("====================");

        Iterator<Map.Entry<String, Integer>> itMapEntrySet = map.entrySet().iterator();
        while (itMapEntrySet.hasNext()){
            System.out.println(itMapEntrySet.next());
        }


    }
}
