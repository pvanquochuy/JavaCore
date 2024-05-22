package File.LongestWordInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestWordInFile {
    public static void main(String[] args) {
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";

        String longestWord = "";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] words = line.split("\\s+");
                for(String word : words){
                    if(word.length() > longestWord.length()){
                        longestWord = word;
                    }
                }
            }
            System.out.println(" longest word: " + longestWord);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
