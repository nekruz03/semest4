import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputFunctions inputFunctions = new InputFunctions();
        RectangleMethod rectangleMethod = new RectangleMethod();

        while (true) {
            int functionNumber = inputFunctions.inputFunction();
            if (functionNumber != 0) {
                int methodNumber = inputFunctions.inputMethodOfRectangles();
                double a = inputFunctions.inputA();
                double b = inputFunctions.inputB();
                double e = inputFunctions.inputE();
                switch (methodNumber){
                    case (1) -> rectangleMethod.startMethodRight(a, b, e, functionNumber);
                    case (2) -> rectangleMethod.startMethodLeft(a,b,e,functionNumber);
                    case (3) -> rectangleMethod.startMethodMid(a,b,e,functionNumber);
                    default -> {
                        rectangleMethod.startMethodRight(a, b, e, functionNumber);
                        rectangleMethod.startMethodLeft(a, b, e, functionNumber);
                        rectangleMethod.startMethodMid(a, b, e, functionNumber);
                    }
                }
            }
        }
    }
}