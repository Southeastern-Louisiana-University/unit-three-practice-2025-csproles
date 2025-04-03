import java.io.FileWriter;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file = new java.io.File("Scores3.txt");
        if(file.exists()){
            System.out.println("File exisits already!");
            System.exit(1);
        }
        java.io.PrintWriter output = new java.io.PrintWriter(file);
        //Write input to the file
        output.write("John Russell ");
        output.println(89);
        output.print("Joe Smith ");
        output.print(109);
        output.close();
    }
}
