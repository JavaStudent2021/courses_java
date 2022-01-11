package courses_java_Bases.x_4_Abstraction.task2;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("class - " + getClass().getSimpleName() + ": method - " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void create() {
        System.out.println("class - " + getClass().getSimpleName() + ": method - " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void change() {
        System.out.println("class - " + getClass().getSimpleName() + ": method - " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Override
    public void save() {
        System.out.println("class - " + getClass().getSimpleName() + ": method - " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }
}
