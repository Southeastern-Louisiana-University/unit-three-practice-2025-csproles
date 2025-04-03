import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            java.io.File file = new java.io.File("Scores9.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String firstName = input.next();
                String lastName = input.next();
                String IQ = input.next();
                System.out.println(firstName + " " + lastName + " " + IQ);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("File not found!");
        }
    }
}