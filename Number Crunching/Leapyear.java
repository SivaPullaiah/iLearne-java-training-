import java.util.*;
public class Leapyear
{
    public static void main(String[] args)
    {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                   if(year%400==0)
                    System.out.println(year+" is a Leap year");
                else
                    System.out.println(year+" Not a Leap year");
            }
            else
                System.out.println(year+" is Leap year");
        }
        else
            System.out.println(year+" Not a Leap year");
    }
}