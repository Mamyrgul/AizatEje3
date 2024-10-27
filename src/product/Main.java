package product;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         /*  Создайте клаcc Product.
                Поля (id,name, description, price,
                        createDate,type,productCount)
        Создайте два дочерних класса
        Electronics поля(id,brand, color, isNew, memory) и
        Book (id,authorFullName)
        User (id,firstName, lastName, email, password,
                products) Для старта сайта выбираем 3 операции
                -Register
                -Login
                -Exit
        После входа в аккаунт пользователю должны быть доступны
        следующие методы:
        -Add new Product
                -Get All Products
        -Get All Books
        -Get All Electronics*/


                Scanner scanner = new Scanner(System.in);
                User user = User.register();
                System.out.println("Регистрация завершена");

                System.out.println("Введите email для входа: ");
                String email = scanner.nextLine();
                System.out.println("Введите пароль: ");
                String password = scanner.nextLine();

                if (user.login(email, password)) {
                    System.out.println("Вы вошли в систему");
                    boolean isLogin = true;

                    while (isLogin) {
                        System.out.println("Выберите действие: Add new products, Get all products, Get all books, Get all electronics, Logout");
                        String action = scanner.nextLine();

                        switch (action) {
                            case "Add new products":
                                System.out.println("Введите тип продукта (Electronics or Books): ");
                                String type = scanner.nextLine();

                                System.out.println("ID:");
                                long ID = scanner.nextInt();
                                scanner.nextLine(); // Consume the newline

                                System.out.println("Название: ");
                                String name = scanner.nextLine();

                                System.out.println("Описание: ");
                                String description = scanner.nextLine();

                                System.out.println("Цена: ");
                                int price = scanner.nextInt();
                                scanner.nextLine(); // Consume the newline

                                LocalDate createDate = LocalDate.now();

                                if (type.equals("Books")) {
                                    System.out.println("Автор: ");
                                    String authorFullName = scanner.nextLine();
                                    user.addProduct(new Book(ID, name, description, price, createDate, authorFullName));
                                } else if (type.equals("Electronics")) {
                                    System.out.println("Бренд: ");
                                    String brand = scanner.nextLine();

                                    System.out.println("Цвет: ");
                                    String color = scanner.nextLine();

                                    System.out.println("Новое (true or false): ");
                                    boolean isNew = scanner.nextBoolean();

                                    System.out.println("Память: ");
                                    int memory = scanner.nextInt();
                                    scanner.nextLine(); // Consume the newline

                                    user.addProduct(new Electronics(ID, name, description, price, createDate, brand, color, isNew, memory));
                                } else {
                                    System.out.println("Неверный тип продукта.");
                                }
                                break;

                            case "Get all products":
                                user.getAllProducts();
                                break;

                            case "Get all books":
                                user.getBooks();
                                break;

                            case "Get all electronics":
                                user.getElectronics();
                                break;

                            case "Logout":
                                isLogin = false;
                                break;

                            default:
                                System.out.println("Неверная команда.");
                                break;
                        }
                    }
                } else {
                    System.out.println("Неверный email или пароль.");
                }
                scanner.close();
            }
        }
