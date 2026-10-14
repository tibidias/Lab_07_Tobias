import java.util.Scanner;

class Task1{
    static void main() {
        Scanner scan = new Scanner(System.in);
        String userInput = "";
        String backwards = "";
        System.out.println("Input a word.");
        userInput = scan.nextLine();

        for(int i = userInput.length(); i > 0; i--){
            String currentChar = userInput.substring(i-1, i);
            backwards += currentChar;

        }
        if (backwards.equalsIgnoreCase(userInput)){
            System.out.println("Your word is a pallindrome.");
        }else{
            System.out.println("Your word is not a pallindrome.");
        }
    }
}
