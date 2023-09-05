public class Multiplying_Two_Matrices {
    public static void main(String[] args) {

        int A[][] = {{3, 5, 9}, {7, 6, 2}, {4, 3, 5}};
        int B[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int C[][] = new int[A.length][B[0].length]; // e.g A=3x5 matrix and B=5x4 matrix then if we multiply  them : C= 3x4

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                C[i][j] = 0; // I initialize it because I am going to add all the elements is C
                for (int k = 0; k < 3; k++)
                {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        for (int x[] : C)
        {
            for(int y : x)
            {
                System.out.print(y + " ");

            }
            System.out.println("");
        }
    }
}
