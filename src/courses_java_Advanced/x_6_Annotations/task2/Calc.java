package courses_java_Advanced.x_6_Annotations.task2;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Calc {
    int numX () default 0;
    int numY () default 0;

}
