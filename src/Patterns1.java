public class Patterns1 {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("===============");

        for(int i = 1; i <=5; i++)
        {
            for(int j = 1; j <=5; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("===========");

        for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf(i + j + " ");
            }
            System.out.println();
        }
        System.out.println("==========");

        int count = 0;
        for(int i =1; i <= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                System.out.printf("%02d ", count);
                count++;
            }
            System.out.println();
        }
    }
}
