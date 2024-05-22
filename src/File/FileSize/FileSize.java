package File.FileSize;
import java.io.File;


public class FileSize {
    public static void main(String[] args) {
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";
        File file = new File(filePath);
        long fileSizeInBytes  = file.length();

        // Chuyển đổi kích thước tệp sang KB và MB
        double fileSizeInKB = fileSizeInBytes / 1024.0;
        double fileSizeInMB = fileSizeInKB / 1024.0;
        System.out.println(fileSizeInBytes);
        System.out.println(fileSizeInKB);
        System.out.println(fileSizeInMB);

    }
}
