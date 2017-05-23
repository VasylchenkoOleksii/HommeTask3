package HommeTask3;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();

        Product iphone = new Product("Iphone", new BigDecimal(0.01),new Date(1),new Date(500));
        Order order = new Order(iphone, 9, "Самый смешной телефон&&&&&&&&&&&&&&&&&&&&&&&&JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF");

        Set<ConstraintViolation<Order>> validate = validator.validate(order);

        System.out.println(":::: validate = " + validate.size());
        for (ConstraintViolation<Order> s : validate) {
            System.out.println(s);
        }
        vf.close();
    }

}
