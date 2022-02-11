package courses_java_Advanced.x_5_Reflection.task4;

import java.lang.reflect.Field;

public class Cat {

    public void setAnimalFild() throws IllegalAccessException {
        Animal aClass = new Animal();
        Class<?> c = aClass.getClass();
        Field[] field = c.getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            Field fil = field[i];
            String nameFild = fil.getName();
            System.out.println("nameFild = " + nameFild);
            if (fil.getType().getName()=="int"){
                fil.setAccessible(true);
                fil.setInt(aClass, 50);
            }else if (fil.getType().getSimpleName().equals("String")){
                fil.setAccessible(true);
                fil.set(aClass, "BAY!!!!");
            }

        }
        System.out.println(aClass);
    }
}
