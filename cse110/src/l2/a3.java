import java.util.Scanner;

public class a3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float maxi,mini;



        if(a>=b&& a>=c){
            maxi =a;
        }else if(b>=a&&b>=c){
            maxi=b;
        } else{
            maxi=c;
        }


        if (a<=b&&a<=c){
            mini=a;
        } else if(b<=a&&b<=c) {
            mini=b;
        } else{
            mini=c;
        }
        System.out.println("Maximum number is "+maxi);
        System.out.println("Minimum number is "+mini);


    }
}