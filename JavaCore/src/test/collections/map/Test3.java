package test.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Test3 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        Student st1 = new Student( "Mark", "Tolochko", 4);
        Student st2 = new Student("Nick", "Koko", 1);
        Student st3 = new Student("Jack", "Bobo", 3);
        Student st4 = new Student("Mike", "Nono", 2);
        Student st5 = new Student("Bob", "Pupkin", 4);
        Student st6 = new Student("Rob", "Kolgosp", 1);
        Student st7 = new Student("Karl", "Baran", 3);

        treeMap.put(st4, 7.5);
        treeMap.put(st5, 7.9);
        treeMap.put(st2, 6.4);
        treeMap.put(st7, 9.1);
        treeMap.put(st3, 7.2);
        treeMap.put(st1, 5.8);
        treeMap.put(st6, 8.2);

//        for (Map.Entry<Student, Double> entry: treeMap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }


//        for (Map.Entry<Double, Student> enntry: treeMap.entrySet()){
//            System.out.println(enntry.getKey() + "  " + enntry.getValue()) ;
//        }
//        System.out.println("********************************8");
//        treeMap.remove(5.8);
//        for (Map.Entry<Double, Student> enntry: treeMap.descendingMap().entrySet()){
//            System.out.println(enntry.getKey() + "  " + enntry.getValue()) ;
//        }
//        System.out.println("***********************************888");
//
//        for (Map.Entry<Double, Student> enntry: treeMap.tailMap(7.2).entrySet()){
//            System.out.println(enntry.getKey() + "  " + enntry.getValue()) ;
//        }
//        System.out.println("********************************8");
//
//        for (Map.Entry<Double, Student> enntry: treeMap.headMap(7.2).entrySet()){
//            System.out.println(enntry.getKey() + "  " + enntry.getValue()) ;
//        }
//        System.out.println("********************************8");


    }
}
