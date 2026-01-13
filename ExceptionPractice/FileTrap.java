package ExceptionPractice;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileTrap {
    public static void main(String[] args){
        try{
        FileReader fr = new FileReader("file.txt");
        System.out.println("File Opened Successfully");
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
       }




    }
}
