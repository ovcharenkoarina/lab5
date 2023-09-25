import java.util.Scanner;



  public class LoopExample{
  
      public static void main(String[] args) {
          int sum = 0;
          for (int i = 0; i < 100000; i++) {
              Scanner input = new Scanner(System.in);
              sum += input.nextInt();
          }
      }
  }
