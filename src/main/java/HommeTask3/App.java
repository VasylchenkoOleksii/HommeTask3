package HommeTask3;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.groups.Default;
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

        Product iphone = new Product("Iphone", new BigDecimal(0.01),new Date(51),new Date(40));
        Order order = new Order(iphone, 6, "Самый смешной телефон");

        Set<ConstraintViolation<Order>> validate = validator.validate(order,MyGroup.class/*,MyGroup2.class,Default.class*/);

        System.out.println(":::: validate = " + validate.size());
        for (ConstraintViolation<Order> s : validate) {
            System.out.println(s);
        }
        vf.close();
    }

    private static void assertEquals(int i, int size) {
    }


}
