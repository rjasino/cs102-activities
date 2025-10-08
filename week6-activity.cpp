// Online C++ compiler to run C++ program online
#include <iostream>
#include <cmath>

using namespace std;

float compute(char op, int num1, int num2)
{
    float results;

    switch(op) {
    
    case '+':
    results = num1 + num2;
    break;
    
    case '-':
    results = num1 - num2;
    break;
    
    case '/':
    if (num2 == 0)
    {
        cout << "Cannot divide by zero.";
        return 0;
    }
    results = (float)num1 / (float)num2;
    break;
    
    case '*':
    results = num1 * num2;
    break;
    
    case '%':
    results = num1 % num2;
    break;
    
    default:
    cout << "Operation Invalid." << endl;
    break;
    
}
    return results;
}

float computeScientific(string op, int num1, int num2)
{
    float results;
    if(op == "root")
    {
        results = sqrt(num1);
    }
   if(op == "exp")
    {
        results = pow(num1,num2);
    }
    if(op == "log")
    {
        results = log(num1);
    }
    if (op == "fib")
    {
        long a = 0;
        long b = 1;
        long next_term;
                
        cout << "Fibonacci Sequence" << endl;
                
        if (num1 >= 1) 
        {
            cout << "0\n";
        }
        if (num1 >= 2) 
        {
            cout << "1\n";
        }
        
        for (int ctr = 2; ctr <= num1; ++ctr)
        {
            next_term = a + b;
            cout << next_term << endl;
                    
            a = b;
            b = next_term;
        }
    }
    if (op == "fac")
    {
        long factorial = 1;

        cout << "Factorial Calculation" << endl;
                
        for (int ctr = 0; ctr <= num1; ++ctr)
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
        results = factorial;
    }
    return results;
}

void displayMenu(int &num1, int &num2, string op = "")
{
    cout << "Enter number 1: ";
    cin >> num1;
    
    if (op == "" || op == "exp")
    {
        cout << "Enter number 2: ";
        cin >> num2;
    }
}

void loadTitle(int &menu)
{
    cout << "######################################\n";
    cout << "#                                    #\n";
    cout << "#     Math Operation Calculator      #\n";
    cout << "#     Version: 0.0.1                 #\n";
    cout << "#     Author: Arohbi                 #\n";
    cout << "#                                    #\n";
    cout << "######################################\n";
    
    cout << "######################################\n";
    cout << "#                                    #\n";
    cout << "#   1. Standard                      #\n";
    cout << "#   2. Scientific                    #\n";
    cout << "#   3. Programmer                    #\n";
    cout << "#                                    #\n";
    cout << "######################################\n";
    
    cout << "Select from menu: ";
    cin >> menu;
}

int main() 
{ 
    int menu, num1, num2;
    float results;
    char op;
    string opp;

    loadTitle(menu);

    if (menu == 1)
    {
        displayMenu(num1, num2);
        cout << "Please input operation (+,-,/,*,%): ";
        cin >> op;
        results = compute(op, num1, num2);
    }
    
    if (menu == 2)
    {
        cout << "Please input operation (root,exp,log,fib,fac): ";
        cin >> opp;
        displayMenu(num1, num2, opp);
        results = computeScientific(opp, num1, num2);
    }
    
    cout<< "The result is: " << results;
    return 0;
}
