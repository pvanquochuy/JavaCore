package File.ReadFromConsole;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class ReadFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter a integer: ");
        int inputInteger = scanner.nextInt();

        String filepath = "C:\\Users\\PC\\OneDrive\\Desktop\\input.txt";
        // write the file
        try(FileWriter writer = new FileWriter(filepath)){
            writer.write(inputString + "\n");
            writer.write(inputInteger + "\n");
            System.out.println("File written" + filepath);
        }catch(IOException e){
            e.printStackTrace();
        }
        // read the file
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            System.out.println("Content of file " + filepath);

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
                System.out.println("Content of file " + filepath);
    }
}
