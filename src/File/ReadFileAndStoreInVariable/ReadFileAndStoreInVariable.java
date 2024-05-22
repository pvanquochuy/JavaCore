package File.ReadFileAndStoreInVariable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFileAndStoreInVariable {
    public static void main(String[] args) {
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";
        ArrayList<String> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        for(String line : list){
            System.out.println(line);
        }

    }
}
