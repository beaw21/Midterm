package Entity;

import java.util.Objects;

public class calculateDiscount {
    Integer type;
    Double price;

    public calculateDiscount(Integer type, Double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof calculateDiscount)) return false;
        calculateDiscount that = (calculateDiscount) o;
        return Objects.equals(type, that.type) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price);
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
