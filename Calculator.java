//write a java program to implement method overloading
// A class demonstrating Method Overloading
public class Calculator {

    // 1. Overloading by changing the NUMBER of parameters
    // This method handles the addition of two integers
    public int add(int a, int b) {
        return a + b;
    }

    // This method handles the addition of three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2. Overloading by changing the DATA TYPE of parameters
    // This method handles the addition of two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // 3. Overloading by changing the ORDER of parameters
    // This method accepts a String followed by an int
    public void displayInfo(String name, int id) {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    // This method accepts an int followed by a String
    public void displayInfo(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Main class to execute the code
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("--- Method Overloading Examples ---");

        // Calls the method with two int parameters
        int sum1 = calc.add(5, 10);
        System.out.println("Sum of two integers (5 + 10): " + sum1);

        // Calls the method with three int parameters
        int sum2 = calc.add(5, 10, 20);
        System.out.println("Sum of three integers (5 + 10 + 20): " + sum2);

        // Calls the method with two double parameters
        double sum3 = calc.add(5.5, 10.5);
        System.out.println("Sum of two doubles (5.5 + 10.5): " + sum3);

        System.out.println("\n--- Parameter Order Overloading ---");
        
        // Calls the method with (String, int)
        calc.displayInfo("Alice", 101);

        // Calls the method with (int, String)
        calc.displayInfo(102, "Bob");
    }
}
