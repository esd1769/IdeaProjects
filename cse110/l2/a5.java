import java.util.Scanner;

public class a5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the amount the customer need to pay(Taka)");
        int t=sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int g=sc.nextInt();

        if(g<t){
            int moreToPay=t-g;
            System.out.println("Please pay "+moreToPay+" taka more.");
        }

        else if(g==t) {
            System.out.println("The returned amount is 0 taka.");
        }

        else{
            int c=g-t;
            System.out.println("The returned amount is "+c+" taka.");
            int[] notes= {100,50,20,10};
            int[] coins ={5,2,1};

            for(int note:notes) {
                int count=c/note;
                System.out.println(note+" taka note: "+count);
                c%=note;}
            for(int co:coins) {
                int count=c/co;
                System.out.println(co+" taka coin: "+count);
                c%=co;
            }
        }

    }
}
