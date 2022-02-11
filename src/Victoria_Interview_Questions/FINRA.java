package Victoria_Interview_Questions;

public class FINRA {

    public static void finra(int n) {

        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("FIN");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("RA");
                continue;
            }
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        finra(55);
    }
}


