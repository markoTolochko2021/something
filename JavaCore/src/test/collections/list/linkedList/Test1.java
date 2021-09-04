package test.collections.list.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {

        String s = "oko";
        List<Character> list = new LinkedList<>();
        for (char ch: s.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> listIterator1 = list.listIterator();
        ListIterator<Character> listIterator2 = list.listIterator(list.size());

        boolean isPalindrome = true;
        while (listIterator1.hasNext() && listIterator2.hasPrevious()) {
            if (listIterator1.next() != listIterator2.previous()) {
                isPalindrome = false;
                break;
            }
        }
            if (isPalindrome){
                System.out.println("Palindrome");
            }
            else {
                System.out.println("Not palindrome");
            }

        }

    }