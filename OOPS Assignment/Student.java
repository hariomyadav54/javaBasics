package p1;

public class Student {
    int rollnumber;
    String studname;
    int mark1;
    int mark2;
    int mark3;
    void setStudDetails(int r,String n,int m1,int m2,int m3){
        rollnumber=r;
        studname=n;
        mark1=m1;
        mark2=m2;
        mark3=m3;
      }
      void displayStudDetails(){
          System.out.println(rollnumber+" "+ studname);
      }
      void calculateTotal(){
          System.out.println(" Total marks "+(mark1+mark2+mark3));
      }
     }
     class StudentDemo {
         public static void main(String[] args) {
             Student s1 = new Student();
             Student s2= new Student();
             Student s3 = new Student();
             s1.setStudDetails(1,"Hari",10,20,30);
             s2.setStudDetails(2,"Rahul",5,10,15);
             s3.setStudDetails(3,"maxwell",20,30,40);
             s1.displayStudDetails();
             s2.displayStudDetails();
             s3.displayStudDetails();
             s1.calculateTotal();
             s2.calculateTotal();
             s3.calculateTotal();
         }
     }
