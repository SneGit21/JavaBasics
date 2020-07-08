package basicJavaExamples;

/*
Swap Numbers Without Using Third Variable Java Example
This Swap Numbers Java Example shows how to 
swap value of two numbers without using third variable using java.
*/

public class SwapElementsWithoutThirdVariableExample {

public static void main(String[] args) {

int num1 = 10;
int num2 = 20;

System.out.println("Before Swapping");
System.out.println("Value of num1 is :" + num1);
System.out.println("Value of num2 is :" +num2);

//add both the numbers and assign it to first
num1 = num1 + num2;

//subtract second number from first number (which is addition of two numbers, you will get value of first number
num2 = num1 - num2;

//subtract second number (which is first number) from first number (which is addition of two numbers, you will get value of second number
num1 = num1 - num2;

System.out.println("Before Swapping");
System.out.println("Value of num1 is :" + num1);
System.out.println("Value of num2 is :" +num2);
}


}

/*
Output of Swap Numbers Without Using Third Variable example would be
Before Swapping
Value of num1 is :10
Value of num2 is :20
Before Swapping
Value of num1 is :20
Value of num2 is :10
*/