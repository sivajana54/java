package in.vamsoft.training.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class FileAttribute {
  public static void main(String[] args) throws IOException {
    Path file = Paths.get("/home/vamsoft/Desktop/Test1/demo.txt");
    BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
    System.out.println("creationTime" + attr.creationTime());
    System.out.println("last time :" + attr.lastAccessTime());
    System.out.println("last modified" + attr.lastModifiedTime());
    System.out.println("isDirectory:" + attr.isDirectory());
    System.out.println("isOther:" + attr.isOther());
    System.out.println("Regularfile:" + attr.isRegularFile());
    System.out.println("is symbolic:" + attr.isSymbolicLink());
    System.out.println("isSize:" + attr.size());

    DosFileAttributes attribute = Files.readAttributes(file, DosFileAttributes.class);
    System.out.println("isReadOnly is:" + attribute.isReadOnly());
    System.out.println("isHidden is:" + attribute.isHidden());
    System.out.println("isArchive is:" + attribute.isArchive());
    System.out.println("isSystem is:" + attribute.isSystem());
  }

}
