// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
//Add customer

class Order {
    ArrayList<Product> cartItems = new ArrayList<Product>();
    
    public void addToCart(Product product) {
        cartItems.add(product);
    }
    
    public ArrayList<Product> getCartList() {
        return this.cartItems;
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
    int id;
    String productName;
    float unitPrice;
    int quantity;
    
    //Constructors
    public Product() {
        //empty
    }
    
    public Product(int id, String productName, float unitPrice, int quantity) {
        this.id = id;
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
    
    static void InitializeProductList(int noOfProducts) {
        
        for(int i=1; i<=noOfProducts; i++) {
            // Your product IDs are 20, 40, 60, 80, 100
            Product product = new Product(20 * i, "Product " + i, 10.00f * i, 5);
            inventory.setProduct(product);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Blataditz");
        
        InitializeProductList(5);
        
        Order order = new Order();
        Product orderProduct = inventory.getItem(20);
        order.addToCart(orderProduct);
        orderProduct = inventory.getItem(40);
        order.addToCart(orderProduct);
        ArrayList<Product> orderedProducts = order.getCartList();
        for (Product item: orderedProducts) {
            System.out.println(item.productName);
        }
    }
}
