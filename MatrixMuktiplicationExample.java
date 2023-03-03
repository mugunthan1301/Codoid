package java;

public class MatrixMuktiplicationExample {
	    public static void main(String[] args) {
	        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
	        int[][] secondMatrix = {{7, 8}, {9, 10}, {11, 12}};

	        int rowsInFirst = firstMatrix.length;
	        int columnsInFirst = firstMatrix[0].length;
	        int columnsInSecond = secondMatrix[0].length;

	        int[][] resultMatrix = new int[rowsInFirst][columnsInSecond];

	        for (int i = 0; i < rowsInFirst; i++) {
	            for (int j = 0; j < columnsInSecond; j++) {
	                for (int k = 0; k < columnsInFirst; k++) {
	                    resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	                }
	            }
	        }

	        // Print the result
	        for (int i = 0; i < rowsInFirst; i++) {
	            for (int j = 0; j < columnsInSecond; j++) {
	                System.out.print(resultMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

