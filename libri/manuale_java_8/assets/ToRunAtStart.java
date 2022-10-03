import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ToRunAtStart {
    String value() default "Run at Start";
    int priority() default -1;
}
