// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    String name;
    String email;
    String phoneNumber;
    String address;
    
    //Constructors
    public Customer() {
        //empty
    }

    public Customer(String name, String email, String phoneNumber, String address) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    //Accessors
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    
    //Mutators
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

class Order {
    ArrayList<Product> cartItems = new ArrayList<Product>();
    float grandTotal = 0;
    String paymentMethod;
    String paymentAccountNumber;
    String paymentAccountName;
    String shippingMethod;
    
    public void addToCart(Product product) {
        this.grandTotal += product.getUnitPrice() * product.getQuantity();
        cartItems.add(product);
    }
    
    public ArrayList<Product> getCartList() {
        return this.cartItems;
    }

    public float getGrandTotal() {
        return grandTotal;
    }
    
    public String getPaymentMethod() {
        return paymentMethod;
    }
    
    public void setPaymentMethod(int paymentMethod) {
        switch (paymentMethod) {
            case 1:
                this.paymentMethod = "COD";
                break;
            case 2:
                this.paymentMethod = "GCASH";
                break;
            case 3:
                this.paymentMethod = "BANK_TRANSFER";
                break;
            default:
                this.paymentMethod = "Unknown";
                break;
        }
    }
    
    public String getShippingMethod() {
        return shippingMethod;
    }
    
    public void setShippingMethod(int shippingMethod) {
        switch (shippingMethod) {
            case 1:
                this.shippingMethod = "DOOR_TO_DOOR";
                break;
            case 2:
                this.shippingMethod = "PICK_UP";
                break;
            default:
                this.shippingMethod = "Unknown";
                break;
        }
    }

    public String getPaymentAccountNumber() {
        return paymentAccountNumber;
    }

    public void setPaymentAccountNumber(String paymentAccountNumber) {
        this.paymentAccountNumber = paymentAccountNumber;
    }
    
    public String getPaymentAccountName() {
        return paymentAccountName;
    }

    public void setPaymentAccountName(String paymentAccountName) {
        this.paymentAccountName = paymentAccountName;
    }
}

class Inventory {
    ArrayList<Product> products = new ArrayList<Product>();
    
    public ArrayList<Product> getInventory() {
        return this.products;
    }
    
    public Product getItem(int id) {
        Product foundItem = null;
        
        for (Product item: products) {
            if (item.id == id) {
                foundItem = item;
                break;
            }
        }
        
        return foundItem;
    }
    
    public void setProduct(Product product) {
        this.products.add(product);
    }
}

class Product {
    static int ctr = 1;
    int id;
    String productName;
    float unitPrice;
    int quantity;
    
    //Constructors
    public Product() {
        //empty
    }
    
    public Product(String productName, float unitPrice, int quantity) {
        this.id = ctr++;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    //Accessors
    public int getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public float getUnitPrice() {
        return unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    
    //Mutators
    public void setId(int id) {
        this.id = id;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Main {
    private static Inventory inventory = new Inventory();
    private static Order order = new Order();
    private static Customer customer = new Customer();
    
    static void InitializeProductList() {
        Product product1 = new Product("Laptop", 800.00f, 10);
        Product product2 = new Product("Smartphone", 500.00f, 20);
        Product product3 = new Product("Tablet", 300.00f, 15);
        Product product4 = new Product("Headphones", 50.00f, 50);
        Product product5 = new Product("Smartwatch", 150.00f, 25);
        
        inventory.setProduct(product1);
        inventory.setProduct(product2);
        inventory.setProduct(product3);
        inventory.setProduct(product4);
        inventory.setProduct(product5);
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    static void renderMenu() {
        System.out.println("===========================================================");
        System.out.println("\tBlataditz Retail Store Management System\t");
        System.out.println("===========================================================\n");
        System.out.println("\tSelect from menu:");
        System.out.println("\t1. Purchase Order");
        System.out.println("\t2. Manage Inventory");
        System.out.println("\t3. Exit\n");
        System.out.print("\tEnter your choice: ");
    }
    
    static void displayInventory() {
        ArrayList<Product> products = inventory.getInventory();
        System.out.println("\tList of Products:");
        for (Product item: products) {
            System.out.println("\t" + item.getId() + ". " + item.getProductName() + " - price: " + item.getUnitPrice() + ", stock: " + item.getQuantity());
        }
    }

    static void displayCartItems() {
        ArrayList<Product> cartItems = order.getCartList();
        System.out.println("\tItems in Cart:");
        for (Product item: cartItems) {
            System.out.println("\t[x] " + item.getProductName() + " - unit price: " + item.getUnitPrice() 
                + ", qty: " + item.getQuantity() + ", total: " 
                + (item.getUnitPrice() * item.getQuantity()));
        }
        System.out.println("\tGrand Total: " + order.getGrandTotal());
    }

    static void inputCustomerInformation(Scanner scanner) {
        System.out.println("===========================================================");
        System.out.println("\tPurchase Order\t");
        System.out.println("===========================================================\n");
        System.out.println("\tCustomer Information:");
        System.out.print("\tEnter Name: ");
        customer.setName(scanner.next());
        System.out.print("\tEnter Email: ");
        customer.setEmail(scanner.next());
        System.out.print("\tEnter Phone Number: ");
        customer.setPhoneNumber(scanner.next());
        System.out.print("\tEnter Address: ");
        customer.setAddress(scanner.next());
        System.out.print("\tSelect Payment Method: \n");
        System.out.print("\t\t1. Cash on Delivery\n\t\t2. GCash\n\t\t3. Bank Transfer\n\t\tEnter Choice: ");
        order.setPaymentMethod(scanner.nextInt());
        System.out.print("\n\t\tEnter Bank/GCash Account Number: ");
        order.setPaymentAccountNumber(scanner.next());
        System.out.print("\n\t\tEnter Account Name: ");
        order.setPaymentAccountName(scanner.next());
        System.out.print("\tSelect Shipping Method: \n");
        System.out.print("\t\t1. Door to Door\n\t\t2. Pick Up\n\t\tEnter Choice: ");
        order.setShippingMethod(scanner.nextInt());
    }
    
    static void displayConfirmation() {
        clearScreen();
        System.out.println("===========================================================");
        System.out.println("\tOrder Confirmation\t");
        System.out.println("===========================================================\n");
        System.out.println("\tCustomer Information:");
        System.out.println("\tName: " + customer.getName());
        System.out.println("\tEmail: " + customer.getEmail());
        System.out.println("\tPhone Number: " + customer.getPhoneNumber());
        System.out.println("\tAddress: " + customer.getAddress() + "\n");
        
        displayCartItems();
        
        System.out.println("\n\tPayment Method: " + order.getPaymentMethod());
        System.out.println("\tAccount Number: " + order.getPaymentAccountNumber());
        System.out.println("\tAccount Name: " + order.getPaymentAccountName() + "\n");
        
        System.out.println("\tShipping Method: " + order.getShippingMethod());
        
        System.out.println("\n===========================================================\n");
        System.out.println("\tThank you for your purchase!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        InitializeProductList();
        
        do {
            renderMenu();
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    char moreChoice = 'n';
                    do {
                        clearScreen();
                        System.out.println("===========================================================");
                        System.out.println("\tPurchase Order\t");
                        System.out.println("===========================================================\n");
                        
                        if (order.getCartList().size() > 0) {
                            displayCartItems();
                            System.out.println("\n===========================================================\n");
                        }
                        displayInventory();

                        System.out.print("\n\tSelect product to add: ");
                        int prodChoice = scanner.nextInt();
                        System.out.print("\n\tEnter quantity: ");
                        int qtyChoice = scanner.nextInt();
                        System.out.print("\n\tAdd more? (y/n): ");
                        moreChoice = scanner.next().charAt(0);

                        Product selectedProduct = inventory.getItem(prodChoice);
                        selectedProduct.setQuantity(qtyChoice);
                        order.addToCart(selectedProduct);
                    } while (moreChoice == 'y' || moreChoice == 'Y');
                    
                    clearScreen();
                    inputCustomerInformation(scanner);
                    displayConfirmation();
                    break;
                case 2:
                    System.out.println("Customer Management selected.");
                    break;
                case 3:
                    System.out.println("Purchase Order selected.");
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();

        // Order order = new Order();
        // Product orderProduct = inventory.getItem(20);
        // order.addToCart(orderProduct);
        // orderProduct = inventory.getItem(40);
        // order.addToCart(orderProduct);
        // ArrayList<Product> orderedProducts = order.getCartList();
        // for (Product item: orderedProducts) {
        //     System.out.println(item.productName);
        // }
    }
}
