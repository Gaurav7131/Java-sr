import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Roles {
    Role[] value();
}

@Repeatable(Roles.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Role {
    String value();
}

@Role("ADMIN")
@Role("MANAGER")
public class RepeatedAnnotationEx {
    public static void main(String[] args) {
        System.out.println("Repeated Annotations");
    }
}