package ch05;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ListOfStudents ls = new ListOfStudents();
        StudentsIterator iterator = ls.getStudents();

        LinkedList<String> list = new LinkedList<>();
        ListIterator<String> it2 = list.listIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println(iterator.hasNext());
        }

//        StudentsIterator iterator = ls.getStudents();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}

class ListOfStudents {
    private String[] students;

    public ListOfStudents() {
        students = new String[3];
        students[0] = "Lisa";
        students[1] = "Mark";
        students[2] = "Anna";
    }

    public StudentsIterator getStudents() {
        return new StudentsIterator() {
            int index = 0;

            public String next() {
                String current = students[index];
                index++;
                return current;
            }

            public boolean hasNext() {
                return index < students.length;
            }
        };
    }

    //    public StudentsIterator getStudents() {
//        return new StudentsIterator() {
//            int index = 0;
//
//            @Override
//            public String next() {
//                String current = students[index];
//                index++;
//                return current;
//            }
//
//            @Override
//            public boolean hasNext() {
//                return index < students.length;
//            }
//        };
//    }
}

interface StudentsIterator {
    String next();

    boolean hasNext();
}
