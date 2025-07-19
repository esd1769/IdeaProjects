package t1;

public class UniversityTester {
    //Write the main method and create 2 objects of University class and print the location of the objects and print the instance variables of the objects. Are the location of the objects the same?
    public static void main(String[] args) {
        University u1=new University();
        University u2=new University();
        System.out.println(u1);
        System.out.println(u2);

        if (u1==u2){
            System.out.println("same location");
        }
        else{
            System.out.println("not same location");
        }
        System.out.println(u1.name);
        System.out.println(u1.country);
        System.out.println(u2.name);
        System.out.println(u2.country);
        u1.name = "Imperial College London";
        u1.country ="England";
        u2.name ="Brac University";
        u2.country ="Bangladesh";

        //check with previous value

        if (u1.name!=null){
            System.out.println("changed");
        }
        else{
            System.out.println("not");
        }
        if (u2.name!=null){
            System.out.println("changed");
        }
        else{
            System.out.println("not");
        }

        if (u1.country!=null){
            System.out.println("changed");
        }
        else{
            System.out.println("not");
        }

        if (u2.country!=null){
            System.out.println("changed");
        }
        else{
            System.out.println("not");
        }
        //check with object value
        if (u1.name==u2.name){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
        if (u1.country==u2.country){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }






    }
}
