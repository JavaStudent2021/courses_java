package courses_java_Advanced.x_6_Annotations.task3;

@Car(speed = "good", prise = 1_000)
public class SportCar {
    public void driver(){
        System.out.println("Driver man");
    }

    public void sound(){
        System.out.println("Beep!");
    }

}
