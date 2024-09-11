import Java_Tutorials.MyGenericList;

import java.util.Iterator;

public class MyClassGenericListExample {


    public static void main(String[] args) {
        MyGenericList<String> list = new MyGenericList<>();

        list.add("hello");
        list.add("world");
        list.add("!");

//        Iterator<String> it = list.iterator() ;
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        for(String item : list ){
            System.out.println(item);
        }
    }
}
