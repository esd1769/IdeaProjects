package l2;

import java.util.Scanner;

public class a2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        float p=sc.nextFloat();
        int age=sc.nextInt();

        float tax=0;

        if (age>=18){
            if (p>=10000&&p<=20000) {
                tax=p*0.05f;
            } else if(p>20000) {
                tax=p*0.10f;
            }
        }
        System.out.println("Your tax amounts in "+(int)tax+" Tk");

    }
}