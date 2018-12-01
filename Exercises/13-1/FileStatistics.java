//Write an application that displays the name, containing folder, size, and time of last modification for the file FileStatistics.java.
//like
//File name is FileStatistics.java
//Folder name is sandbox
//File's size is 884
//File's creation time is 2018-05-30T16:28:01.410343Z 

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FileStatistics {
    public static void main(String[] args) {
        Path file = Paths.get("/root/sandbox/FileStatistics.java");
        
        try
        {
            int count = file.getNameCount();
            System.out.println("Path is " + file.toString());
            System.out.println("File name is " + file.getFileName());
            System.out.println("Folder name is " + file.getName(count - 2));
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("File's size is " + attr.size());
            FileTime time = attr.creationTime();
            System.out.println("File's creation time is " + time);
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
        
    }
}
