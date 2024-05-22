package File.LastModifiedDate;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LastModifiedDate {
    public static void main(String[] args) {
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";
        File file = new File(filePath);
        if(file.exists()) {
            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date = new Date(lastModified);
            System.out.println("Last modified: " + date);
        }
    }
}
