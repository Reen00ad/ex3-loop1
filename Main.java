import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        //ex1
//        for (int i = 1; i <=100; i++) {
//            if(i%3==0)
//                System.out.println("Fizz");
//            else if (i%5==0)
//                System.out.println("Buzz");
//            else if (i%3==0 && i%5==0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println(i);
//        }

        //ex2
//        System.out.print("Input a string : ");
//        String input = s.nextLine();
//        String output = "";
//        for (int i = input.length() - 1; i >=0 ; i--) {
//            output+=input.charAt(i);
//        }
//        System.out.print("reverse string "+output);

        //ex3

//        System.out.print("Enter the number : ");
//        int num = s.nextInt();
//        int i = 1;
//        int fac = 1;
//        while(i<=num){
//            fac = fac * i;
//            i++;
//        }
//        System.out.print("the factorial number : "+fac);

        //ex4
//        System.out.print("Enter first number : ");
//        int firstnum = s.nextInt();
//        System.out.print("Enter second number : ");
//        int secondnum = s.nextInt();
//        int total = 1;
//        for (int i = 1; i <= secondnum ; i++) {
//            total = total * firstnum;
//        }
//        System.out.print("the total "+total);

        //ex5
//
//        int oddsum =0;
//        int evensum=0;
//
//
//        System.out.print("Enter number of integers to be entered  : ");
//        int num = s.nextInt();
//        System.out.print("Enter the number :");
//       for ( int i = 1; i <= num ; i++) {
//           int num2 =s.nextInt();
//            if(num2 % 2 == 0 )
//                evensum = evensum + num2 ;
//            else
//                oddsum = oddsum + num2;
//
//
//        }
//        System.out.println("Even sum is : "+evensum);
//        System.out.print("Odd sum is : "+oddsum);


        //ex6
//
//       System.out.print("Enter positive number : ");
//        int num = s.nextInt();
//        int count =0;
//        for (int i = 2; i < num ; i++) {
//            if (num % i ==0){
//                count++;
//                break;}
//        }
//
//        if (count == 0)
//            System.out.print(num+" is a prime number .");
//        else
//            System.out.print(num+" is not a prime number .");

        //ex7
//        int days = 7;
//        int weeks = 4;
//        for (int i = 1; i <= weeks ; i++) {
//            System.out.println("Week "+i);
//            for (int j = 1; j <=days ; j++) {
//                System.out.println("Day "+j);
//            }
//        }

        //ex8
//        System.out.print("write any word ");
//        String word=s.nextLine();
//        String reverseword = "";
//
//        for (int i =word.length()-1; i >= 0 ; i--) {
//            reverseword = reverseword + word.charAt(i);
//        }
//        if (word.toLowerCase().equals(reverseword.toLowerCase()))
//            System.out.print(word + " the word is palindrome . ");
//        else
//            System.out.print(word + " the word is not a  palindrome ");



    }
}