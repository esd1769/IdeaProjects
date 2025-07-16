public class ass4{
    public static void main(String[] args) {
        double a=8;
        double d=a/2.0;
        double b=3;
        double side=Math.sqrt(d *d+b*b);
        //double side=5.0;
        double circumference =6*side;

        double area =6*((side*side*Math.sqrt(3)) / 4.0);
        System.out.println("circumference: "+circumference);
        System.out.println("area: "+area);
    }
}