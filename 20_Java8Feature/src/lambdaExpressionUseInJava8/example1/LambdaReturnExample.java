package lambdaExpressionUseInJava8.example1;

@FunctionalInterface
interface Square {
    int calculate(int x);
}

public class LambdaReturnExample {
    public static void main(String[] args) {
        // Single-line lambda (return keyword NOT required)
        Square square1 = x -> x * x;  
        System.out.println(square1.calculate(5)); // Output: 25

        // Multi-line lambda (return keyword REQUIRED)
        Square square2 = x -> { 
            System.out.println("Calculating square...");
            return x * x; 
        };
        System.out.println(square2.calculate(6)); // Output: Calculating square... 36
    }
}
