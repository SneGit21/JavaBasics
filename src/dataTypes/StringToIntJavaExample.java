package dataTypes;

/*
int to String Example
This int to String java example shows how to convert int to String in Java.
*/
public class StringToIntJavaExample {
public static void main(String args[]){

//int variable
int i = 11;

/*
* To convert int to String, use 
* toString(int i)
* method of Integer wrapper class.
*/
String str = Integer.toString(i);
int a = Integer.valueOf(str);
System.out.println("a = "+(a+2));
System.out.println("int to String : " + (str+1));
}
}

/*
Output of int to String example would be
int to String : 11
*/
