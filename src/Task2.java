import java.util.Scanner;


class Task2{
    static void main() {
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        int a = 0;
        int b = 1;
        boolean doWhile = false;
        do {
            System.out.println("How many terms of the Fibonacci Sequence do you want?");
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                if (userInput >= 2) {
                    System.out.print(0 + " " + 1 + " ");


                    for (int i = 2; i < userInput; i++) {
                        int c = b;
                        b = a + b;
                        a = c;
                        System.out.print(b);
                        System.out.print(" ");


                    }
                    doWhile = true;
                    scan.nextLine();
                }
            }else if (userInput == 1){
                System.output.println(0);
                doWhile = true;
        }while(!doWhile);
    }
}
