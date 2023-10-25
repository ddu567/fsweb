package a1025.ch18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SampleW8 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("c:/temp/out.txt"));
    while(true) {
      String line = br.readLine();
      if(line==null) break; // 더이상 읽을 라인이 없을 경우while문을 빠져나옴
      System.out.println(line);
    }
    br.close();
  }
}