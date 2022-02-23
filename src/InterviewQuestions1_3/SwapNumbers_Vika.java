package InterviewQuestions1_3;

public class SwapNumbers_Vika {

    public static void swapNumbers(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        swapNumbers(3,5);

    }
}


