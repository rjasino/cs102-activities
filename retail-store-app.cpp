// Online C++ compiler to run C++ program online
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    // Write C++ code here
    cout << "#############################################" << endl;
    cout << "#                                           #" << endl;
    cout << "#\t\tRetail Store Management System\t\t#" << endl;
    cout << "#\t\tVersion: 0.0.1                \t\t#" << endl;
    cout << "#\t\tAuthor: Arohbi                \t\t#" << endl;
    cout << "#                                           #" << endl;
    cout << "#############################################" << endl;
    
    cout << "______________________________________________" << endl;
    cout << "│                                            │" << endl;
    cout << "│\t\t1. Point of Sale                  \t │" << endl;
    cout << "│\t\t2. Customer Details              \t │" << endl;
    cout << "│\t\t3. Exit                           \t │" << endl;
    cout << "│                                            │" << endl;
    cout << "‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾" << endl;
    
    int menu;
    cout << "Please select from menu: ";
    cin >> menu;
    
    if (menu == 1)
    {
        int number1, number2;
        float results;
        char operation;
        cout << "Welcome to Blataditz POS system " << endl;
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
        cout << "You've selected " << menu;
    }
    if (menu == 3)
    {
        cout << "You've selected " << menu;
    }
    return 0;
}
