//Write an application that determines which, if any, of the following files are stored in the folder where you have saved the exercises created in this chapter: autoexec.bat, CompareFolders.java, FileStatistics.class, and Hello.doc. The program should display the number of files found. For example, if two of the files are found display the message 2 of the files exist.

//Note: As part of testing these files will be created and deleted. You may see this reflected in the file broswer.

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
public class FindSelectedFiles 
{
    public static void main(String[] args) 
    {
        Path f1 = Paths.get("/root/sandbox/autoexec.bat");
        Path f2 = Paths.get("/root/sandbox/CompareFolders.java");
        Path f3 = Paths.get("/root/sandbox/FileStatistics.class");
        Path f4 = Paths.get("/root/sandbox/Hello.doc");
        int count = 0;
        try
        {
            if(Files.exists(f1))
            {
                System.out.println(f1.toString() + " exists");
                ++count;
            }
            if(Files.exists(f2))
            {
                System.out.println(f2.toString() + " exists");
                ++count;
            }
            if(Files.exists(f3))
            {
                System.out.println(f3.toString() + " exists");
                ++count;
            }
            if(Files.exists(f4))
            {
                System.out.println(f4.toString() + " exists");
                ++count;
            }
            
            
            
            System.out.println(count + " of the files exist");
        }
        catch(Exception e)
        {
            System.out.println("IO Exception");
        }
    }
}
