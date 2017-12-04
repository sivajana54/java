package in.vamsoft.training.io;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathClass {
  public static void main(String[] args) {
    Path p = Paths.get("/home/vamsoft/Desktop/Test1/demo.txt");
    Path p1 = Paths.get("/home/vamsoft/Desktop/Test1/demo.txt");
    System.out.println("Path equals:" + p.equals(p1));
    System.out.println("executing Path method");
    System.out.println("File Name:" + p.getFileName());
    System.out.println("File System:" + p.getFileSystem());
    System.out.println("parant:" + p.getParent());
    System.out.println("name count:" + p.getNameCount());
    System.out.println("name at subscript1:" + p.getName(1));
    System.out.println("Root:" + p.getRoot());

    Path despath = Paths.get("/home/vamsoft/Desktop/Test2/demo.txt");
    try {
      Files.copy(p, despath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
      System.out.println("file copied");
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }

}
