package t7;

public class CellPhone {
    String[] arr= new String[3];

    String model="unknown";
    int count=0;
    public void printDetails(){
        System.out.println("Phone Model"+ model+"\n" + "Contacts Stored "+ count);
        if(count!=0){
            System.out.println("Stored Contacts:");
            for (int i=0;i<count ;i++){
           // for (int i=0;i<arr.length && arr[i]!=null ;I++){
                System.out.println(arr[i]);
            }
        }

    }
    public void storeContact(String str){
        if (count<3){
            arr[count]=str;
            count++;
            System.out.println("Contact Stored");

        }
        else{
            System.out.println("Memory full. New contact can't be stored.");
        }

    }
}
