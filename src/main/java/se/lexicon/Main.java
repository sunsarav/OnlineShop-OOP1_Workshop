package se.lexicon;

public class Main {
    static void main(String[] args) {

        System.out.println("Hello and welcome to the Simple Online Store!");
        System.out.println();
        Customer customer1 = new Customer(1, "Shamu", "shamu07@gmail.com");
        Customer customer2 = new Customer(2, "Ragavi", "ragavi@gmail.com");
        Customer customer3 = new Customer(3, "Sikdar", "sikdar@gmail.com");
        Customer customer4 = new Customer(4, "Muthana", "muthana@gmail.com");

        Product product1= new Product(1,"Notebook", 70.59);
        Product product2= new Product(2,"Pen", 90.99);
        Product product3= new Product(3,"Backpack", 390.89);
        Product product4= new Product(4,"Headphones", 480.79);
        Product product5= new Product(5,"Laptop", 20000.99);
        Product product6= new Product(6,"I-Phone17", 11000.69);
        Product product7= new Product(7,"I-Pad", 4000.59);
        Product product8= new Product(8,"TV", 10000.99);

        // Order 1
        Order order1 = new Order(1);
        order1.setCustomer(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Order 2
        Order order2 = new Order(2);
        order2.setCustomer(customer2);
        order2.addProduct(product3);
        order2.addProduct(product4);

        // Order 3
        Order order3 = new Order(3);
        order3.setCustomer(customer3);
        order3.addProduct(product5);
        order3.addProduct(product6);

        // Order 4
        Order order4 = new Order(4);
        order4.setCustomer(customer4);
        order4.addProduct(product7);
        order4.addProduct(product8);

        // Print all orders
        order1.printOrderSummary();
        System.out.println("----------------");

        order2.printOrderSummary();
        System.out.println("----------------");

        order3.printOrderSummary();
        System.out.println("----------------");

        order4.printOrderSummary();
    }




    }

