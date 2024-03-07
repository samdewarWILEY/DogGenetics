import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        getInput("What's your dog's name?");

    }

    /**
     * Prompt for & return user input
     *
     * @param message to be printed
     * @return myScanner.nextLine()
     */
    public static String getInput(String message) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(message);
        return myScanner.nextLine();
    }
}