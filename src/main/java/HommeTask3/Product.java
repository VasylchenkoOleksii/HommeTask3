package HommeTask3;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by vasylchenko on 22.05.2017.
 */
 @Dates
  public class Product {
    // Имя продукта
    @NotNull (message = "Наименование продукта не моежт быть пустым", groups = MyGroup2.class)
    @Size(max = 30, message = "Наименование продукта не может быть длиннее {max} символов", groups = MyGroup2.class)
    private String name;

    // Цена продукта
    @DecimalMin(value = "0.1", message = "Минимальная цена должна быть =  {value}", groups = MyGroup.class)
    private BigDecimal price;


    //Дата создания продукта
    @Past( message = "Дата должна быть меньше текущей", groups = MyGroup2.class)
    private Date creationDate;

    //Срок годности
    @Future(message = "Должна быть дата в будущем", groups = MyGroup2.class)
    private Date expirationDate;


    public Product(String name,
                   BigDecimal price,
                   Date creationDate,
                   Date expirationDate) {
        this.name = name;
        this.price = price;
        this.creationDate = creationDate;
        this.expirationDate = expirationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
