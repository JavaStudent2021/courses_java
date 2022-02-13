package courses_java_Advanced.x_6_Annotations.task3;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Car {
    String speed() default "very";
    int prise() default 100;

}
