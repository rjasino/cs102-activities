// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//1. Class and Object
//Class
class Student extends Person {
    private int studentId; //default
    
    //constructor
    public Student() {
        
    }
    
    public Student(String name, int age) {
        super.name = name;
        super.age = age;
    }
    
    public Student(String name, int age, int studentId) {
        super.name = name;
        super.age = age;
        this.studentId = studentId;
    }
    
    //Accessor - Getter
    public String getName() {
        return name;
    }
    //Mutator - Setter
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void MerryChristmas() {
        System.out.print("Maligayang Pasko...\n");
    }
} //one class inheritance

class Person implements Greetings, Moving { //multiple interface
    protected String name; //fields
    protected int age; //fields
    
    public void Introduce() {
        System.out.print("Hello, my name is " + this.name + ". I am " + this.age + " years old.\n");
    }
    
    public void MerryChristmas() {
        System.out.print("Merry Christmas...\n");
    }
    
    public void Walk() {
        System.out.print(this.name + " walking...\n");
    }
}

interface Greetings {
    void Introduce();
    void MerryChristmas();
}

interface Moving {
    void Walk();
}
//2. Access Modifiers
//public - open
//protected - semi open, inheritance
//default (no keyword) - semi open, no external access
//private - within context (class, method, accessor, mutator, constructor)

//3. Pillars of OOP
//* Encapsulation - access modifier
//* Abstraction - interfaces
//* Inheritance - interfaces and inheritance
//* Polymorphism - method overloading, override

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
        Student student = new Student("Arohbi", 18, 2006123456);
        student.Introduce();
        student.Walk();
        student.MerryChristmas();
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
