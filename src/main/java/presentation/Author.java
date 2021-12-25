package presentation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Author {
    String name() default "omar";
    int exp() default 7;

}
