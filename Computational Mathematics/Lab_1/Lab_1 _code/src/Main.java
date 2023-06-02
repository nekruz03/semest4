import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public  class Main {
    static boolean iscons = false;
    static boolean isgen = false;
    static boolean isfile = false;
    static Scanner sc;

    static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to enter matrix from file, console or generate? (Write a file or console, or generate)");
        String str = scanner.nextLine();

        while (true) {
            if (str.equalsIgnoreCase("file")) {
                isfile = true;
                break;
            } else if (str.equalsIgnoreCase("console")) {
                iscons = true;
                break;
            } else if (str.equalsIgnoreCase("generate")) {
                isgen = true;
                break;
            }
            System.out.println("Wrong input. Please, try again");
            str = scanner.nextLine();
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        getInfo();
        if (iscons || isgen) {
            sc = new Scanner(System.in);
            System.out.println("Enter a matrix size, accuracy, max count of steps");
        } else if (isfile) {
            File file = new File("test.txt");
            sc = new Scanner(file);
        }

        // size of matrix
        int n = sc.nextInt();
        Actions.size = n;

        //eplison
        double eplison = sc.nextDouble();
        Actions.epsilon = eplison;

        //   max count of steps
        int m = sc.nextInt();
        Actions.M = m;
        // init matrics
        double[][] matrix = new double[n][n + 1];
        if (iscons || isfile) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + 1; j++) {
                    matrix[i][j] = sc.nextDouble();
                }
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + 1; j++) {
                    double s =  (double) (Math.random() * + 70) - 3;
                    double scale = Math.pow(10, 3);
                    double result = Math.ceil(s * scale) / scale;
                    matrix[i][j] = result;
                }
            }
        }
            Actions.setMatrix(matrix);
            Actions.initMatrixX1andX2();
            Actions.startComputed();


//        2 2 10 14
//        10 1 1 12
//        2 10 1 13

    }
}
