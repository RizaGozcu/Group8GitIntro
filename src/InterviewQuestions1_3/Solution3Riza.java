package InterviewQuestions1_3;

public class Solution3Riza {
    public static void main(String[] args) {
       int num1=334;
       int num2=11;
       int div=0;
        for (int i = num2; i <=num1 ; num2 -=num1) {
            div++;
        }

        System.out.println("num1 dividing by +num2+ is"+ div);
        System.out.println("remainder is "+num1);
    }
}
