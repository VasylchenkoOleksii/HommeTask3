package HommeTask3;

/**
 * Created by vasylchenko on 22.05.2017.
 */
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by vasylchenko on 22.05.2017.
 */
@NotNull(message = "{HommeTask3.ForComment.NotNull.message}")
@Size(min = 10, max = 50, message = "{HommeTask3.ForComment.Size.message}")
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ForComment {
    String message() default "{HommeTask3.ForComment.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
