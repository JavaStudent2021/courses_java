package courses_java_Bases.x_4_Abstraction.task3;

public class Player implements Playable, Recodable {

    @Override
    public void play() {
        System.out.println("Method - " + new Object(){}.getClass().getEnclosingMethod().getName());

    }

    @Override
    public void record() {
        System.out.println("Method - " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void pause() {
        System.out.println("Method - " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void stop() {
        System.out.println("Method " + new Object(){}.getClass().getEnclosingMethod().getName());
    }
}
