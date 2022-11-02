package p1;

public class ConstructerStudent {
    int rollnumber;
    String studname;
    int mark1;
    int mark2;
    int mark3;
    ConstructerStudent(int r,String n,int m1,int m2,int m3){
        this.rollnumber=r;
        this.studname=n;
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;
    }
    void displayStudDetails(){
        System.out.println(rollnumber+" "+ studname);
    }
    void calculateTotal(){
        System.out.println(" Total marks "+(mark1+mark2+mark3));
    }
}
class StudentDemo1 {
    public static void main(String[] args) {
        ConstructerStudent s1 = new ConstructerStudent(1,"Hari",45,20,30);
        ConstructerStudent s2= new ConstructerStudent(2,"Rahul",10,10,15);
        ConstructerStudent s3 = new ConstructerStudent(3,"maxwell",20,30,40);
        s1.displayStudDetails();
        s2.displayStudDetails();
        s3.displayStudDetails();
        s1.calculateTotal();
        s2.calculateTotal();
        s3.calculateTotal();
    }
}
