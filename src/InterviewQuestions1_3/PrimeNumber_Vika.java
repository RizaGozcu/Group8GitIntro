package InterviewQuestions1_3;

public class PrimeNumber_Vika {
    public static void primeNumber(int number){
        if(((number%2==0||number%3==0||number%5==0)&&(number!=2 && number !=3 && number!=5))){
            System.out.println(number+" is not prime number");
        }else{
            System.out.println(number+" is prime number ");
        }
    }

    public static void main(String[] args) {

        primeNumber(7);

    }
}
