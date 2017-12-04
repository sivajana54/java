package in.vamsoft.training.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferWithFileChannel {
  public static void main(String[] args) throws IOException {
    RandomAccessFile afile = new RandomAccessFile("/home/vamsoft/Desktop/Test1/demo.txt", "rw");
    FileChannel inchannal = afile.getChannel();
    ByteBuffer buf = ByteBuffer.allocate(10);
    int byteRead = inchannal.read(buf);
    while (byteRead != -1) {
      buf.flip();
      while (buf.hasRemaining()) {
        System.out.println((char) buf.get());
      }
      buf.clear();
      byteRead = inchannal.read(buf);
    }
    afile.close();
  }

}
