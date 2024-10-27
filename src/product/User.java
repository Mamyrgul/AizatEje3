package product;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
private long ID;
private String firstName;
private String lastName;
private String email;
private String password;
private Product [] products;
private int productCount;

public User(){}

    public User(long ID, String firstName, String lastName, String email, String password, Product[] products, int productCount) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;
        this.productCount = productCount;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public static User register(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Регистрация нового пользователя.");
        System.out.println("ID: ");
        long ID = scanner.nextInt();
        scanner.nextLine();
        System.out.println("First name: ");
        String firstName= scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Email: ");
        String email = scanner.nextLine();
        System.out.println("Password: ");
        String password= scanner.nextLine();

            Product[] defaultProducts = new Product[10];
            int defaultProductCount = 0;
            return new User(ID, firstName, lastName, email, password, defaultProducts, defaultProductCount);
        }
    public boolean login(String email, String password){
      return  this.email.equals(email) && this.password.equals(password);
    }

    public void  addProduct(Product product){
        if (productCount<products.length){
            products[productCount]=product;
            productCount++;
            System.out.println("Успешно добавили товар");
        }
        else {
            System.out.println("Нет места для добаление нового продукта");
        }
        }

        public void getAllProducts(){
            System.out.println("Все продукты: ");
            for (int i = 0; i < productCount; i++) {
                System.out.println(products[i].getName());
            }
        }
        public void getElectronics(){
            System.out.println("Все электроники: ");
            for (int i = 0; i < productCount; i++) {
                if (products[i].getType().equals("Electronics")){
                    System.out.println(products[i].getName());
                }
            }
        }
        public void getBooks(){
            System.out.println("Все книги: ");
            for (int i = 0; i < productCount; i++) {
                if (products[i].getType().equals("Books")){
                    System.out.println(products[i].getName());
                }
            }
        }
    }