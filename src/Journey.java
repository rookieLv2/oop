import java.math.BigDecimal;

public class Journey {
    private String name;
    private String description;
    private BigDecimal price;

    public Journey(String name, String description, BigDecimal price) {
        setName(name);
        setDescription(description);
        setPrice(price);
    }

    public void setName(String name) {
        if(name.length() >= 1  && name.length() <= 30) {
            throw new IllegalArgumentException("The name should be 1~30");
        }
        this.name = name;
    }

    public void setDescription(String description) {
        if(description.length() > 0 && description.length() <= 300) {
            throw new IllegalArgumentException("The description should be 0~300");
        }
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        if(price.intValue() < 1) {
            throw new IllegalArgumentException("The price should be > 1");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
