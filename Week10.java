// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//Add customer

class Order {
    ArrayList<Product> products = new ArrayList<Product>();
    
    public addToCart(Product product) {
        products.add(product);
    }
    
    public ArrayList<Product> getCartList() {
        return this.products;
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
    public int getProductName() {
        return productName;
    }
    public int getUnitPrice() {
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
    void InitializeProductList(int noOfProducts) {
        Inventory inventory = new Inventory();
        
        for(int i=1; i<=noOfProducts; i++) {
            Product product = new Product(20 * i, "Product " + i, 10.00f * i, 5);
            this.inventory.setProduct(product);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to Blataditz");
        InitializeProductList(5);
        Order order = new Order();
        Inventory inventory = new Inventory();
        Product orderProduct = new Product
        inventory.getItem(1);
        order.addToCart()
    }
}
