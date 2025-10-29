// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) { 
        balance += amount;
    }
    
    public void withdraw(double amount) {
        balance -= amount;
    }
}


abstract interface Vehicle {
    void Start();
    void Stop();
}

class Car implements Vehicle {
    private String model = "Eclipse";
    private String brand = "Mitsubishi";
    
    public void Start() {
        System.out.println(brand + " " + model + " is running.");
    }
    
    public void Stop() {
        
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        BankAccount account = new BankAccount();
        car.Start();
        account.deposit(100);
        System.out.println(account.getBalance());
        account.withdraw(50);
        System.out.println(account.getBalance());
        //System.out.print(car.engine);
    }
}
