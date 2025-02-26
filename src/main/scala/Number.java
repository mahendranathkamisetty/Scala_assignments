import java.util.Scanner;

public class Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=sc.nextInt();

        if(num<100 || num>1000){
            System.out.println("Wrong Number");
        }
        else{
            if(num%2==0){
                System.out.println("Even number");
                int rem=num%3;
                System.out.println("remainder after dividing with 3 is: "+rem);
            }
            else{
                System.out.println("odd number");
                int rem2=num%2;
                System.out.println("Remainder after dividing with 2 is: "+rem2);
            }
        }
        sc.close();
    }
}
