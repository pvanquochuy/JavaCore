package File.CompareFilesLexicographically;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CompareFilesLexicographically {
    public static void main(String[] args) {
        String filePath1 = "E:\\Download\\PhieuDGRL_MOI.docx";
        String filePath2= "E:\\Download\\PhieuDGRL_MOI.docx";
//        String filePath2= "E:\\Download\\THIẾT-KẾ-TRẢI-NGHIỆM-NGƯỜI-DÙNG.docx";

        try{
            // read content file
            BufferedReader reader1 = new BufferedReader(new FileReader(filePath1));
            BufferedReader reader2 = new BufferedReader(new FileReader(filePath2));

            int char1 = 0;
            int char2 = 0;
            boolean areFilesEqual = true;

            while ((char1 = reader1.read()) != -1 && (char2 = reader2.read()) != -1 ){
                if(char1 != char2){
                    areFilesEqual = false;
                    break;
                }
            }
            //Check if any file is terminated before that file
            while(areFilesEqual && (reader1.read() != -1 || reader2.read() != -1)){
                areFilesEqual = false;
            }
            reader1.close();
            reader2.close();
            if(areFilesEqual){
                System.out.println("The two files are lexicographically identical");
            }else{
                System.out.println("The two files are lexicographically different");
            }

        }catch(IOException e){
            e.printStackTrace();

        }

    }
}
