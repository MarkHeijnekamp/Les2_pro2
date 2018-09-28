import java.util.Scanner;


public class Index {

    public static void main (String[] args){
        boolean ja = false;
        if (ja == true){
            System.out.println("This is false");
        }
        if (ja == false){
            System.out.println("This is true");
        }
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = reader.nextInt(); // Scans the next token of the input as an int.
        //once finished
        reader.close();

        System.out.println("you pressed " + input);
        System.out.println();
        if (input == 666){
            System.out.println("YOU DEVIL");
        }

    }

}
