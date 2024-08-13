package app;

public class Main {
    final static int N = 4;

    public static void main(String[] args) {
        int[][] numbers = new int[][]{
                {4, 9, 17, 33},
                {3, 5, 7, 50},
                {8, 14, 37, 11},
                {1, 6, 44, 25}
        };
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("Matrix 4x4: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers[i].length; k++) {
                System.out.print(numbers[i][k] + " ");
                if (i % 2 == 0) {
                    evenSum += numbers[i][k];
                } else {
                    oddSum += numbers[i][k];
                }
            }
            System.out.println();
        }
        System.out.print("\nThe sum of elements of even rows (0,2): " +
                evenSum +
                "\nThe sum of elements of odd rows (1,3): " + oddSum);

        int evenColumnSum = 1;
        int oddColumnSum = 1;

        for (int k = 0; k < numbers[0].length; k++) {
            for (int[] number : numbers) {
                if (k % 2 == 0) {
                    evenColumnSum *= number[k];
                } else {
                    oddColumnSum *= number[k];
                }
            }
        }
        System.out.println("\nThe sum of elements of even columns: " +
                evenColumnSum +
                "\nThe sum of elements of odd columns: " + oddColumnSum);

        int[][] matrix = {
                {4, 9, 17, 33},
                {3, 5, 7, 50},
                {8, 14, 37, 11},
                {1, 6, 44, 25}
        };
        boolean isMagSqr = true;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < N; i++) {
            sum += matrix[i][i];
            sum1 += matrix[i][N - 1 - i];
        }
        if (sum != sum1) isMagSqr = false;
        for (int i = 0; i < N; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != colSum || colSum != sum)
                isMagSqr = false;
        }
        if (isMagSqr)
            System.out.println("The matrix is a Magic Square");
        else
            System.out.println("The matrix is NOT a Magic Square");

    }
}






