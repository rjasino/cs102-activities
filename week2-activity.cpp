// Online C++ compiler to run C++ program online
#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    // Write C++ code here
    //standard library
    //console out
    //operator
    //comment here
    //this is the ascii art of my program
    /*
    this is a novel comment
    add more comment
    another more
    */
    cout << "#####################################" << endl;
    cout << "#                                   #" << endl;
    cout << "#\tRetail Store Management System\t#" << endl;
    cout << "#\tVersion: 0.0.1.                 #\n";
    cout << "#                                   #" << endl;
    cout << "#####################################" << endl;
    
    int y=0;
    y += 3;
    y = y + 3;
    y += 120;
    y++; //x=x+1
    y--;
    cout << y;
    
    int num = 10; //minimum
    float num2 = 2.73827355;
    double num3 = 3.347384738472378;
    char letter = 'A';
    bool isActive = true;
    string name = "Bobby";
    
    cout << num << endl;
    cout << setprecision(7) << num2 << endl;
    cout << setprecision(15) << num3 << endl;
    cout << letter << endl;
    cout << isActive << endl;
    cout << name << endl;
    
    
    int dividend, divisor, remainder;
    float quotient;
    cout << "Enter a Dividend: ";
    cin >> dividend;
    cout << "Enter a Divisor: ";
    cin >> divisor;
    quotient = (float)dividend / (float)divisor;
    remainder = dividend % divisor;
    cout << setprecision(15) << quotient << endl;
    cout << remainder << endl;
    
    
    int a=1, b=2, c=3;
    const int x=4;
    cout << a << endl;
    string s="this is string";
    //camelCase
    int totalAmount;
    a=5;
    cout << a <<endl;
    a=10;
    cout << x << endl;
    cout << a;
    
    return 0;
}
