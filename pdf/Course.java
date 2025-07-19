package t5;

import java.sql.SQLOutput;

public class Course {
  String name;
  String code;
  int credit;
    public void updateDetails(String s1,String s2,int s3){
        this. name=s1;
        this. code=s2;
        this. credit=s3;
    }

    public void displayCourse(){
    System.out.println("Course Name: "+name+"\n"+"Course Code: "+ code+"\n" + "Course Credit: "+credit);
  }
}
