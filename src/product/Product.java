package product;

import java.time.LocalDate;

public class Product {
    private long ID;
    private String name;
    private String description;
    private int price;
    private LocalDate createDate;
    private String type;
    private int productCount;

    public Product(long ID, String name, String description, int price, LocalDate createDate, String type) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createDate = createDate;
        this.type = type;

    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }
}
