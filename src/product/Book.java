package product;

import java.time.LocalDate;

public class Book extends Product{
    private long ID;
    private String authorFullName;

    public Book(long ID, String name, String description, int price, LocalDate createDate, String authorFullName) {
        super(ID, name, description, price, createDate, "Books");
        this.ID = ID;
        this.authorFullName = authorFullName;

    }

    @Override
    public long getID() {
        return ID;
    }

    @Override
    public void setID(long ID) {
        this.ID = ID;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }
}

