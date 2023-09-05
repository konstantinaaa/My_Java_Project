import java.util.Scanner;

public class Calculate_Discount_using_varagrs {

    static double discount(double ...P)
    {
        int sum = 0;
        for(int i = 0; i < P.length; i++)

            sum += P[i];

        if(sum <= 500)
            return 0.1*sum; // 10%
        else if(sum > 500 && sum <=1000 )
            return 0.15*sum; // 15%
        else
            return 0.2*sum; // 20%

    }
    public static void main(String[] args) {

        System.out.println(discount(10,20,236.36,589));

    }
}
