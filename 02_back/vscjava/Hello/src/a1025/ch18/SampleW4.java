package a1025.ch18;

import java.io.IOException;
import java.io.PrintWriter;

public class SampleW4 {
  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter("c:/temp/out.txt");
    for(int i = 1; i<11; i++) {
      String data = i+"번째 줄입니다.";
      pw.println(data);
    }
    pw.close();
  }
}
