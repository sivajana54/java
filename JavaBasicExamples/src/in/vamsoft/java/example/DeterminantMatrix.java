package in.vamsoft.java.example;

import java.util.Scanner;

public class DeterminantMatrix {
  /** The Given Program DeterminantMatrix .
   * @param A.
   * @param N.
   * @return value.
   */
  public double determinant(double A[][], int N) {
    double value = 0;
    if (N == 1) {
      value = A[0][0];
    } else if (N == 2) {
      value = A[0][0] * A[1][1] - A[1][0] * A[0][1];
    } else {
      value = 0;
      for (int j1 = 0; j1 < N; j1++) {
        double[][] m = new double[N - 1][];
        for (int k = 0; k < (N - 1); k++) {
          m[k] = new double[N - 1];
        }
        for (int i = 1; i < N; i++) {
          int j2 = 0;
          for (int j = 0; j < N; j++) {
            if (j == j1) {
              continue;
            }
            m[i - 1][j2] = A[i][j];
            j2++;
          }
        }
        value += Math.pow(-1.0, 1.0 + j1 + 1.0) * A[0][j1] * determinant(m, N - 1);
      }
    }
    return value;
  }

  /** DeterminantMatrix Main Method.
   * @param args.
   */
  public static void main(String[] args) {
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the order of the square matrix");
      int n = input.nextInt();

      System.out.println("Enter the elements of the square matrix");
      double[][] mat = new double[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          mat[i][j] = input.nextDouble();
        }
      }

      DeterminantMatrix I = new DeterminantMatrix();

      System.out.println("The determinant of the Matrix is : " + I.determinant(mat, n));

      input.close();

    }

  }
}
