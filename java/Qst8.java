public class Qst8 {
  public static void main(String [] args) {
    for(int i = 1; i <= 4; i++) {
      for(int j = i; j <= i; j+=i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
