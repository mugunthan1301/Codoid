package java;

public class ExceptionHandling {
  public static void main(String[] args) throws InterruptedException {
        try {
            System.out.println("Sleeping for 5 seconds...");
            Thread.sleep(5000);
            System.out.println("Waking up...");
        } catch (InterruptedException e) {
            System.out.println("Interrupted while sleeping!");
        }
    }
}