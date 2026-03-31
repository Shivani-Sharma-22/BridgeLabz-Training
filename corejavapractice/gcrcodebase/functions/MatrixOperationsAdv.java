package gcrcodebase.functions;

import java.util.Scanner;

public class MatrixOperationsAdv {

    // Method to create random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + (int)(Math.random() * 9);
            }
        }
        return matrix;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Method to find transpose
    public static double[][] transpose(double[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        double[][] t = new double[c][r];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }

    // Determinant of 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);

        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;

        return inv;
    }

    // Inverse of 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2]-m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2]-m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2]-m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2]-m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2]-m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2]-m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1]-m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1]-m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1]-m[0][1]*m[1][0]) / det;

        return inv;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        double[][] matrix = createRandomMatrix(r, c);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (r == 2 && c == 2) {
            System.out.println("\nDeterminant (2x2): " + determinant2x2(matrix));
            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        }

        if (r == 3 && c == 3) {
            System.out.println("\nDeterminant (3x3): " + determinant3x3(matrix));
            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("Inverse:");
                displayMatrix(inv);
            }
        }
    }
}
