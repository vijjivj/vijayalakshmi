package Array;

public class MultiMatrix {

	public static void main(String[] args) {

		int[][] matrixA = { {1, 2}, {3, 4}, {5, 6} };
        int[][] matrixB = { {7, 8, 9}, {10, 11, 12} };
        
        int numRowsA = matrixA.length;
        int numColsA = matrixA[0].length;
        int numRowsB = matrixB.length;
        int numColsB = matrixB[0].length;
        
        if (numColsA != numRowsB) {
            System.out.println("The number of columns in Matrix A must match the number of rows in Matrix B for multiplication.");
            return;
        }
        
        int[][] resultMatrix = new int[numRowsA][numColsB];
        
        for (int i = 0; i < numRowsA; i++) {
for (int j = 0; j < numColsB; j++) {
                for (int k = 0; k < numColsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("Matrix A:");
        printMatrix(matrixA);

        System.out.println("Matrix B:");
        printMatrix(matrixB);
        
        System.out.println("Matrix A * B:");
        printMatrix(resultMatrix);
    }
    
    private static void printMatrix(int[][] matrix) {
for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

        
	}

