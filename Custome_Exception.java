public class Custome_Exception {
  public static void main(String[] args) {
    try {
      int age = 17;
      if (age < 18) {
        throw new Custome_Exception("You must be at least 18 years old to proceed.");
      }
    } catch (Custome_Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
