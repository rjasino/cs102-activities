// Online C++ compiler to run C++ program online
#include <iostream>
#include <iomanip>
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
        cout << "Scientific Calculator System " << endl;
        cout << "Enter a number: ";
        cin >> number1;
        cout << "Enter a second number: ";
        cin >> number2;
        cout << "Enter an operation (root,exp,log,!,fib): ";
        string operation;
        cin >> operation;
        if (operation == "root")
        {
            
        }
        else if (operation == "exp")
        {
            
        }
        else if (operation == "log")
        {
            
        }
        else if (operation == "!")
        {
            
        }
        else if (operation == "fib")
        {
            
        }
        else
        {
            cout << "Invalid Input.";
        }
        //square root
        //exponent
        //logarithmic
        //factorial
        //fibonacci
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
