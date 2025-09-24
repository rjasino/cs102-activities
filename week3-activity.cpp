// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;

int main() {
    // Write C++ code here
    cout << "Try programiz.pro" << endl;
    int number[2];
    char operation;
    float results;
    
    int i = 0;
    while (i < 5)
    {
        cout << i << endl;
        i++;
    }
    
    do 
    {
        cout << i << endl;
        i++;
    } while(i < 5);
    
    for (int i = 0; i < 10; i++) {
    if (i == 4) {
      continue; // Exit the loop when i is 4
    }
    cout << i << "\n";
  }
  
  string cars[7] = {"Volvo", "BMW", "Ford", "Mazda", "Toyota", "Honda", "Kia" };
 

  for (int i = 0; i < 7; i++) {
    cout << cars[i] << "\n";
  }

  

    
    cout << "Please enter a number: ";
    cin >> number[0];
    cout << "Please enter 2nd number:";
    cin >> number[1];
    cout << "Please operation (+,-,*,/,%): ";
    cin >> operation;
    
    switch(operation)
    {
        case '+':
            results = number[0] + number[1];
            break;
        case '-':
            results = number[0] - number[1];
            break;
        case '*':
            results = number[0] * number[1];
            break;
        case '/':
            results = number[0] / number[1];
            break;
        case '%':
            results = number[0] % number[1];
            break;
        default:
            cout << "Operation not valid." << endl;
            break;
    }
    cout << "The result is: " << results;
    return 0;
}
