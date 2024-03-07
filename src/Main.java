import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //get dogs name
        getInput("What's your dog's name?");

        String[] dogs = generateDNA();
        for(String dog : dogs){
            System.out.println(dog);
        }
    }

    /**
     * Generate random percentages & apply to string
     * @return String array containing "{x}% {dog breed}"
     */
    public static String[] generateDNA(){
        String[] dogBreeds = {
                "St. Bernard",
                "Chihuahua",
                "Dramatic RedNosed Asian Pug",
                "Common Cur",
                "King Doberman"
        };
        Random rnd=new Random();
        int total=100;
        int percentage;
        for(int i=0;i<dogBreeds.length-1;i++){

            percentage=rnd.nextInt(total);
            //total of percentage left to chose from
            total-=percentage;
            //randomise for <=total
            dogBreeds[i]=String.format("%d %s",percentage ,dogBreeds[i]);
        }
        //set the final element to remaining total
        if(total>0){
            dogBreeds[dogBreeds.length-1]=String.format("%d %s",total ,dogBreeds[dogBreeds.length-1]);
        }
        return dogBreeds;
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