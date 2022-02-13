package courses_java_Advanced.x_6_Annotations.task3;

public class miniGar extends SportCar{
    @Override
    public void driver() {
        System.out.println("Driver ");
    }

    @Override
    public void sound() {
        super.sound();
    }
}
