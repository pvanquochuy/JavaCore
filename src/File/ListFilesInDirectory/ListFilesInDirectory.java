package File.ListFilesInDirectory;
import java.io.File;

public class ListFilesInDirectory {
    public static void main(String[] args) {
        String directoryPath = "E:\\w3-band";

        File directory = new File(directoryPath);

        if(directory.isDirectory()) {
            String[] filesList = directory.list();

            if(filesList != null) {
                System.out.println("ListFilesInDirectory " + directoryPath + ":");
                for(String file : filesList){
                    System.out.println(" " + file);
                }
            }else{
                System.out.println("Not found " + directoryPath);
            }
        }else{
            System.out.println(directoryPath + "not found");
        }
    }
}
