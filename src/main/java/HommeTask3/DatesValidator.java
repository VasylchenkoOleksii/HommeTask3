package HommeTask3;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by vasylchenko on 23.05.2017.
 */
public class DatesValidator implements ConstraintValidator<Dates,Product> {

    @Override
    public void initialize(Dates constraintAnnotation) {
    }
    @Override
    public boolean isValid(Product product, ConstraintValidatorContext context) {
        context.disableDefaultConstraintViolation();
        context.buildConstraintViolationWithTemplate("Дата создания продукта " +
                      product.getCreationDate() +  " не может быть > или " +
                " = равна дате сроку годности " +  product.getExpirationDate()).addConstraintViolation();
        return product.getCreationDate().getTime() < product.getExpirationDate().getTime();
    }
}
