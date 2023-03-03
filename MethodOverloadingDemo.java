package java;
public class MethodOverloadingDemo {
    public void print(int num) {
        System.out.println("Printing an integer: " + num);
    }

    public void print(double num) {
        System.out.println("Printing a double: " + num);
    }

    public void print(String str) {
        System.out.println("Printing a string: " + str);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();

        demo.print(10); // Printing an integer: 10
        demo.print(3.14); // Printing a double: 3.14
        demo.print("Hello"); // Printing a string: Hello
    }
}
