package courses_java_Bases.x_7_Exceptions.task2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    private String name;        // фамилия и инициалы работника;
    private String post;        // название занимаемой должности;
    private Date dateStartWork; // год поступления на работу.

    public Worker(String name, String post, Date dateStartWork) {
        this.name = name;
        this.post = post;
        this.dateStartWork = dateStartWork;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name = '" + name + '\'' +
                ", post = '" + post + '\'' +
                ", dateStartWork = " + new SimpleDateFormat("dd-MM-yyyy").format(dateStartWork) +
                '}';
    }
}
