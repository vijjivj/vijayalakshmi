package Array;

public class MatrixAdd {

	public static void main(String[] args) {

		 int[][] matrixA = { {1, 2, 3}, {4, 5, 6} };
	        int[][] matrixB = { {7, 8, 9}, {10, 11, 12} };
	        
	        int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];
	        
	        for (int i = 0; i < matrixA.length; i++) {
	            for (int j = 0; j < matrixA[0].length; j++) {
	                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }
	        
	        System.out.println("Matrix A:");
	        printMatrix(matrixA);
	        
	        System.out.println("Matrix B:");
	        printMatrix(matrixB);

	 System.out.println("Matrix A + B:");
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
