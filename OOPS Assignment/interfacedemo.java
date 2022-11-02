package p1;

import java.util.Scanner;
interface interfaceDemo {
    void input ();
    void output();
}
class Hari implements interfaceDemo {
    String name;
    double sal;
     public void  input (){
        Scanner sc = new Scanner(System.in);
        System.out.println("pls enter you are name");
        name = sc.nextLine();
        System.out.println("pls enter ur sal");
        sal =sc.nextInt();
    }
       public void output(){
         System.out.println("you are name:- "+name+" "+" and you are sal is :-"+sal);
    }
    public static void main(String[] args) {
        interfaceDemo r = new Hari();
        r.input();
        r.output();
    }
   }
