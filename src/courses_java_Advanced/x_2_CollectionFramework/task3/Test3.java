package courses_java_Advanced.x_2_CollectionFramework.task3;

import java.awt.*;
import java.util.LinkedList;

public class Test3 {
    public LinkedList<Integer> list= new LinkedList();

    public void getIntegerList(int n){
        for (int i = 1; i <=n; i++) {
            list.add(i);
        }
    }

    public void getMinimum(LinkedList list){
        list.stream().sorted();
        System.out.println(list.get(0));
    }

}
