package p1;
class clg {
    int roll;
    String name;
    int sal;
    void disp(){
        System.out.println("Enter you are roll:-  " + roll );
        System.out.println("Enter you are name:-  " + name);
    }
     int getsal(){
   return sal;
    }
}
public class objclg {
    public static void main(String[] args) {
        clg hari=new clg();
        clg maxwell= new clg();
        hari.roll=10;
        hari.name="hari";
        hari.sal=10;

        maxwell.roll=67;
        maxwell.name="maxwell";
        maxwell.sal=20;

        hari.disp();
        maxwell.disp();
        int sal=hari.getsal();
        int sal1=maxwell.getsal();
        System.out.println(" hari salary is   :- "+sal);
        System.out.println("maxwell salary is :- "+sal1);
    }
}
