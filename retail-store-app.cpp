// Online C++ compiler to run C++ program online
#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
    // Write C++ code here
    cout << "#########################################" << endl;
    cout << "#                                       #" << endl;
    cout << "#\t\tMath Operation Calculator\t\t#" << endl;
    cout << "#\t\tVersion: 0.0.1            \t\t#" << endl;
    cout << "#\t\tAuthor: Arohbi            \t\t#" << endl;
    cout << "#                                       #" << endl;
    cout << "#########################################" << endl;
    
    cout << "______________________________________" << endl;
    cout << "│                                    │" << endl;
    cout << "│\t\t1. Standard                \t │" << endl;
    cout << "│\t\t2. Scientific              \t │" << endl;
    cout << "│\t\t2. Programmer              \t │" << endl;
    cout << "│\t\t3. Exit                    \t │" << endl;
    cout << "│                                    │" << endl;
    cout << "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾" << endl;
    
    int menu, number1, number2;
    float results;
    cout << "Please select from menu: ";
    cin >> menu;
    
    if (menu == 1)
    {
        char operation;
        cout << "Standard Calculator System " << endl;
        cout << "Enter a number: ";
        cin >> number1;
        cout << "Enter a second number: ";
        cin >> number2;
        cout << "Enter an operation (+,-,*,/,%): ";
        cin >> operation;
        switch(operation)
        {
            case '+':
                results = number1 + number2;
                break;
            case '-':
                results = number1 - number2;
                break;
            case '*':
                results = number1 * number2;
                break;
            case '/':
                results = (float)number1 / (float)number2;
                break;
            case '%':
                results = number1 % number2;
                break;
            default:
                //add logic for invalid operation
                break;
        }
        cout << "The results is: " << setprecision(10) << results << endl;
        float x = 3.123456789101113;
        double y = 4.123456789101113;
        cout << fixed << setprecision(5) << x << endl;
        cout << setprecision(15) << y;
    }
    if (menu == 2)
    {
        string op;
        cout << "Scientific Calculator System " << endl;
        cout << "Enter an operation (root,exp,log,!,fib): ";
        cin >> op;
        
        if (op == "root")
        {
            cout << "Enter a number: ";
            cin >> number1;
            cout << "The results is:" << sqrt(number1);
        }
        else if (op == "exp")
        {
            cout << "Enter a number: ";
            cin >> number1;
            cout << "Enter a number raise to expotent: ";
            cin >> number2;
            cout << "The results is: " << pow(number1, number2);
        }
        else if (op == "log")
        {
            cout << "Enter a number: ";
            cin >> number1;
            cout << "The results is:" << log(number1);
        }
        else if (op == "!")
        {
            long factorial = 1;
            
            cout << "Enter a number: ";
            cin >> number1;
            cout << "Factorial Calculation" << endl;
            
            for (int ctr = 0; ctr <= number1; ++ctr)
            {
                if (ctr == 0 || ctr == 1)
                {
                    cout << ctr << "! = 1" << endl;
                    factorial = 1;
                    continue;
                }
                //add validation for max factorial 20!
                factorial *= ctr;
                cout << ctr << "! = ";
                
                for (int ctr2 = ctr; ctr2 >= 1; --ctr2)
                {
                    cout << ctr2;
                    if (ctr2 > 1)
                    {
                        cout << " x ";
                    }
                }
                
                cout << " = " << factorial << endl;
            }
        }
        else if (op == "fib")
        {
            //next to do is to add validation for the input for all function
            long a = 0;
            long b = 1;
            long next_term;
            
            cout << "Enter a number: ";
            cin >> number1;
            cout << "Fibonacci Sequence" << endl;
            
            if (number1 >= 1) 
            {
                cout << "0\n";
            }
            if (number1 >= 2) 
            {
                cout << "1\n";
            }
    
            for (int ctr = 2; ctr <= number1; ++ctr)
            {
                next_term = a + b;
                cout << next_term << endl;
                
                a = b;
                b = next_term;
            }
        }
        else
        {
            cout << "Invalid Input.";
        }
    }
    if (menu == 3)
    {
        //int number1, number2;
        //float results;
        //char operation;
        //cout << "Computer Number Conversion System " << endl;
        //dec to bin
        //dec to oct
        //dec to hex
        //bin to hex
        //hex to bin
    }
    return 0;
}
