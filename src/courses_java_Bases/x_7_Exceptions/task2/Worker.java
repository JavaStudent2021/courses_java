package courses_java_Bases.x_7_Exceptions.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    private String firstName;        // имя работника;
    private String lastName;        // фамилия работника;
    private String fatherName;        // отчество работника;
    private String post;        // название занимаемой должности;
    private Date dateStartWork; // год поступления на работу.
    private int maxStag  = 5; //
    public int getMaxStag() {
        return maxStag;
    }



    public Worker(String firstName, String lastName, String fatherName, String post, Date dateStartWork) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.post = post;

        try {
            SimpleDateFormat year = new SimpleDateFormat("yyyy");
            int yearStartWork = Integer.parseInt(year.format(dateStartWork));
            int todayYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date()));
            if ((todayYear - yearStartWork) < getMaxStag()) {
                this.dateStartWork = dateStartWork;
            } else {
                System.out.println("Сорри стаж превышен");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", fatherName = '" + fatherName + '\'' +
                ", post = '" + post + '\'' +
                ", dateStartWork = " + new SimpleDateFormat("dd-MM-yyyy").format(dateStartWork) +
                '}';
    }
}
