import java.util.Scanner;

class Task3{
    static void main() {
        Scanner scan = new Scanner(System.in);
        double userGoal = 0;
        double saveTotal = 0;
        double deposit = 0;
        int depositCnt = 0;
        boolean doWhile = false;
        double excess = 0;
        do{
            System.out.println("Input your saving goal.");
            if (scan.hasNextDouble()){
                userGoal = scan.nextDouble();
                if (userGoal >= 0){
                doWhile = true;
                System.out.println(userGoal);

                }

            }

        }while(!doWhile);

        do {
            System.out.println("\nInput your deposit");
            if (scan.hasNextDouble()) {
                deposit = scan.nextDouble();
                depositCnt += 1;
                saveTotal += deposit;
                System.out.printf("\n%14s%5.2f", "Total Saved: $", saveTotal);
                }



        }while (saveTotal < userGoal) ;

        System.out.printf("\n%20s%2d","Number of deposits: ", depositCnt);
        System.out.printf("\n%14s%5.2f", "Total Saved: $", saveTotal);
        excess = saveTotal - userGoal;
        if (excess >= 0) {
            System.out.printf("\n%9s%5.2f", "Excess: $", excess);
        }
    }
}
