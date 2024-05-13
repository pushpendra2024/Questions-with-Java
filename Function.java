import java.util.*;

public class Function {

    // 1. code of two numbers of multiplication
    public static int MultiplyFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a = ");
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();
        int mul = a * b;
        return mul;
    }

    // 2.Enter 3 numbers from the user & make a function to print their average

    public static double  AvgNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("A = ");
        double a = sc.nextInt();

        System.out.println("B = ");
        double b = sc.nextInt();

        System.out.println("c=");
        double c = sc.nextInt();

        //calculate for average 
        double average = a+b+c/3;
        return average;

    }

    // 3.Write a function to print the sum of all odd numbers from 1 to n

    public static void printSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) { // Iterate through odd numbers from 1 to n
            sum += i; // Add current odd number to the sum
        }
        System.out.println( + sum);
    }

    //4.Write a function which takes in 2 numbers and returns the greater of those two

    public static int FindGreatTwoNumber(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("A = ");
        int a = sc.nextInt();

        System.out.println("B = ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater");
        }
        else
        System.out.println("b is greater");

        return FindGreatTwoNumber();
    }

    

    //5. Write a function that takes in the radius as input and returns the circumference of a circle

    public static double calculateCircumference() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    // 6.Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

    public static int CompareAge(){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>18){
            System.out.println("Person is eligible for vote");
        }
        else
            System.out.println("Person not eligible for vote");
        
        return CompareAge();
    }

    //7. Write an infinite loop using do while condition

    public static void InfiniteLoop(){
        
        do{
            
            System.out.println("infinite loop");

        }while(true);
        
    }

    public static void main(String[] args) {
    InfiniteLoop();
    }
}


