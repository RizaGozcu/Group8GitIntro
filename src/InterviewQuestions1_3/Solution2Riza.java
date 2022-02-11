package InterviewQuestions1_3;

public class Solution2Riza {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i%15==0){
                System.out.println("FINRA");
            }else if(i%5==0){
                System.out.println("RA");
            }
            else if(i%3==0){
                System.out.println("FIN");
            }else{
                System.out.println(i);
            }
        }
    }
}
