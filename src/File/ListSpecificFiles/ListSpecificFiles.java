package File.ListSpecificFiles;

import java.io.File;
import java.io.FilenameFilter;

public class ListSpecificFiles {
    public static void main(String[] args) {
        String directoryPath = "E:\\Download";
        String extension = ".docx";
        // tạo doi tuong file dai dien cho thu muc
        File directory = new File(directoryPath);
        // kiem tra xem file co phai la 1 thu muc khong
        if(directory.isDirectory()){
            // Sử dụng FilenameFilter để lọc các tệp có phần mở rộng cụ thể
            FilenameFilter filter = new FilenameFilter(){
                public boolean accept(File dir, String name){
                    return name.toLowerCase().endsWith(extension.toLowerCase());
                }
            };
            // Lấy danh sách các tệp phù hợp với bộ lọc
            File[] fileList = directory.listFiles(filter);
            // Kiểm tra xem có tệp nào không
            if(fileList != null && fileList.length > 0){
                System.out.println("List that have extension endpoint " + extension);
                for(File file : fileList){
                    System.out.println(file.getName());
                }
            }else{
                System.out.println("List that have no extension endpoint" + extension);
            }
        }else{
            System.out.println("Directory invalid");
        }

    }
}
