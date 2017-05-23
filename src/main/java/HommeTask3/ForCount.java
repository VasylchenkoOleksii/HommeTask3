package HommeTask3;

import javax.validation.Constraint;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.*;

/**
 * Created by vasylchenko on 22.05.2017.
 */
@NotNull
@Min(value = 1)
@Max(value = 7)
@ReportAsSingleViolation
@Constraint(validatedBy = {})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ForCount {
    String message() default "{HommeTask3.ForCount.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
