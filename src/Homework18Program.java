public class Homework18Program {
    public static void main(String[] args) {
        int size = 8;

        int[][] trainingMatrix = createTrainingMatrix(size);
        printMatrix(trainingMatrix);
    }

    private static int[][] createTrainingMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = size - j;
                }
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < (matrix[i].length - 1)) {
                    System.out.print(',');
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
