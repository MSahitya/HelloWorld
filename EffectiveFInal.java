package LambdaExpressions_V1;

public class EffectiveFInal {
    public static void main(String[] args) {
        //i. What is effectively final
        int x = 10; // Effectively final (implicitly)

        Runnable runnable = () -> {
            System.out.println(x);
        };
        //The variable x is assigned a value and is not reassigned within the scope where the lambda expression
        // is defined.Therefore it's considered effectively final,

        //ii. What is the violation of Effective final
        int y = 5;

        Runnable runnable = () -> {
            y = y + 1; // This would cause a compilation error
            System.out.println(y);
        };
        //The variable y is reassigned within the lambda expression's scope.
        //This violates the effectively final rule, and the code will not compile.
       // Conclusion:
       // Immutability: The effectively final rule promotes immutability within lambda expressions, which is a core principle in functional programming.
             //   Thread Safety: By capturing effectively final variables, the lambda expression avoids issues related to data races and thread safety.
       // In essence, the "effectively final" rule ensures that variables captured by lambda expressions are immutable and thread-safe, contributing to the overall robustness and predictability of your code.


    }
}
