package courses_java_Advanced.x_2_CollectionFramework.task2;

import java.awt.*;
import java.util.ArrayList;

public class Task2 {
    public ArrayList list;


    public ArrayList doubleValues(ArrayList l){
        for (Object s:l) {
            list.add(s);
            list.add(s);
        }
        return list;
    }
}
