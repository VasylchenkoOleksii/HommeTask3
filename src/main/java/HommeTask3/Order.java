package HommeTask3;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by vasylchenko on 22.05.2017.
 */
public class Order {

    @NotNull
    private Product product;


    // Количество товара
    @ForCount
    private int count;

    //Комментарий к заказу
    @ForComment
    private String comment;

    public Order(Product product,
                 int count,
                 String comment) {
        this.product = product;
        this.comment = comment;
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
