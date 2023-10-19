package hw.ch6_1617;

class Printer2 {
  public void println(int value){
    System.out.println(value);
  }
  public void println(boolean value){
    System.out.println(value);
  }
  public void println(double value){
    System.out.println(value);
  }
  public void println(String value){
    System.out.println(value);
  }


}

public class PrinterExample {
  public static void main(String[] args) {
    Printer2 printer = new Printer2();
    printer.println(10);       // int
    printer.println(true);     // boolean
    printer.println(5.7);      // double
    printer.println("홍길동"); // String
  }
}
