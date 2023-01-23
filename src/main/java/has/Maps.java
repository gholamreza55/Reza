package has;

import java.util.*;

public class Maps {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> myMap = new LinkedHashMap<>();
        myMap.put(44, "Tom");
        myMap.put(12, "rex");
        myMap.put(45, "roky");
        myMap.put(1, "nader");
        myMap.put(1, "nader1");

       // System.out.println("LinkedHashMap : "+ myMap);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(44, "Tom");
        hashMap.put(12, "rex");
        hashMap.put(45, "roky");
        hashMap.put(1, "nader");
        hashMap.put(1, "nader1");

       // System.out.println("Hsh Map : "+hashMap);


        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(44, "Tom");
        treeMap.put(12, "rex");
        treeMap.put(45, "roky");
        treeMap.put(1, "nader");
        treeMap.put(1, "nader1");

       // System.out.println("TreeMap : "+treeMap);


        LinkedList<String> linkedHashMap = new LinkedList<>();
        linkedHashMap.add("john");
        linkedHashMap.add("paul");
        linkedHashMap.add("george");
        linkedHashMap.add("ringo");

        System.out.println(linkedHashMap.get(2));
        linkedHashMap.add("jerry");

        System.out.println(linkedHashMap);
        System.out.println("------------------------------------------");

        String[] names = new String[4];
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("john");
        arrayList.add("paul");
        arrayList.add("george");
        arrayList.add("ringo");
        System.out.println(arrayList.get(2));
        arrayList.add(1, "jerry");

        System.out.println(arrayList);
        System.out.println("----------------------------------------");

        Set<String> name = new HashSet<>();
        name.add("water");
        name.add("jesse");
        name.add("skyler");
        name.add("mike");
        name.add("saul");
        name.add("water");
        name.remove(0);

        for (String namese : name) {
            System.out.println(namese);
        }
        System.out.println("-------------------------");

       // name.forEach(System.out::println);
        Iterator<String> nameiterator = name.iterator();

        while (nameiterator.hasNext()){
            System.out.println(nameiterator.next());
        }

        System.out.println("-----------------------------");

        System.out.println(name);
        System.out.println(name.size());
        System.out.println(name.contains("gus"));
        System.out.println(name.isEmpty());
        name.clear();
        System.out.println(name);
        System.out.println(name.isEmpty());


        System.out.println("------------------------");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);

        System.out.println("----------------------------");

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

        System.out.println("------------------------");
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);

    }

}
