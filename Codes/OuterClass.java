public class OuterClass {
    private int outerVar = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Outer class variable: " + outerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();            // Create an instance of the outer class
        OuterClass.InnerClass inner = outer.new InnerClass(); // Create an instance of the inner class
        inner.display(); // Output: Outer class variable: 10
    }
}
