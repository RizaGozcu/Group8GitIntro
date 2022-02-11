package InterviewQuestion1_3;

public class Question1_HsynIsir {
    /*
1. Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
2.Numbers - FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
3.Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
     */


    public static void oddOrEven(int num) {
        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }

    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
        oddOrEven(0);
    }

}
