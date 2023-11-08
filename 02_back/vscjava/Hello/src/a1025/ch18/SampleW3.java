package a1025.ch18;

import java.io.FileWriter;
import java.io.IOException;

public class SampleW3 {
  public static void main(String[] args) throws IOException {
    // FileOutputStream 대신에 FileWriter를 이용하면 byte 배열 대신 문자열을 사용할 수 있어 편리하다.
    FileWriter fw = new FileWriter("c:/temp/out.txt");
    for(int i = 1; i<11; i++) {
      String data = i+"번째 줄입니다.\r\n"; // 줄바꿈
      fw.write(data);
    }
    fw.close();
  }
}
