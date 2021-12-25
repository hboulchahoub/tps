package presentation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Author {
    String name() default "said";
    int exp() default 5;
}
