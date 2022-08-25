import java.util.Scanner;
public class SumOfN {
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int sum = ((num)*(num+1))/2;
        System.out.println(sum);
    }
}
